/*
先学习一下字符流的特点：
既然IO是用于操作数据 ，那么数据的最常见体现形式为：文件。
可以操作文件来做主要的演示。

需求：在硬盘上，创建一个文件并写入一些文件数据

找到转梦用于操作稳健的Writer子类对象FileWriter  后缀名为父类，前缀名为对应的功能

*/

import java.io.*;    // 将io包中的FileWriter类导入

class  FileWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		// 创建一个FileWriter对象
		FileWriter f = new FileWriter("demo.txt");    // 创建一个类，有构造方法就可以创建。
		// 调用write方法，将字符串写入到流中
		f.write("zhenggege");
		// 刷新对象中缓冲中的数据
		f.flush();

		f.write("检测一下close这个方法是否有刷新的作用。");
		// close方法关闭流资源，但是在关闭流资源之前还是会刷新一下缓冲区，和flush的区别是：flush刷新之后流资源还是能继续使用，而close刷新之后就不能够使用。
		f.close();
//		f.write("haha");
//		System.out.println("Hello World!");
	}
}
