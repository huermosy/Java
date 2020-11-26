/*
进程：是一个正在执行的程序。
		每一个进程都有一个执行顺序，该顺序是一个执行路径，或者叫一个控制单元。
线程： 就是进程中的一个独立的控制单元。 线程控制着进程的执行。

一个进程中至少有一个线程。

java VM 启动的时候会有一个进程java.exe。

该进程中至少一个线程负责java程序的运行。
而且这个线程运行的代码存在于main方法中。
该线程称之为主线程。

扩展：更细节的jvm，jvm启动不止一个线程，还有负责垃圾回收的线程

创建线程的第一种方式：继承Thread类：
步骤：1.继承Thread类；
2.重写run方法；
3.调用start方法
该方法有两个方法：1.启动线程；2.调用run()方法。


我们可以看到每次打印的结果都是不同的，因为多线程的关系
多个线程都能获取cpu的执行权，哪个线程在运行由cpu来决定。

形象地理解cpu的运行其实是在抢夺cpu的使用权。

因此多线程的运行有一个特点：随机性。  谁抢到谁说的算，至于到底谁能抢到由cpu说的算。
*/


class Demo extends Thread
{
	public void run()
	{
		for(int x =0; x<60; x++)
		{
			System.out.println("Demo run:"+x);
			
		}
	}
}

class  ThreadDemo
{
 
	public static void main(String[] args)    // 在主函数中再创建一个Demo的Thread，看一下输出的结果。
	{
		Demo d = new Demo();
		//d.start();
		d.start();   // 看一下start的作用，如果只调用run的话就没有启动线程，  这个程序就相当于是一个单线程的程序。
		for(int x =0; x<60; ++x)
		{
			System.out.println("Hello World!:"+x);
			//System.out.println(x);    
		}
	}
}
		