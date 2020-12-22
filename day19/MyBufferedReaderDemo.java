/*
明白了BufferedReader类中的特有方法readLine()原理后，
可以自定义一个类中包含的一个功能和readLine一致的方法。
来模拟一下BufferedReader
*/
import java.io.*;

class MyBufferedReader extends Reader      // 自己定义的包装类是继承了Reader类，MyBufferedReader是一个装饰类，可以进行功能增强; Read的话可以对一组类进行装饰。
{
	private Reader f;   // 私有化本身有一个文本流。
	MyBufferedReader(Reader f)    // 构造函数的初始化， 
	{
		this.f = f;
	}

	public String MyreadLine() throws IOException
	{
		// 创建一个容器用于演示 StringBuilder 这一个容器
		StringBuilder b = new StringBuilder();
		int num = 0;
		while((num = f.read())!=-1)
		{
			if(num == '\n')
			{
				return b.toString();
			}
			else if(num == '\r')
			{
				continue;
			}
			else
			{
				b.append((char)num);    // 需要来一个强转
			}
		}
		// 考虑一种情况，就是最后一行的段落没有回车符的现象
		if(b.length()!=0)
			return b.toString();      // 那么就可以将字符串返回。
		return null;
	}

	public void Myclose() throws IOException
	{
		f.close();
	}

	// 覆盖掉Reader中的抽象方法。
	public void close() throws IOException
	{
		f.close();
	}

	public int read(char[] cbuf, int off, int len)  throws IOException
	{
		return f.read(cbuf, off,len);
	}
}



class  MyBufferedReaderDemo
{
	public static void main(String[] args)  throws IOException
	{
		FileReader f = new FileReader("test.txt");
		MyBufferedReader  b = new MyBufferedReader(f);
		String len = null;
		while((len = b.MyreadLine())!=null)
		{
			System.out.println(len);
		}
		b.Myclose();
 	}
}
