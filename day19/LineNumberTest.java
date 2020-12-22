//现在开始来模拟,将两个主要的函数复现出来即可
/*
int getLineNumber() 
获取当前的行数。  

void setLineNumber(int lineNumber) 
设置当前行数。  

String MyreadLine()  

Myclose()

有的一些功能可以从MyBufferedReader 中给继承下来。
*/

import java.io.*;
import java.util.*;

class MyLineNumberReader extends MyBufferedReader
{	
 	private int linenum;      // 先私有化类中的变量
	MyLineNumberReader(Reader r)
	{
		super(r);
	}
	
	public String MyreadLine() throws IOException
	{
		linenum++;
		return super.MyreadLine();    // 这里的return可以理解为跑到父类的功能函数中去，
		// 创建一个buffer容器,用read的方法重新写功能,读到末尾的返回值为-1
		/*
		StringBuilder buff = new StringBuilder();
		int num = 0;
		while((num = r.read())!=-1)
		{
			if(num == '\r')
			{
				continue;
			}
			else if(num == '\n')
			{
				return buff.toString();
			}
			else
			{
				buff.append((char)num);
			}
			 
		}
		if(buff.length()!=0)     
		{
			return buff.toString();      // 这里是将最后一行的num进行转换成字符串类型，  因为最后可能会没有转义符号，所以还没有读完
		}
		*/
	}

	public void setLineNumber(int lineNumber) 
	{
		linenum = lineNumber;
	}
	
	public int getLineNumber()
	{
		return linenum;
	}
/*
	public void Myclose() throws IOException
	{
		r.close();
	}
*/
}


class LineNumberTest 
{
	public static void main(String[] args) throws IOException
	{
		MyLineNumberReader r1 = new MyLineNumberReader(new FileReader("CopyText.java"));
		String n = null;
		r1.setLineNumber(100);
		while((n = r1.MyreadLine())!=null)
		{
			System.out.println(r1.getLineNumber()+"::"+n);
		}
		r1.Myclose();
		//		System.out.println("Hello World!");
	}


}
