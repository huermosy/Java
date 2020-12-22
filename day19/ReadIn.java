/*
读取键盘录入
System.out  标准的输出，控制台
System.in   标准的输入，键盘

需求：通过键盘录入数据。
当录入一行数据的时候，就将该数据打印。
如果录入的数据是over，则停止打印退出。

自己先来测试一下 System.in的功能
*/

import java.io.*;

class ReadIn 
{
	public static void main(String[] args)  throws IOException
	{
//		System.out.println("Hello World!");
		InputStream fi = System.in;     // 注意如果是FileInputStream的话录入的是文件，这个是直接从键盘录入，所以应该是输入流
		StringBuilder b = new StringBuilder();

		while(true)
		{
			int ch = fi.read();     // read读入一个字节的ASCII码
			if(ch=='\r')
			{
				continue;
			}

			if(ch=='\n')
			{
				String s = b.toString();
				if("over".equals(s))
					break;
				System.out.println(s.toUpperCase());
				b.delete(0,b.length());
			}

			else
			{
				b.append((char)ch);
				 
			}	 
		}
	}
}
