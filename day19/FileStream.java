/*
想要操作图片数据的时候应该用到字节流
需求：使用字节流写入文件 用到FileOutputStream 这一个类
然后使用字节流读取文件，用到FileInputStream 这一个类。(这里字节流的读取共有3种方法，普通，创数组，特有(available这一个方法))
字节流可以不用flush每次写入的时候刷。
*/
import java.io.*;

class FileStream 
{
	public static void main(String[] args) throws IOException
	{
//		FileWrite();
		FileRead_3();
//		System.out.println("Hello World!");
	}


	public static void FileWrite() throws IOException
	{
		FileOutputStream fw = new FileOutputStream("qq.txt");    // 这是字节流的创建

		fw.write("fajlfkd\r\nhuermosy".getBytes());    
		fw.close();
	}
// 普通的读取方式
	public static void FileRead_1() throws IOException
	{
		FileInputStream fr = new FileInputStream("qq.txt");
		int num = 0;
//		byte[] bt = new byte[];
		while((num = fr.read())!=-1)
		{
			sop((char)(num));
//			bt.append(num);
//			sop(num.);
		}
		fr.close();
 	}
// 创建数组的方式
	public static void FileRead_2() throws IOException
	{
		FileInputStream fr = new FileInputStream("qq.txt");
		int num = 0;
		byte[] bt = new byte[1024];
		while((num = fr.read(bt))!=-1)
		{
			sop(new String(bt,0,num));
		}
		fr.close();
 	}
// 字节流特有的读取方式
	public static void FileRead_3() throws IOException
	{
		FileInputStream fr = new FileInputStream("qq.txt");
		int num = fr.available();
		byte[] bt = new byte[num];
		fr.read(bt);       // 将文本流中的数据读入到字节数组中去
		sop(new String(bt));
		fr.close();
 	}



	public static void sop(Object str)
	{
		System.out.print(str);
	}
}
