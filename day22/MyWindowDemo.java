/*
1. 第一步，将所需要的界面给搭建出来；按照前面的几步走：
	1.导包
	2.创建需要的窗体(大小以及相应的布局setBounds距离左上距离以及自身相应的距离,setLayout)，文本框以及按钮（用懒汉式定义）。 
	3.将文本框加入到窗体之中
	4.定义事件函数，需要对应的监听器以及重写
*/
import java.awt.*;
import java.awt.event.*;
import java.io.*;    // 这是引入对应的io包
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
		f.setLayout(new FlowLayout());      // 采用流式布局的方法

		tf = new TextField(40);        // 这是对应的列数
		bt = new Button("这是一个按钮");
		ta = new TextArea(20,40);

		d = new Dialog(f,"提示信息self",true);
		lab = new Label();
		okbt = new Button("确定");

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
	这里面是两个匿名函数，第一个匿名函数是窗口的关闭；
	第二个匿名函数是获取文本对应的路径，
	思路：首先，得到相应的文件夹路径，然后创建一个文件夹，如果文件夹存在并且在文件当前路径，
	清空对应下面的文本框，通过列表获取相应的文件夹里的内容，然后用高级遍历，获取相应的文件名称，通过append的方法添加对应的文件
	*/
	public void myevent()
	{
		
		System.out.println("这是一个事件");
		bt.addActionListener(new ActionListener()  // 这是定义在按钮上的事件
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

		tf.addKeyListener(new KeyAdapter()      // 这是让不用点搜索键的快捷方法，直接回车键就ok，类比于百度的手动enter键
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

		okbt.addActionListener(new ActionListener()  // 这是定义在按钮上的事件
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
			String info = "您输入的信息"+dirPath+"有误，请重新输入。";
			lab.setText(info);
			d.setVisible(true);
		}
	}

	public static void main(String[] args) 
	{
		 MyWindowDemo w = new MyWindowDemo();
 	}
}
