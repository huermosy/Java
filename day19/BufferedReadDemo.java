/*
字符读取流缓冲区
该缓冲区提供了一次读取一行的方法readLine,方便与文本数据的获取。
当返回值为null时，说明已经读到了文本的末尾
*/
import java.io.*;
class BufferedReadDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fw = new FileReader("test.txt");
		BufferedReader buff = new BufferedReader(fw);

		String s = null;
		while((s=buff.readLine())!=null)
		{
			System.out.println(s);	
		}
		buff.close();
//		System.out.println("Hello World!");
	}
}
