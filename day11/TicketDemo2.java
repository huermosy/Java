/*
���� ���߳������ڵİ�ȫ���⡣

ͨ�����������������л����С��0�ĸ�����������Ϊ��ִ�д����ʱ�������̣߳����ǵ�����̻߳�û���������ʱ����һ���߳̿�ʼִ����䣬���¹������ݵĴ���

Thread���е�sleep����ģ�����ߡ���ΪҪ�׳��쳣��������

���������ͨ��synchronized�ؼ��֣�ʵ������֮���ͬ����
synchronized(����)
{
	Ҫͬ���Ĵ���;
}


�������ڻ�������������������������----����

������ͬ�������������߳̿�����ͬ����ִ�У����û�������̼߳�ʹ��ȡ��cpu�Ŀ���ȨҲ���ܹ���ȥ����Ϊû������  

ͬ����ǰ�᣺
1��������Ҫ���������������ϵ��߳�
2�������Ƕ���߳���ͬһ����; (��A�����˲��ܵ�B�����������ϲ���)

�ô�������˶��̵߳İ�ȫ���⣻
�׶ˣ����߳���Ҫ�ж�������Ϊ������Դ��
*/

class Ticket implements Runnable//extends Thread
{
	private int tickets = 280;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			 
			synchronized(obj)   // ע��������Ҫͬ���Ĵ��룬tickets�����Ա����Ҫͬ���ģ�����ֻҪ��������ticketsӦ�÷ŵ�����
				{
				if(tickets>0)
					{
						try
						{
							Thread.sleep(10);    // 10�������ʱ�����߳�ͣһ��
						}
						catch(Exception e)     // �����׳���ֻ��try���ӿڵ�һ�����ܹ��׳���ֻ�ܹ�try�� �ж��쳣���������
						{
						}
						System.out.println(Thread.currentThread().getName()+"----sell out:"+ tickets--);
					}
			}
		}
	}
}


class TicketDemo2
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();       // ����ʵ��

		Thread t1 = new Thread(t);        // Thread �����Ѿ���ʶ��һ��Runnable���͵Ĳ���
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
 
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();    // ���ַ�����Ʊ���Ĳ�Э��
		//System.out.println("Hello World!");
	}
}
