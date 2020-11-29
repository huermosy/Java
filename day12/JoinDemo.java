/*
.join方法：当A线程执行时碰到B线程的.join方法时，就会让出执行权，等B线程都执行完，才会让A线程执行。

join可以临时加入线程运行。

这个程序中的main函数会交出执行权，在t1运行完后才会得到执行权。

*/


class Demo implements Runnable
{
	public void run()
	{
		for(int x=0; x<70; x++)
		{
			System.out.println(Thread.currentThread().getName()+"~~~~~~~~run---"+x);
			Thread.yield();    // 放弃当前拥有的控制权，使得循环能够执行。
		}
	}
}


class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException      // 抛出Interrupted异常
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();
		//t1.join();
		t1.setPriority(Thread.MAX_PRIORITY);        // 将t1设置为最大的优先级。
		t2.start();
		//t1.join();      // 

		for(int x=0; x<60 ; x++ )
		{
//			System.out.println(Thread.currentThread().getName()+"------run---"+x);
		}
		System.out.println("over!");
		//System.out.println("Hello World!");
	}
}
