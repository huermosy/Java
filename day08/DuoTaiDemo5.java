/*
��̬         ��������б�Ҫ��дһ��
��������ʵ��
��һ��pci-e�Ľӿ�
�ӽӿڿ��Խ��� ����������    �ӿڿ�����߳�����չ�� ��̬
*/

interface Pci
{
	public void open();   // ���忪��������ر�
	public void close();
}

class Mainboard // ����
{
	public void run()
	{
		System.out.println("run");
	}

	public void usePci(Pci p)    // ����Ϊ����һ���������͡�  ����Ϊimplements������͸���  Pci p = new ������();      ��̬�����֣�����
	{
		if(p != null)
		{
			 p.open();     // ��̬���� �ĵ����൱��    Pci p = new ��������;
			 p.close();
		}
	}
	/*
	public void useNetCard(NetCard c)
	{
		c.open();
		c.close();
	}
	*/
}

class NetCard implements Pci   // ������pci��ʵ��,      ����ʵ����Pci��һ���࣬�ֲ��˼̳е�ȱʧ����
{
	public void open()
	{
		System.out.println("NetCard open");
	}
 
	public void close()
	{
		System.out.println("NetCard close");
	}
}

class SoundCard implements Pci   // ������pci��ʵ��,      ����ʵ����Pci��һ���࣬�ֲ��˼̳е�ȱʧ����
{
	public void open()
	{
		System.out.println("SoundCard open");
	}
 
	public void close()
	{
		System.out.println("SoundCard close");
	}
}

class  DuoTaiDemo5
{
	public static void main(String[] args) 
	{
		Mainboard c = new Mainboard();
		c.run();
		c.usePci(null);
		c.usePci(new NetCard() );   // ��������������������ʹ��pci, �൱��pciֻ��һ���м�Ĺ���
		c.usePci(new SoundCard());
		//System.out.println("Hello World!");
	}
}