/*
I/O异常处理   三个语句均要抛出异常用 try处理。
*/

import java.io.*;

class  FileWriterDemo2
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
// 创建一个引用使得fw可以一直使用
		FileWriter fw = null;   // 创建一个fw的引用
		try
		{
			fw = new FileWriter("xixi.txt");
			fw.write("往这个文件中写入了内容");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}

		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.close();  // 关闭时一定会执行的语句
				}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
			 
		}
	}
}
