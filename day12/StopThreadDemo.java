/*
stop方法已经过时，
如何停止线程？只有一种，run方法结束。
开启多线程运行，运行代码通常是循环结构。

只要控制住循环就可以让run方法结束，也就是线程结束，


多线程：停止线程
具体程序的实现： 创建一个StopThread 用来继承Runnable类，并且在里面重写run方法，  StopThread里面有的私有变量有 flag（boolean类），
定义一个控制标识符真假的方法

Interrupt方法将处于冻结的线程强制恢复到运行状态上。


Thread提供 interrupt()方法。

特殊情况：当线程处于冻结状态，就不会读取到标记，线程就不会结束。
*/

class StopThread implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"Exception");
				//flag = false;       // 将标志位置为0；
			}
		 	System.out.println(Thread.currentThread().getName()+"------run");
	}
	public void changeflags()
	{
		flag = false;
	}
}

class  StopThreadDemo
{
	public static void main(String[] args) 
	{
		StopThread st = new StopThread();

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		//开启线程
		t1.setDaemon(true);   // 守护线程,主线程与守护线程的关系
		t2.setDaemon(true);     

		t1.start();
		t2.start();

		// 写一个循环运行代码
		int num = 0;
		while(true)
		{
			if(num++ == 60)
			{
				//st.changeflags();
				//t1.interrupt();    // 抛出异常
				//t2.interrupt();
				st.changeflags();   //  在interrupt之后，需要再将flags置为0，然后才不会再次进入冻结状态。
				break;
			}
			System.out.println(Thread.currentThread().getName()+" run----"+num);

		}
 		System.out.println("over!");
	}
}
