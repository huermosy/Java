/*
IO流（ByteArrayStream）   对数组操作
因为两个流对象都操作的数组，并没有使用系统的资源，
所以，不用进行close关闭 ,并且这个类不会抛出IO异常。

在流操作规律时的讲解时：
源设备：
	键盘：System.in   硬盘：FileStream    内存：ArrayStream
目的设备：
	控制台： System.out  硬盘： FileStream  内存:ArrayStream
用流的读写思想来操作数据
*/

import java.io.*;
class  ByteArrayStreamDemo
{
	public static void main(String[] args) 
	{
		ByteArrayInputStream fi = new ByteArrayInputStream("guagngagn".getBytes());
		ByteArrayOutputStream fo = new ByteArrayOutputStream();

		int by = 0;
		while((by = fi.read())!=-1)
		{
			fo.write(by);
		}
		System.out.println(fo.size());
		System.out.println(fo.toString());
 	}
}
