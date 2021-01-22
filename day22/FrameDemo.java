/*
Action�¼�
	����һ��������frame
1.��frame���л�������;   ����λ�ô�С������
2.��������ӵ�frame��;	 
3.���ش����¼�;
4.��ʾ����;
*/
import java.awt.*;
import java.awt.event.*;


class  FrameDemo
{
	private Frame f;        // ����һ������ʽ�Ķ��巽����Ĭ�ϲ���ʵ������ʲôʱ�����ʵ������ʱ�����ʵ������ ��Ϊ����ᴴ�������������Էֱ��ǰ�ť�ʹ�������������
	private Button but;
	private TextField tf;

	FrameDemo()
	{
		init();
	}
	
	public void init()
	{
		f = new Frame("�������");
		f.setBounds(300,200,300,200);
		f.setLayout(new FlowLayout());
		tf = new TextField(20);
		but = new Button("my button");
		f.add(but);
		f.add(tf);
		myEvent();
		f.setVisible(true);
	}

	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		/*
		�ð�ť�߱��˳�����Ĺ��ܣ�
		��ť�����¼�Դ;
		��ôѡ���ĸ���������
		ͨ���رմ���ʾ���˽⵽����Ҫ֪���Ǹ�����߱�ʲô�����м�������
		��Ҫ�鿴���������Ĺ��ܡ�
			ͨ������button�����������ְ�ť֧��һ�����м���addActionListener��
		*/
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("��¼�");
			}
		});
	

		// ��һ�����̼�����
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				int code = e.getKeyCode();
				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))
					System.out.println(code+".....�ǷǷ���");
			}
		});

		 

		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER)
					System.out.println("ctrl+enter is run");
			}
		});



		/*
			�������¼�mouseEntered�������mouseClicked�¼������У�getClickCountΪ�õ���ǰ�ļ���ֵ
		*/
		but.addMouseListener(new MouseAdapter()          // �Զ����һ������¼�
		{
			private int count = 1;
			private int clickCount = 1;
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("���ָ�������˰�ť��"+count++);
			}

			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
				System.out.println("������"+clickCount++);
			}
		});
	}

	public static void main(String[] args) 
	{
		FrameDemo a = new FrameDemo();
	}
}                              