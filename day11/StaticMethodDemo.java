/*
用小程序来证明静态同步函数用的锁是class。
 
因为静态函数运行时，还没有创建本类的对象，所以不能使用this。
但是可以用到的是所属代码中的本类的字节码文件  类名.class

在使用synchronized(类名)后，发现同步，也不会造成安全问题。

*/
 
class Ticket implements Runnable//extends Thread
{
	private static int tickets = 100;
	Object obj = new Object();
	boolean flags = true;
	public void run()     // 在同步代码块中
	{
		if(flags)
			while(true)  // 
			{	 
				synchronized(Ticket.class)   // 注意这里是要同步的代码，tickets这个成员是需要同步的，所以只要代码中有tickets应该放到里面。  如果这个里面的对象不是this的话会造成安全问题。
				{
					if(tickets>0)
					{
						try{Thread.sleep(10);} catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+"----sell out:"+ tickets--);
					}
				}
			}
		else
		{
			while(true)
				show();    // show方法一定要备对象调用，前面省略的对象是this
		}
	}

	public static synchronized void show()      // 这里的同步函数的锁是this
	{
		if(tickets>0)
		{
			try{Thread.sleep(10);} catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"----show:"+ tickets--);
		}
	}
}


class StaticMethodDemo
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();       // 创建实例

		Thread t1 = new Thread(t);        // Thread 类中已经认识了一个Runnable类型的参数
		Thread t2 = new Thread(t);
 
		t1.start();
		
		try{Thread.sleep(10);}catch(Exception e){}     // 休眠10ms，使程序能够在上面t1这里调用
		t.flags = false;
		t2.start();
		//System.out.println("Hello World!");
	}
}
