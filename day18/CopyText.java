// IO流 （拷贝文本文件）
/*
复制原理：
其实就是将c盘下的文件数据存储到D盘的一个文件中。
步骤：
1. 在D盘创建一个文件，用来关联的c盘中的文件数据
2.定义读取流和C盘文件关联。
3.通过不断的读写完成数据的存储。
4.关闭文件

共两种拷贝方法,尝试都用一下

复习：当一个函数调用了抛出异常的方法，对应的这个函数也要抛出异常。
*/

import java.io.*;
class  CopyText
{
	public static void main(String[] args) throws IOException
	{
		copy_2();  
//		System.out.println("Hello World!");
	}

	public static void copy_1() throws IOException
	{
		FileReader fr = new FileReader("RunTimeDemo.java");
		FileWriter fw = new FileWriter("RunTimeDemo_copy.java");

		int num = 0;
		while((num = fr.read())!=-1)
		{
			fw.write(num);    // 读入与写入的都是ASCII码  没必要作相应的转换
		}
		fr.close();
		fw.close();
	}
	
	public static void copy_2()
	{
		// 创建两个引用
		FileReader fr = null;
		FileWriter fw = null;

		try
		{
			fr = new FileReader("RunTimeDemo.java");
			fw = new FileWriter("RunTimeDemo_copy1.java");
			char[] arr = new char[1024];
			int num = 0;
			while((num = fr.read(arr))!=-1)
			{
				fw.write(arr, 0, num);
			}
		}

		catch(IOException e)
		{
			sop(e.toString());
		}

		finally
		{
			try
			{
				if(fr!=null)
				{
					fr.close();
				}
			}
			catch(IOException e)
			{
				sop(e.toString());
			}

			try
			{
				if(fw!=null)
				{
					fw.close();
				}
			}
			catch(IOException e)
			{
				sop(e.toString());
			}
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
