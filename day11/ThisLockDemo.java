/*
��С������֤��ͬ�������õ�����this��
 
 ʹ�������߳�����Ʊ��
 һ���߳���ͬ��������У���һ���߳���ͬ�������С�
 ����ִ����Ʊ�Ķ�����

*/
 
class Ticket implements Runnable//extends Thread
{
	private int tickets = 100;
	Object obj = new Object();
	boolean flags = true;
	public void run()     // ��ͬ���������
	{
		if(flags)
			while(true)  // 
			{	 
				synchronized(this)   // ע��������Ҫͬ���Ĵ��룬tickets�����Ա����Ҫͬ���ģ�����ֻҪ��������ticketsӦ�÷ŵ����档  ����������Ķ�����this�Ļ�����ɰ�ȫ���⡣
				{
					if(tickets>0)
					{
						try{Thread.sleep(10);} catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+"----sell out:"+ tickets--);
					}
				}
			}
		else
		{
			while(true)
				show();    // show����һ��Ҫ��������ã�ǰ��ʡ�ԵĶ�����this
		}
	}

	public synchronized  void show()      // �����ͬ������������this
	{
		if(tickets>0)
		{
			try{Thread.sleep(10);} catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"----show:"+ tickets--);
		}
	}
}


class ThisLockDemo
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();       // ����ʵ��

		Thread t1 = new Thread(t);        // Thread �����Ѿ���ʶ��һ��Runnable���͵Ĳ���
		Thread t2 = new Thread(t);
 
		t1.start();
		
		try{Thread.sleep(10);}catch(Exception e){}     // ����10ms��ʹ�����ܹ�������t1�������
		t.flags = false;
		t2.start();
 
		//System.out.println("Hello World!");
	}
}