/*
IO流（转换流的字符编码）
UTF-8的含义：最多用3个字节装，也可以用1个字节装。
GBK：中国的中文编码表升级，融合了更多的中文文字符号。
有些人用GBK,有些人用UTF-8,所以存在转换流之间的问题。
分别用一下：
用UTF-8的格式读GBK的格式;
用GBK的格式读一下UTF-8的格式;
*/

import java.io.*;
class  EncoderStream
{
	public static void main(String[] args) throws IOException
	{
		Readfile();
		
 	}

	public static void Readfile() throws IOException
	{
//		InputStreamReader fo = new InputStreamReader(new FileInputStream("UTF.txt"));       // 这是用GBK的格式读一下UTF-8的格式,  输出乱码的格式
		InputStreamReader fo = new InputStreamReader(new FileInputStream("GBK.txt"),"UTF-8");       // 这是用UTF-8的格式读一下GBK的格式，输出为问号的格式。

		int len = 0;
		char[] bt = new char[10];
		len = fo.read(bt);
		String s = new String(bt,0,len);
		System.out.println(s);

	}

	public static void Writefile() throws IOException
	{
		OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("GBK.txt"));

		fw.write("你好");
		fw.close();
	}

		public static void Writefile1() throws IOException
	{
		OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("UTF.txt"),"UTF-8");

		fw.write("你好");
		fw.close();
	}
}
