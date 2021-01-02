/*
IO�����ܵ�����

PipedOutputStream
PipedInputStream
���˼·�� 
���������ࣺһ����Read�࣬һ����Write�࣬�ֱ�ʵ��Runnable
Reader��
˽�л�����ܵ�����Read ���췽����ʼ����
��дrun������������throws�׳��ķ�ʽ��ֻ����try...catch�ķ�ʽ����������ļ������Ҽǵù�����

Write��
˽�л�����ܵ�����Write ���췽����ʼ��
��дrun������������write�ķ���д���Ӧ���ֽ���   �ǵù���

������
��������in��out�࣬Ȼ����in����out   .connect()���� ���ӵķ���һ�������֣�һ����connect��������һ����ֱ���ӽ����캯��
����������ʵ����
�ֱ����������߳� new Thread(ʵ����������).start()
*/

import java.io.*;

 

class Read implements Runnable
{
	private PipedInputStream r;
	Read(PipedInputStream r)
	{
		this.r = r;
	}
	public void run()
	{
		try
		{
			 
			byte[] bt = new byte[1024];
			System.out.println("׼�������ݣ�����״̬׼�����롣");
 			int len = r.read(bt);
			System.out.println("�������ݣ���������");
			String s = new String(bt,0,len);
			System.out.println(s);
			r.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("�ܵ�������ʧ��");
		}
		 
	}
}



class Write implements Runnable
{
	private PipedOutputStream w;
	Write(PipedOutputStream w)
	{
		this.w = w;
	}
	public void run()
	{
		try
		{
			System.out.println("��ʼд�����ݣ��ȴ�6s��");
			Thread.sleep(6000);
			w.write("good luck to you".getBytes());
			w.close();
		}
		catch(Exception e)
		{
			throw new RuntimeException("�ܵ������ʧ��");
		}
	}
}
class  PipedStreamDemo 
	{
		public static void main(String[] args) throws IOException
		{
			PipedInputStream ri = new PipedInputStream();
			PipedOutputStream wi = new PipedOutputStream();
			ri.connect(wi);
			Read r1 = new Read(ri);
			Write w1 = new Write(wi);
			new Thread(r1).start();
			new Thread(w1).start();
		}
	}


