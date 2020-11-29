/*
���̼߳�ͨ��-������������JDK5.0������
ѧϰ����condition�� await����,signal�����Լ�lock��unlock()����; ����await��signal�������wait��notify


JDK1.5������   �ṩ�˶��߳������������
��synchronized ��lock��������ִ��
��wait()��notify()/notify()�� condition�����е�await()�Լ�signal������ִ��
condition�������ͨ��lock�������л�ȡ��
������ʵ����ֻ���ѶԷ��Ĳ�����

lock��synchronized ������lock��һ�����Ͽ����ж����ص�condition����synchronized����ؼ�������ֻ�ܶ�Ӧ��һ����ص�wait��notify
*/

import java.util.concurrent.locks.*;       // �����Ӧ�Ŀ���

class Resource
{
	private String name;   // ��Ʒ������
	private boolean flag = false;  // ��ʼ����ʶ��Ϊfalse
	private int count = 0;   // ��ʼ������Ϊ0
	private Lock lock = new ReentrantLock();

	// �ֱ𴴽�һ�������߶���������߶���
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();

	public void sell(String name)throws InterruptedException                // ��Ϊ������û��catch����Ҫ��
	{
		lock.lock();      // �õ���
		try
		{
			while(flag)
				condition_pro.await();    // ���flagΪtrue�Ļ�����ô�����ߵȴ�
			this.name = name+"-----"+ count++;
			 
			System.out.println(Thread.currentThread().getName()+ "������+++++++"+ this.name );
			flag = true;       // ������Խ�������״̬
			condition_con.signal();    // ����������

		}
		finally
		{
			lock.unlock();          // �ͷ������ͷ����Ĳ���һ��Ҫִ��
		}
	}

	public void out(String name)throws InterruptedException         
	{
		lock.lock();       // �õ���
		try
		{
			 
		while(!flag)
			 condition_con.await(); // ���flagΪfalse�Ļ�����ô�����ߵȴ�
		System.out.println(Thread.currentThread().getName()+"-----------������"+ this.name );
		flag = false;       // ������Խ�������״̬
		condition_pro.signal();   // ���������ߣ�
		}
		finally
		{
			lock.unlock();     // ������
		}
	}

}

class Producer implements Runnable // ������
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
				res.sell("�̲�");
			}
			catch (InterruptedException e)
			{
			}
			 
		}
	}
}

class Customer implements Runnable   // �˿���
{
	private Resource res;       // ����һ��Resource�������
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
				res.out("�̲�");
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

		// ����4���̡߳�
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
