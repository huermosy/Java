/*
������ͬ������Ƕ����ͬ����
�����������Է���ʱ�������ˡ�A����B�Ŀ��ӣ�B����A�Ŀ��ӡ������������˶��Բ��˷��ˡ�
��۵����⣺����A����B�Ķ���������B����A�Ķ��������ǻ���֮���ֲ���Ȩ�ޡ�
*/
 
class Ticket implements Runnable//extends Thread
{
	private static int tickets = 1000;
	static Object obj = new Object();
	boolean flags = true;
	public void run()     // ��ͬ���������
	{
		if(flags)
			while(true)  // 
			{	 
				synchronized(obj)   // obj����this��
				{
					show();         
				}
			}
		else
		{
			while(true)
				show();    // show����һ��Ҫ��������ã�ǰ��ʡ�ԵĶ�����this
		}
	}

	public static synchronized void show()      // �����ͬ������������this
	{
		synchronized(obj)    // this������object��
		{
			if(tickets>0)
			{
				try{Thread.sleep(10);} catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+"----show:"+ tickets--);
			}
		}
	}
}


class DeadLockDemo
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