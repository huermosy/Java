/*
IO流，  File概述
separator 是一个跨平台的分隔符
File 类常见的方法：
1.创建。 
	boolean createNewFile(): 在指定位置创建文件，如果该文件已经存在，则不创建，返回false。
			和输出流不一样，输出对象一键立创建文件，而且文件已经存在，会覆盖。
2.删除。
	boolean delete():删除失败返回false
	void deleteOnExit():在程序退出的时候删除指定的文件
3.判断
	学习了几个方法
	boolean exists() 文件是否存在
	isHidden()   隐藏文件是否存在
	isDirectory()
	isFile
	isAbsolute() 是否是绝对路径。
	makdir()    记住这个方法只能创建一级文件。
4.获取信息。
	getName():
	getPath():
	getparent():
	getAbsolutePath():
	lastModified():
	length():
	renameTo:重命名文件的抽象路径名记。 其实现的功能就像是剪切一样
*/
import java.io.*;
import java.util.*;
class FileDemo 
{
	public static void main(String[] args) throws IOException
	{
//		method2();
//		method3();
		method5();
	}
	public static void method5()
	{
		File f1 = new File("CopyPic.java");
//		f1.createNewFile();
		File f2 = new File("ff3.txt");
		sop(f1.getName());
		sop(f1.getPath());
		sop(f1.length());
		sop("rename:"+f1.renameTo(f2));
	}
	public static void method4() // throws IOException
	{
		File f = new File("t1.txt");
		//f.createNewFile();
		f.mkdir();
		sop("f1_exist:"+f.exists());
		sop("f1_abs:"+f.isAbsolute());
		
		sop("f1_file:"+f.isFile());
		sop("f1_dictory:"+f.isDirectory());
	}
	//	对应file的概述这一部分
	public static void method1()
	{
		File f1 = new File("a.txt");

		File f2 = new File("c://abc","b.txt");

		File d = new File("c://abc");

		File f3 = new File(d,"c.txt");

		File f4 = new File("d:"+File.separator+"Learning materials"+File.separator+"java"+File.separator+"java_"+File.separator+"java20");
//		System.out.println("Hello World!");
		sop("f1"+f1);
		sop("f2"+f2);
		sop("f3"+f3);
		sop("f4"+f4);
	}

	// 对应IO流（file对象的删除与创建这一部分）
	public static void method2() throws IOException
	{
		File f1 = new File("a4.txt");
		sop("File:"+f1.createNewFile());
		sop("File:"+f1.createNewFile());
	}

	public static void method3() throws IOException
	{
		File f2 = new File("a4.txt");
		f2.deleteOnExit();
 
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
