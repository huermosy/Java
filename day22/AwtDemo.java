/*
����ͼ�λ�����
���ȼǵõ�����
1.����frame����;
2.�Դ�����л������á�
	�����С��λ�ã����֡� �����С�����ö��Ǻ��������ַ�ʽ���Բ�������ķ�ʽ��
3.���������
4.�����ͨ�������add�����������ӵ�������;
5.�ô�����ʾ��ͨ��setVisible(����Ĳ���Ϊtrue����false)

�¼����������ص㣺1.�¼�Դ�� 2.�¼��� 3.�������� 4.�¼�������
*/
import java.awt.*;
import java.awt.event.*;

class  AwtDemo
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("my awt");
		f.setSize(500,400);
		f.setLocation(400,220);
		f.setLayout(new GridBagLayout());

		Button but = new Button("����һ������");

		f.add(but);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("window closing---"+e.toString());
				System.exit(0);
			}

			public void windowActivated(WindowEvent e)
			{
				System.out.println("�һ���---"+e.toString());
			}

			public void windowOpened(WindowEvent e)
			{
				System.out.println("�ҿ���---"+e.toString());
			}
		}
			);
		f.setVisible(true);

	}
}

/*
class MyWin implements WindowAdapter
{
	public void windowClose(WindowEvent e)
	{
		System.out.println("window closing---"+e.toString());
	}

	public void windowActivated(WindowEvent e)
	{
		System.out.println("�һ���---"+e.toString());
	}

	public void windowOpened(WindowEvent e)
	{
		System.out.println("�ҿ���---"+e.toString());
	}
}
*/