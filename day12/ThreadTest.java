/*
for(int x=0; x<100; x++)
{
	System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
}
��������Ĵ���������ѭ���������ȥ�������Σ�������е�x�����Ƚϴ�Ļ�����ô�ͱ������к������������ܽ������еڶ�������飬
���̵߳ĺô����ܹ��Ǵ���鲢�����С�

ʲôʱ����õ��߳��أ�
�𣺵�������Ҫ��������ʱ����Ҫ��ÿ���̷߳�װ������Ȼ��һ�������С�
	�����ַ���ʵ�� ���̵߳ķ�װ
*/
class  ThreadTest
{
	public static void main(String[] args) 
	{
		new Thread()
		{
			public void run()
			{
				for(int x=0; x<100; x++)
				{
					System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
				}
			} 
		}.start();       // ��Thread()�����жϵķ�ʽ

		Runnable r = new Runnable()    // ʹ�ýӿ�ʵ�ֵķ�����
		{
			public void run()
			{
				for(int x=0; x<=100; x++)
				{
					System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
				}
			}
		};

		new Thread(r).start();   // ע���������ֻ�ܴ�Thread��ʼ���á�

		Demo d = new Demo();
		d.start();
	}
}


class Demo extends Thread     // ������װһ�������
{
	public void run()
	{
		for(int x=0; x<100; x++)
		{
			System.out.println(Thread.currentThread().getName().toString()+"-----run---"+x);
		}
	}
}
 