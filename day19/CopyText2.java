// 通过缓冲区复制一个java文件

// 
import java.io.*;

class  CopyText2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader fr = null;
		BufferedWriter fw = null;         // 创建两个引用
 		try
		{
			fr = new BufferedReader(new FileReader("BufferedReadDemo.java"));
			fw = new BufferedWriter(new FileWriter("BufferedCopy.txt"));
			String len = null;
			while((len = fr.readLine())!=null)
			{
				fw.write(len);
				fw.newLine();         // 换行
				fw.flush();      // 刷新
			}
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		// 装进缓冲区中
		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}

			try
			{
				if(fr!=null)
				{
					fr.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
 	}
}
