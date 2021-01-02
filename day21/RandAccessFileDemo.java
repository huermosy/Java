/*
IO流 RandomAccessFile   
该类不是算是IO体系中子类
而是直接继承Object.


RandomAccessFile(File file, String mode) 
创建一个随机访问文件流读，随意写来，由 File参数指定的文件。 
其中mode有几种方法，查阅api看一下mode的区别  r和rw
r是直接读取，如果没有文件则抛出异常
rw直接读取，如果没有文件不会抛出异常，并且会创建该文件，

但是它是IO包中的成员，因为具备读和写的功能。
这个类的实例支持对随机存取文件的读和写。一个随机存取文件的行为像一个大数组的字节存储在文件系统中。
有一种光标，或索引到隐含数组，称为文件指针；输入操作读取字节开始在文件指针，并推进文件指针过去的字节读。
如果随机存取文件是创建在读/写模式，那么输出操作也可用；
输出操作写字节开始在文件指针，并推进文件指针过去的字节写的。
写入过去的隐含数组的当前结束的输出操作导致数组被扩展。
文件指针可以由 getFilePointer方法读取和设置的seek方法。


创建文件，然后写入文件的格式，然后调用函数   记得关流
*/

import java.io.*;

class  RandAccessFileDemo
{
	public static void main(String[] args) throws IOException
	{ 
//		writeFile_1();
		readFile();
 	}

	public static void writeFile() throws IOException
	{
		RandomAccessFile r = new RandomAccessFile("bmw.txt", "rw");

		r.write("李四".getBytes());
		r.writeInt(28);
		r.write("王二".getBytes());
		r.writeInt(33);

		r.close();
	}

	public static void writeFile_1() throws IOException
	{
		RandomAccessFile r = new RandomAccessFile("bmw.txt", "rw");
		r.seek(8*3);
		r.write("大威".getBytes());
		r.writeInt(66);

		r.close();
	}

	public static void readFile() throws IOException
	{
		RandomAccessFile f = new RandomAccessFile("bmw.txt", "r");
		
		f.seek(8);  // 设置指针指向 还可以跳过指定的字节数   skipBytes()
		// 创建一个字节数组，读入字节数组， 新建buf字符串对象   读取对象中的数字  关流
		byte[] bt = new byte[4];
		f.read(bt);         // 将信息读入bt中
		String name = new String(bt);
		int age = f.readInt();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);

		f.close();
	}
}
