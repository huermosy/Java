// 写一个死锁的例子      A中有B，B中有A
// 存在一些问题不知道怎么解决，就是最后运行的时候不会发生死锁的情况


class Test implements Runnable
{
    static boolean flags;
	Test(boolean flags)
	{
		this.flags = flags;
	}

	public void run()
	{
		if(flags)
		{
			while(true)
			{
				synchronized(Mylock.locka)        // 这是类名调用方法，所以对象要用静态
				{
					System.out.println("if-a");
					synchronized(Mylock.lockb)
					{
						System.out.println("if-b");	
					}
				}
			}
		}
		else
		{
			 while(true)
			{
				synchronized(Mylock.lockb)
				{
					System.out.println("else-b");
					synchronized(Mylock.locka)
					{
						System.out.println("else-a");	
					}
				}
			}
		}
	}
}


class Mylock
{
	static Object locka = new Object();      // 写静态的目的：方便调用，可以用类名进行调用。
	static Object lockb = new Object();
}


class  DeadLockTest
{
	public static void main(String[] args) 
	{
		Test t = new Test(true);
		Thread t1 = new Thread(new Test(true));     // 创建两个线程
		Thread t2 = new Thread(new Test(false));
		t1.start();
		t.flags = false;
//		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();
	}
}
