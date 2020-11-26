/*
需求：简单的卖票程序;   多个窗口同事买票。

多线程的第二种算法：  接口Runnable
步骤：
1.定义一个类名实现Runnable接口
2.重写其中的run方法
	该线程要运行的代码存放在run方法之中

3.通过建立多个Thread类建立多个线程
4.通过将Runnable的子类实例化后的参数传给Thread类中构造函数
	为什么要将Runnable建立的子类对象传递给Thread类的构造函数？
	因为自定义的run方法所属的对象是Runnable接口的子类对象。
	所以要让线程去执行指定对象的run方法，就必须明确该方法所述的对象

5.通过Thread类的start方法启动线程，并且调用的是Runnable中的run方法。

实现方式和继承方式有什么区别？
继承方式是有单继承的局限性，在定义线程的时候，用实现的方式比较合理。

两种方式的区别：
1.继承方式的代码存放于Thread子类run方法中；
2.实现方式存放在Runnable接口的子类的run方法中。

*/

class Ticket implements Runnable//extends Thread
{
	private static int tickets = 100;
	public void run()
	{
		while(true)
		{
			if(tickets>0)
			{
				 
				System.out.println(Thread.currentThread().getName()+"----sell out:"+(tickets--));
			}
		}
	}
}


class TicketDemo 
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
