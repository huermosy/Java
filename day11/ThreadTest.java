/*
��ϰ�� ���������̣߳������߳̽������С�
*/
class Test implements Runnable//extends Thread
{
	private String name;
	/*
	Test(String name)
	{
		//this.name = name;      // ��Ա�������ھֲ�����
		super(name);
	}
	*/
	public void run()      // ��дrun������
	{
		for(int x=0; x<60; x++)
		{
			System.out.println(Thread.currentThread().getName() + " run:"+x);     // 
		}
	}
}


class ThreadTest 
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();						// �ֱ��������̵߳ĵ���
		t2.start();
		t3.start();
		t4.start();
		/*
		for(int x=0; x<60; x++)
		{
			System.out.println("Main run:"+x);
		}
		//System.out.println("Hello World!");
		*/
	}
}