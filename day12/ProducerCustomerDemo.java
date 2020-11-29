/*
现实中的事物：商品，生产者与消费者。其中生产者有2位，消费者有2位。

在1.0版本中出现生产者生产2次的原因是：第一个sell（）函数中生产者的唤醒是直接从try后面的语句唤醒的，
也就是说t1，t2在获得执行权之后，t1唤醒了t2后不需要通过条件语句判断，，就直接从等待状态开始运行


其实还是有一点问题的，两个消费者与生产者的话如果不用while与notifyAll会出现一些问题。

对于多个生产者与消费者，
为什么要定义while判断标记？
原因：让被唤醒的线程在一次判断标记。

为什么定义notifyAll，
因为需要唤醒对方线程，因为只用到notify，容易出现唤醒本方线程的情况，导致程序中的所有线程都等待。

*/


class Resource
{
	private String name;   // 商品的名称
	private boolean flag = false;  // 初始化标识符为false
	private int count = 0;   // 初始化计数为0
	
	public synchronized void sell(String name)
	{
		 // 假设有2个生产者与2个消费者
		while(this.flag)
			try{this.wait();}catch(Exception e){}    // 
		this.name = name+"-----"+ count++;
		 
		System.out.println(Thread.currentThread().getName()+ "生产者+++++++"+ this.name );
		flag = true;       // 代表可以进入阻塞状态
		this.notifyAll();
	}

	public synchronized void out(String name)
	{
		 
		while(!this.flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+"-----------消费者"+ this.name );
		flag = false;       // 代表可以进入阻塞状态
		this.notifyAll();
	}

}

class Producer implements Runnable // 卖家类
{
	private Resource res;
	Producer(Resource res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			res.sell("奶茶");
		}
	}
}

class Customer implements Runnable   // 顾客类
{
	private Resource res;       // 创建一个Resource类的引用
	Customer(Resource res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			res.out("奶茶");
		}
	}
}

class ProducerCustomerDemo 
{
	public static void main(String[] args) 
	{
		Resource r = new Resource();

		Customer c1 = new Customer(r);
		Producer p1 = new Producer(r);

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		Thread t3 = new Thread(p1);
		Thread t4 = new Thread(p1);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//System.out.println("Hello World!");
	}
}
