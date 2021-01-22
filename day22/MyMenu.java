// GUI菜单的制作
// day12 FileDialog()这个东西
package mymenu;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class  MyMenu
{
	private Frame f;
	private MenuBar mb;
	private Menu m,m2;
	private MenuItem closeItem,item2,openItem,saveItem;
	private FileDialog openDia,saveDia;
	private TextArea ta;
	private File fe;

	MyMenu()
	{
		init();
	}

	public void init()
	{
		f = new Frame("这是一个窗体");
		f.setBounds(400, 300,500,500);
//		f.setLayout(new FlowLayout());    不设置流式布局，默认布局是满填充
		
		ta = new TextArea();
		mb = new MenuBar();
		m = new Menu("菜单");
		m2 = new Menu("菜单2");
	
		
		closeItem = new MenuItem("退出");
		item2 = new MenuItem("菜单项");
		openItem = new MenuItem("打开");
		saveItem = new MenuItem("保存");

		openDia = new FileDialog(f,"我要打开",FileDialog.LOAD);
		saveDia = new FileDialog(f,"我要保存",FileDialog.SAVE);

		m2.add(item2);
		m.add(openItem);
		m.add(saveItem);
		m.add(closeItem);
		mb.add(m);
		f.setMenuBar(mb);
		f.add(ta);
		myevent();
		f.setVisible(true);
	}

	private void myevent()
	{

		saveItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				saveDia.setVisible(true);
				String dirPath = saveDia.getDirectory();
				String fileName = saveDia.getFile();
				System.out.println(dirPath+"......"+fileName);
				if(dirPath==null || fileName==null)
					return ;
 				fe = new File(dirPath,fileName);    // 一个文件
				try
				{
					BufferedWriter buff = new BufferedWriter(new FileWriter(fe));
					String text = ta.getText();
					buff.write(text);
					buff.close();
				}
				catch (IOException e2)
				{
					throw new RuntimeException("保存不了");
				}


			}
		});
		
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				openDia.setVisible(true);
				String dirPath = openDia.getDirectory();
				String fileName = openDia.getFile();
				System.out.println(dirPath+"......"+fileName);
				if(dirPath==null || fileName==null)
					return ;
				ta.setText("");       // 如果文件名并且文件夹名字不为空的话，则清空原来的空白区
				fe = new File(dirPath,fileName);    // 一个文件

				try
				{
					BufferedReader bufr = new BufferedReader(new FileReader(fe));      // 把文件放到对应的缓存区中
					String line = null;
					while((line=bufr.readLine())!=null)     // 这是按行读取的方式
					{     
						ta.append(line);
					}
					bufr.close();
				}
				catch(IOException e1)
				{
					throw new RuntimeException("读取失败！");
				}
			}
		});


		closeItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		}	
		);

		f.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		});
	}


	public static void main(String[] args) 
	{
		new MyMenu();
 	}
}
