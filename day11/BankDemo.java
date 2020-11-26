/*
需求：银行有一个金库，有两个储户分别存300元，每次存100元，有3次。
问 该程序是否有安全问题？如果有，该怎么解决？

如何找问题？
1.看一下哪些代码是多线程运行的代码;
2.看一下哪些数据是共享的数据;
3.看一下多线程运行的代码中哪些是在操作共享数据的。

发现存的钱都是乱的。

同步函数：同步这个关键字可以作为修饰符修饰函数。
*/


class Bank             // 银行这一个类
{
	private int sum=0;
//	Object obj = new Object();
	public synchronized void deposit(int n)     // 存钱这一个方法
	{
//		synchronized(obj)   这里的代码是在操作共享数据，并且放在run中调用，所以是多线程所运行的代码。
			
		sum += n;
		System.out.println("现在有的钱为："+sum + "元");
			
	}
}

class Customer implements Runnable       // 实现了一个Runnable接口
{
	Bank c = new Bank();     // 实例化一个对象
	public void run()
	{
		for(int x=0; x<3; x++)
		{
			c.deposit(100);    // 存三次钱，每次都是100元。
		}
	}
}

class  BankDemo
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();     // 实例化对象
		Thread c1 = new Thread(c);       // 开始创建线程
		Thread c2 = new Thread(c);
		c1.start();                 // 开启线程。
		c2.start();

		//System.out.println("Hello World!");
	}
}
