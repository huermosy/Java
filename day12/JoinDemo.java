/*
.join��������A�߳�ִ��ʱ����B�̵߳�.join����ʱ���ͻ��ó�ִ��Ȩ����B�̶߳�ִ���꣬�Ż���A�߳�ִ�С�

join������ʱ�����߳����С�

��������е�main�����ύ��ִ��Ȩ����t1�������Ż�õ�ִ��Ȩ��

*/


class Demo implements Runnable
{
	public void run()
	{
		for(int x=0; x<70; x++)
		{
			System.out.println(Thread.currentThread().getName()+"~~~~~~~~run---"+x);
			Thread.yield();    // ������ǰӵ�еĿ���Ȩ��ʹ��ѭ���ܹ�ִ�С�
		}
	}
}


class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException      // �׳�Interrupted�쳣
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();
		//t1.join();
		t1.setPriority(Thread.MAX_PRIORITY);        // ��t1����Ϊ�������ȼ���
		t2.start();
		//t1.join();      // 

		for(int x=0; x<60 ; x++ )
		{
//			System.out.println(Thread.currentThread().getName()+"------run---"+x);
		}
		System.out.println("over!");
		//System.out.println("Hello World!");
	}
}
