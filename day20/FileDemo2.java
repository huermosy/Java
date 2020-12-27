/*
IO流（File对象功能-文件列表）
了解一下File类中的list和listRoots这两个方法
static File[] listRoots() 
列出可用的文件系统根 
String[] list() 
返回的字符串在该目录下的抽象路径名的文件和目录命名为数组。  

第一个方法能够列出能够有管理权限的磁盘，第二个方法能够列出c盘中具体都有哪些文件


list() 
返回的字符串在该目录下的抽象路径名的文件和目录命名为数组。 

留一个练习：过滤掉抽象路径中满足过滤器的文件和目录，用到list(FilenameFilter Filter)，比如都留下了.java这些文件

练习的实现：用匿名内部类中的方法重写来实现对应的功能，要用到endsWith这个方法来实现。并且查阅accept这一个api函数
然后改进一下，用listFiles比list好，因为listFiles中已经有很多方法了。因为拿到的是File这个列表对象， 拿到对象以后可以多次操作
*/
import java.io.*;

class  FileDemo2
{
	public static void main(String[] args) 
	{
//		method_1();
//		method_2();
		method_4();
 	}
	
	// 来一个改进，listFiles
	public static void method_4()
	{
		File f = new File("c://");
		File[] arr = f.listFiles();    

		for(File name:arr)
		{
			sop(name.getName()+"::"+name.length());
		}
	
	}


	// 留的这一个练习，也就是过滤器
	public static void method_3()
	{
		File f = new File("D:\\Learning materials\\java\\java_\\day20");
		String[] arr = f.list(new FilenameFilter()       // 这是一个匿名内部函数,并且list为一个字符串集合
		{
			public boolean accept(File dir, String name)
			{
				return name.endsWith(".java");
			}
		});

		
		for(String name:arr)
		{
 			sop(name);
		}
	}

	public static void method_1()
	{
 		File[] files = File.listRoots();
		for(File f:files)
			sop(f);
	}

	public static void method_2()
	{
		File f = new File("c://");
		String[] names = f.list();
		for(String name:names)
			sop(name);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
