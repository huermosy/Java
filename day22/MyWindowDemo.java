/*
1. ��һ����������Ҫ�Ľ���������������ǰ��ļ����ߣ�
	1.����
	2.������Ҫ�Ĵ���(��С�Լ���Ӧ�Ĳ���setBounds�������Ͼ����Լ�������Ӧ�ľ���,setLayout)���ı����Լ���ť��������ʽ���壩�� 
	3.���ı�����뵽����֮��
	4.�����¼���������Ҫ��Ӧ�ļ������Լ���д
*/
import java.awt.*;
import java.awt.event.*;
import java.io.*;    // ���������Ӧ��io��
class MyWindowDemo 
{
	private Frame f;
	private TextField tf;
	private Button bt;
	private TextArea ta;

	private Dialog d;
	private Label lab;
	private Button okbt;

	MyWindowDemo()
	{
		init();
	}

	public void init()
	{
		f = new Frame("my window");
		f.setBounds(300,200,600,500);
		f.setLayout(new FlowLayout());      // ������ʽ���ֵķ���

		tf = new TextField(40);        // ���Ƕ�Ӧ������
		bt = new Button("����һ����ť");
		ta = new TextArea(20,40);

		d = new Dialog(f,"��ʾ��Ϣself",true);
		lab = new Label();
		okbt = new Button("ȷ��");

		d.setBounds(400,300,250,200);
		d.setLayout(new FlowLayout());
		d.add(lab);
		d.add(okbt);
		f.add(tf);
		f.add(bt);
		f.add(ta);
		myevent();
		f.setVisible(true);
	}
	/*
	������������������������һ�����������Ǵ��ڵĹرգ�
	�ڶ������������ǻ�ȡ�ı���Ӧ��·����
	˼·�����ȣ��õ���Ӧ���ļ���·����Ȼ�󴴽�һ���ļ��У�����ļ��д��ڲ������ļ���ǰ·����
	��ն�Ӧ������ı���ͨ���б��ȡ��Ӧ���ļ���������ݣ�Ȼ���ø߼���������ȡ��Ӧ���ļ����ƣ�ͨ��append�ķ�����Ӷ�Ӧ���ļ�
	*/
	public void myevent()
	{
		
		System.out.println("����һ���¼�");
		bt.addActionListener(new ActionListener()  // ���Ƕ����ڰ�ť�ϵ��¼�
		{
			public void actionPerformed(ActionEvent e)
			{
				 ShowDir();
			}
		});

		f.addWindowListener(new WindowAdapter()
		{
			public void	windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		tf.addKeyListener(new KeyAdapter()      // �����ò��õ��������Ŀ�ݷ�����ֱ�ӻس�����ok������ڰٶȵ��ֶ�enter��
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					ShowDir();
				}
			}
		
		});

		d.addWindowListener(new WindowAdapter()        
		{
			public void	windowClosing(WindowEvent e)
			{
				d.setVisible(false);
			}
		});

		okbt.addActionListener(new ActionListener()  // ���Ƕ����ڰ�ť�ϵ��¼�
		{
			public void	actionPerformed(ActionEvent e)
			{
				d.setVisible(false);
			}
		});
	}

	private void ShowDir()
	{
		String dirPath = tf.getText();
		File fe = new File(dirPath);
		if(fe.exists() && fe.isDirectory())
		{
			ta.setText("");
			String[] names = fe.list();
			for(String name:names)
			{
				ta.append(name+"\r\n");
			}
		}
		else
		{
			String info = "���������Ϣ"+dirPath+"�������������롣";
			lab.setText(info);
			d.setVisible(true);
		}
	}

	public static void main(String[] args) 
	{
		 MyWindowDemo w = new MyWindowDemo();
 	}
}
