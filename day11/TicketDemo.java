/*
���󣺼򵥵���Ʊ����;   �������ͬ����Ʊ��

���̵߳ĵڶ����㷨��  �ӿ�Runnable
���裺
1.����һ������ʵ��Runnable�ӿ�
2.��д���е�run����
	���߳�Ҫ���еĴ�������run����֮��

3.ͨ���������Thread�ཨ������߳�
4.ͨ����Runnable������ʵ������Ĳ�������Thread���й��캯��
	ΪʲôҪ��Runnable������������󴫵ݸ�Thread��Ĺ��캯����
	��Ϊ�Զ����run���������Ķ�����Runnable�ӿڵ��������
	����Ҫ���߳�ȥִ��ָ�������run�������ͱ�����ȷ�÷��������Ķ���

5.ͨ��Thread���start���������̣߳����ҵ��õ���Runnable�е�run������

ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô����
�̳з�ʽ���е��̳еľ����ԣ��ڶ����̵߳�ʱ����ʵ�ֵķ�ʽ�ȽϺ���

���ַ�ʽ������
1.�̳з�ʽ�Ĵ�������Thread����run�����У�
2.ʵ�ַ�ʽ�����Runnable�ӿڵ������run�����С�

*/

class Ticket implements Runnable//extends Thread
{
	private static int tickets = 100;
	public void run()
	{
		while(true)
		{
			if(tickets>0)
			{
				 
				System.out.println(Thread.currentThread().getName()+"----sell out:"+(tickets--));
			}
		}
	}
}


class TicketDemo 
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
