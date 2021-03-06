/*
创建图形化界面
首先记得导包。
1.创建frame窗体;
2.对窗体进行基本设置。
	比如大小，位置，布局。 方向大小的设置都是横竖，布局方式可以采用流体的方式。
3.定义组件；
4.将组件通过窗体的add方法方法添加到窗体中;
5.让窗体显示，通过setVisible(这里的参数为true或者false)

事件监听机制特点：1.事件源； 2.事件； 3.监听器； 4.事件处理。
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

		Button but = new Button("我是一个按键");

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
				System.out.println("我活了---"+e.toString());
			}

			public void windowOpened(WindowEvent e)
			{
				System.out.println("我开了---"+e.toString());
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
		System.out.println("我活了---"+e.toString());
	}

	public void windowOpened(WindowEvent e)
	{
		System.out.println("我开了---"+e.toString());
	}
}
*/