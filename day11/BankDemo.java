/*
����������һ����⣬�����������ֱ��300Ԫ��ÿ�δ�100Ԫ����3�Ρ�
�� �ó����Ƿ��а�ȫ���⣿����У�����ô�����

��������⣿
1.��һ����Щ�����Ƕ��߳����еĴ���;
2.��һ����Щ�����ǹ��������;
3.��һ�¶��߳����еĴ�������Щ���ڲ����������ݵġ�

���ִ��Ǯ�����ҵġ�

ͬ��������ͬ������ؼ��ֿ�����Ϊ���η����κ�����
*/


class Bank             // ������һ����
{
	private int sum=0;
//	Object obj = new Object();
	public synchronized void deposit(int n)     // ��Ǯ��һ������
	{
//		synchronized(obj)   ����Ĵ������ڲ����������ݣ����ҷ���run�е��ã������Ƕ��߳������еĴ��롣
			
		sum += n;
		System.out.println("�����е�ǮΪ��"+sum + "Ԫ");
			
	}
}

class Customer implements Runnable       // ʵ����һ��Runnable�ӿ�
{
	Bank c = new Bank();     // ʵ����һ������
	public void run()
	{
		for(int x=0; x<3; x++)
		{
			c.deposit(100);    // ������Ǯ��ÿ�ζ���100Ԫ��
		}
	}
}

class  BankDemo
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();     // ʵ��������
		Thread c1 = new Thread(c);       // ��ʼ�����߳�
		Thread c2 = new Thread(c);
		c1.start();                 // �����̡߳�
		c2.start();

		//System.out.println("Hello World!");
	}
}
