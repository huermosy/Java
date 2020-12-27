/*
IO流（切割文件）
编程思路：
1.定义切割函数：
	文件输入流定义， 用懒汉式定义文件输出流， 定义一个byte类型的数组
	定义一个文件读取的ASCII码的存储变量， 定义一个文件名的变量，
	开始读取文件，懒汉式完成，并在其中写入文件。要在函数内部立即关流，一次切割完成  存储的名称为part
	关流，切割完成
2.定义合成函数：
	定义一个ArrayList类型的列表，记住泛型
	for循环添加切割后的part进行添加。
	创建一个迭代器，并且定义一个匿名内部类搞枚举的东西，这里看不懂可以暂时放一下，
	获取枚举的元之后，放入SequenceInputStream合并流中，
	定义输出流，定义byte类型元组，定义常量ASCII，然后进行read写入操作。
	两个都关流。

*/

import java.io.*;
import java.util.*;

class SplitFile 
{
	public static void main(String[] args) throws IOException
	{
		merge();
	}

	public static void split() throws IOException
	{
		FileInputStream fi = new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\1.jpg");
		FileOutputStream fo = null;
		byte[] bt = new byte[1024*100];
		int len = 0;
		int count = 0;
		while((len = fi.read(bt))!=-1)
		{
			count++;
			fo = new FileOutputStream("D:\\Learning materials\\java\\java_\\day20\\t1.txt\\"+count+".part");
			fo.write(bt,0,len);
			fo.close();
		}
		fi.close();
	}


	public static void merge() throws IOException
	{
		ArrayList<FileInputStream> li = new ArrayList<FileInputStream>();

		for(int x=1; x<5; x++)
		{
			li.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\t1.txt\\"+x+".part"));
		}

// 这个部分的东西可以暂时不理解，反正就是为了得到Enumeration的东西
		Iterator<FileInputStream> it = li.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fw = new FileOutputStream("D:\\Learning materials\\java\\java_\\day20\\t1.txt\\change.bmp");
		int len = 0;
		byte[] bt = new byte[1024];
		while((len = sis.read(bt))!=-1)
		{
			fw.write(bt,0,len);
		}
		fw.close();
		sis.close();
	}
}
