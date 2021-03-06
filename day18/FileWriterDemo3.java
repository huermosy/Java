// 掩饰对原来已有的文件的续写

import java.io.*;

class  FileWriterDemo3
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
// 创建一个引用使得fw可以一直使用
		FileWriter fw = null;   // 创建一个fw的引用
		try
		{
			fw = new FileWriter("xixi.txt",true);
			fw.write("续写内容\r并且换行。");
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
