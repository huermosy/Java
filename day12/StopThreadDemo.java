/*
stop�����Ѿ���ʱ��
���ֹͣ�̣߳�ֻ��һ�֣�run����������
�������߳����У����д���ͨ����ѭ���ṹ��

ֻҪ����סѭ���Ϳ�����run����������Ҳ�����߳̽�����


���̣߳�ֹͣ�߳�
��������ʵ�֣� ����һ��StopThread �����̳�Runnable�࣬������������дrun������  StopThread�����е�˽�б����� flag��boolean�ࣩ��
����һ�����Ʊ�ʶ����ٵķ���

Interrupt���������ڶ�����߳�ǿ�ƻָ�������״̬�ϡ�


Thread�ṩ interrupt()������

������������̴߳��ڶ���״̬���Ͳ����ȡ����ǣ��߳̾Ͳ��������
*/

class StopThread implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"Exception");
				//flag = false;       // ����־λ��Ϊ0��
			}
		 	System.out.println(Thread.currentThread().getName()+"------run");
	}
	public void changeflags()
	{
		flag = false;
	}
}

class  StopThreadDemo
{
	public static void main(String[] args) 
	{
		StopThread st = new StopThread();

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		//�����߳�
		t1.setDaemon(true);   // �ػ��߳�,���߳����ػ��̵߳Ĺ�ϵ
		t2.setDaemon(true);     

		t1.start();
		t2.start();

		// дһ��ѭ�����д���
		int num = 0;
		while(true)
		{
			if(num++ == 60)
			{
				//st.changeflags();
				//t1.interrupt();    // �׳��쳣
				//t2.interrupt();
				st.changeflags();   //  ��interrupt֮����Ҫ�ٽ�flags��Ϊ0��Ȼ��Ų����ٴν��붳��״̬��
				break;
			}
			System.out.println(Thread.currentThread().getName()+" run----"+num);

		}
 		System.out.println("over!");
	}
}