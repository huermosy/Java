/*
多线程间通信-生产者消费者JDK5.0升级版
学习到了condition， await函数,signal函数以及lock与unlock()函数; 其中await和signal可以类比wait和notify


JDK1.5新特性   提供了多线程升级解决方案
将synchronized 用lock锁来代替执行
将wait()和notify()/notify()用 condition对象中的await()以及signal来代替执行
condition对象可以通过lock锁来进行获取。
本例中实现了只唤醒对方的操作。

lock与synchronized 的区别：lock这一个锁上可以有多个相关的condition，而synchronized这个关键字里面只能对应有一组相关的wait和notify
*/

import java.util.concurrent.locks.*;       // 引入对应的库名

class Resource
{
	private String name;   // 商品的名称
	private boolean flag = false;  // 初始化标识符为false
	private int count = 0;   // 初始化计数为0
	private Lock lock = new ReentrantLock();

	// 分别创建一个生产者对象和消费者对象
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();

	public void sell(String name)throws InterruptedException                // 因为方法中没有catch所以要抛
	{
		lock.lock();      // 拿到锁
		try
		{
			while(flag)
				condition_pro.await();    // 如果flag为true的话，那么生产者等待
			this.name = name+"-----"+ count++;
			 
			System.out.println(Thread.currentThread().getName()+ "生产者+++++++"+ this.name );
			flag = true;       // 代表可以进入阻塞状态
			condition_con.signal();    // 唤醒消费者

		}
		finally
		{
			lock.unlock();          // 释放锁，释放锁的操作一定要执行
		}
	}

	public void out(String name)throws InterruptedException         
	{
		lock.lock();       // 拿到锁
		try
		{
			 
		while(!flag)
			 condition_con.await(); // 如果flag为false的话，那么消费者等待
		System.out.println(Thread.currentThread().getName()+"-----------消费者"+ this.name );
		flag = false;       // 代表可以进入阻塞状态
		condition_pro.signal();   // 唤醒生产者，
		}
		finally
		{
			lock.unlock();     // 放弃锁
		}
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
			try
			{
				res.sell("奶茶");
			}
			catch (InterruptedException e)
			{
			}
			 
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
			try
			{
				res.out("奶茶");
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}

class ProducerConsumerDemo2
{
	public static void main(String[] args) 
	{
		Resource r = new Resource();

		Customer c1 = new Customer(r);
		Producer p1 = new Producer(r);

		// 开启4个线程。
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
