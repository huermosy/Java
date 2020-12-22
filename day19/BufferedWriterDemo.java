/*
缓冲区的出现是为了抬高流的操作效率而出现的
所以在创建缓冲区之前，必须要现有流对象。
该缓冲区提供了一个跨平台的换行符

把缓冲区形象的理解为一个瓶子， 如果没有瓶子，我们喝水的效率会很慢，缓冲区就相当于给我们提高效率使用的东西

思路：创建一个流对象， 然后再创建一个容器对象，将流对象装进容器对象之中。 然后使用容器的方法进行一些操作，写入，刷新和关闭
*/

import java.io.*;
class  BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter fw1 = new BufferedWriter(fw);   // 将流对象装进容器之中。

		for(int x = 0; x<8; x++)
		{
			fw1.write("abc"+x);
			fw1.newLine();
			fw1.flush();
		}
		fw1.close();
//		System.out.println("Hello World!");
	}
}
