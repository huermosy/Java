// GUI�˵�������
// day12 FileDialog()�������
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
		f = new Frame("����һ������");
		f.setBounds(400, 300,500,500);
//		f.setLayout(new FlowLayout());    ��������ʽ���֣�Ĭ�ϲ����������
		
		ta = new TextArea();
		mb = new MenuBar();
		m = new Menu("�˵�");
		m2 = new Menu("�˵�2");
	
		
		closeItem = new MenuItem("�˳�");
		item2 = new MenuItem("�˵���");
		openItem = new MenuItem("��");
		saveItem = new MenuItem("����");

		openDia = new FileDialog(f,"��Ҫ��",FileDialog.LOAD);
		saveDia = new FileDialog(f,"��Ҫ����",FileDialog.SAVE);

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
 				fe = new File(dirPath,fileName);    // һ���ļ�
				try
				{
					BufferedWriter buff = new BufferedWriter(new FileWriter(fe));
					String text = ta.getText();
					buff.write(text);
					buff.close();
				}
				catch (IOException e2)
				{
					throw new RuntimeException("���治��");
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
				ta.setText("");       // ����ļ��������ļ������ֲ�Ϊ�յĻ��������ԭ���Ŀհ���
				fe = new File(dirPath,fileName);    // һ���ļ�

				try
				{
					BufferedReader bufr = new BufferedReader(new FileReader(fe));      // ���ļ��ŵ���Ӧ�Ļ�������
					String line = null;
					while((line=bufr.readLine())!=null)     // ���ǰ��ж�ȡ�ķ�ʽ
					{     
						ta.append(line);
					}
					bufr.close();
				}
				catch(IOException e1)
				{
					throw new RuntimeException("��ȡʧ�ܣ�");
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
