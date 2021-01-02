/*
字符编码  
1，编码：将看得懂的东西变成看不懂的东西。 字符串变成字节数组
2，解码：将看不懂的东西变成看得懂的东西。 字节数组变成字符串

1.  String-->Byte[]  str.getBytes(charsetName);
2.  Byte[]-->String   new String(byte[],charsetName);

编程思路：创建一个中文字符串，将其转为字节数组，也就是编码，输出数组，记得用Arrays的方法输出，否则会变成地址值；
再解码成字符流，输出

服务器中用的编码方式是iso8859-1  不识别中文，编码的时候可以先编一次再解一次。  而utf-8识别中文最多三个字节故不能用来与gbk结合
*/

import java.io.*;
import java.util.*;
class  EncoderDemo 
{
	public static void main(String[] args)  throws Exception
	{
		String s = "你好";
		byte[] bt = s.getBytes("GBK");        
		System.out.println(Arrays.toString(bt));
		String s1 = new String(bt,"iso8859-1");
		System.out.println(s1);
		byte[] bt1 = s1.getBytes("iso8859-1");
		System.out.println(Arrays.toString(bt1));
		String s2 = new String(bt1,"gbk");
		System.out.println(s2);
	}
}
