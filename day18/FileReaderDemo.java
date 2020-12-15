// 创建一个文件读取流对象，和指定名称的文件相关联。       FileReader
// 要保证该文件是存在的，如果不存在，会发生异常FileNotFoundException  读入文件流的最后一个数字为-1，根据这个判断是否需要读入完毕

import java.io.*;
class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fw = new FileReader("demo.txt");
		int ch = 0;      // 读入的东西是ASCII码
		while((ch = fw.read())!= -1)
		{
//			ch = fw.read();      // 获得一个头一个字符
			System.out.print(ch);
		}

		fw.close();
//		System.out.println("Hello World!");
	}
}
