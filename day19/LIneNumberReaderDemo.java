// IO流（LineNumberReader）这是BUfferedReader中的子类，功能更强  查阅API然后做，就是行号的设置与获取。  
// 留一个小练习： 模拟一个带行号的缓冲区对象。
/*
int getLineNumber() 
获取当前的行数。  

void setLineNumber(int lineNumber) 
设置当前行数。  

int getLineNumber() 
获取当前的行数。  
*/
import java.io.*;
class  LineNumberReaderDemo
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		try
		{
			LineNumberReader lin = new LineNumberReader(new FileReader("CopyText.java"));
			String num = null;
			lin.setLineNumber(100);    // 将起始位置设置为从100行开始。
			while((num = lin.readLine())!=null)
			{

 				System.out.println(lin.getLineNumber()+"::"+num);
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

		finally
		{
			try
			{
				fr.close();	
			}
			catch (IOException e1)
			{
				System.out.println(e1.toString());
			}
		}
//		System.out.println("Hello World!");
	}
}
