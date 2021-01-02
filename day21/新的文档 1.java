/*
IO流（转换流的字符编码）
UTF-8的含义：最多用3个字节装，也可以用1个字节装。
GBK：中国的中文编码表升级，融合了更多的中文文字符号。
有些人用GBK,有些人用UTF-8,所以存在转换流之间的问题。

*/

import java.io.*;
class  EncoderStream
{
	public static void main(String[] args) throws IOException
	{
		Writefile();
 	}

	public static void Readfile() throws IOException
	{
	
	}

	public static void Writefile() throws IOException
	{
		OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("GBK.txt"));

		fw.write("你好");
		fw.close();
	}
}
