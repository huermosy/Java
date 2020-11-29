/*
for(int x=0; x<100; x++)
{
	System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
}
如果这样的代码有三轮循环，如此下去运行三次，如果其中的x基数比较大的话，那么就必须运行好这个代码块后才能接下运行第二个代码块，
多线程的好处是能够是代码块并发运行。

什么时候会用到线程呢？
答：当程序需要并行运行时，需要把每个线程封装起来，然后一起并行运行。
	用三种方法实现 多线程的封装
*/
class  ThreadTest
{
	public static void main(String[] args) 
	{
		new Thread()
		{
			public void run()
			{
				for(int x=0; x<100; x++)
				{
					System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
				}
			} 
		}.start();       // 用Thread()函数中断的方式

		Runnable r = new Runnable()    // 使用接口实现的方法。
		{
			public void run()
			{
				for(int x=0; x<=100; x++)
				{
					System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
				}
			}
		};

		new Thread(r).start();   // 注意这里调用只能从Thread开始调用。

		Demo d = new Demo();
		d.start();
	}
}


class Demo extends Thread     // 单独封装一个类出来
{
	public void run()
	{
		for(int x=0; x<100; x++)
		{
			System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
		}
	}
}
 