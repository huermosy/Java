/*
IO流（合并流）
	编程思路：创建一个Vector对象， 然后添加文件，  用Enumeration枚举将文件放入
	定义一个SequenceInputStream 合并流，放入枚举的文件。 定义 文件输出流，
	创建字节数组，  并且按照字节数组的格式读入，其中读入的东西是ASCII码，并且读入-1即为最后一行。
	.write方法写入输出流文件，（字节数组名，0，对应的ASCII码）
	关流。
*/


import java.util.*;
import java.io.*;
class  SquenceDemo
{
	public static void main(String[] args) throws IOException
	{
		Vector<FileInputStream> v1 = new Vector<FileInputStream>();

		v1.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\b1.txt"));
		v1.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\b2.txt"));
		v1.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\b3.txt"));

		Enumeration<FileInputStream> en = v1.elements();
		SequenceInputStream si = new SequenceInputStream(en);
		FileOutputStream fo = new FileOutputStream("D:\\Learning materials\\java\\java_\\day20\\b4.txt");
		byte[] bt= new byte[1024];
		
		int len = 0;
		while((len = si.read(bt))!=-1)
		{
			fo.write(bt,0,len);
		}
		si.close();
		fo.close();
	}
}
