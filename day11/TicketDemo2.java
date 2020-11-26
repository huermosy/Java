/*
需求： 多线程所存在的安全问题。

通过分析：发现数据中会出现小于0的负数，那是因为在执行代码的时候，启动线程，但是当这个线程还没有运行完的时候，另一个线程开始执行语句，导致共享数据的错误。

Thread类中的sleep用来模拟休眠。因为要抛出异常，所以用

解决方法：通过synchronized关键字，实现数据之间的同步。
synchronized(对象)
{
	要同步的代码;
}


可以拿在火车上上卫生间的问题来进行类比----经典

对象如同锁，持有锁的线程可以在同步中执行，如果没有锁的线程即使获取了cpu的控制权也不能够进去，因为没有锁。  

同步的前提：
1、必须是要有两个或两个以上的线程
2、必须是多个线程用同一个锁; (在A车的人不能到B车的卫生间上厕所)

好处：解决了多线程的安全问题；
弊端：多线程需要判断锁，较为消耗资源。
*/

class Ticket implements Runnable//extends Thread
{
	private int tickets = 280;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			 
			synchronized(obj)   // 注意这里是要同步的代码，tickets这个成员是需要同步的，所以只要代码中有tickets应该放到里面
				{
				if(tickets>0)
					{
						try
						{
							Thread.sleep(10);    // 10毫秒的延时。让线程停一下
						}
						catch(Exception e)     // 不能抛出，只能try；接口的一场不能够抛出，只能够try。 中断异常不会产生。
						{
						}
						System.out.println(Thread.currentThread().getName()+"----sell out:"+ tickets--);
					}
			}
		}
	}
}


class TicketDemo2
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();       // 创建实例

		Thread t1 = new Thread(t);        // Thread 类中已经认识了一个Runnable类型的参数
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
 
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();    // 这种方法卖票卖的不协调
		//System.out.println("Hello World!");
	}
}
