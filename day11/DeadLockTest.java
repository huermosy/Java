// дһ������������      A����B��B����A
// ����һЩ���ⲻ֪����ô���������������е�ʱ�򲻻ᷢ�����������


class Test implements Runnable
{
    static boolean flags;
	Test(boolean flags)
	{
		this.flags = flags;
	}

	public void run()
	{
		if(flags)
		{
			while(true)
			{
				synchronized(Mylock.locka)        // �����������÷��������Զ���Ҫ�þ�̬
				{
					System.out.println("if-a");
					synchronized(Mylock.lockb)
					{
						System.out.println("if-b");	
					}
				}
			}
		}
		else
		{
			 while(true)
			{
				synchronized(Mylock.lockb)
				{
					System.out.println("else-b");
					synchronized(Mylock.locka)
					{
						System.out.println("else-a");	
					}
				}
			}
		}
	}
}


class Mylock
{
	static Object locka = new Object();      // д��̬��Ŀ�ģ�������ã��������������е��á�
	static Object lockb = new Object();
}


class  DeadLockTest
{
	public static void main(String[] args) 
	{
		Test t = new Test(true);
		Thread t1 = new Thread(new Test(true));     // ���������߳�
		Thread t2 = new Thread(new Test(false));
		t1.start();
		t.flags = false;
//		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();
	}
}
