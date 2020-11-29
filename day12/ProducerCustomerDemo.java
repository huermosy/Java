/*
��ʵ�е������Ʒ���������������ߡ�������������2λ����������2λ��

��1.0�汾�г�������������2�ε�ԭ���ǣ���һ��sell���������������ߵĻ�����ֱ�Ӵ�try�������份�ѵģ�
Ҳ����˵t1��t2�ڻ��ִ��Ȩ֮��t1������t2����Ҫͨ����������жϣ�����ֱ�Ӵӵȴ�״̬��ʼ����


��ʵ������һ������ģ������������������ߵĻ��������while��notifyAll�����һЩ���⡣

���ڶ���������������ߣ�
ΪʲôҪ����while�жϱ�ǣ�
ԭ���ñ����ѵ��߳���һ���жϱ�ǡ�

Ϊʲô����notifyAll��
��Ϊ��Ҫ���ѶԷ��̣߳���Ϊֻ�õ�notify�����׳��ֻ��ѱ����̵߳���������³����е������̶߳��ȴ���

*/


class Resource
{
	private String name;   // ��Ʒ������
	private boolean flag = false;  // ��ʼ����ʶ��Ϊfalse
	private int count = 0;   // ��ʼ������Ϊ0
	
	public synchronized void sell(String name)
	{
		 // ������2����������2��������
		while(this.flag)
			try{this.wait();}catch(Exception e){}    // 
		this.name = name+"-----"+ count++;
		 
		System.out.println(Thread.currentThread().getName()+ "������+++++++"+ this.name );
		flag = true;       // ������Խ�������״̬
		this.notifyAll();
	}

	public synchronized void out(String name)
	{
		 
		while(!this.flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+"-----------������"+ this.name );
		flag = false;       // ������Խ�������״̬
		this.notifyAll();
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
			res.sell("�̲�");
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
			res.out("�̲�");
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
