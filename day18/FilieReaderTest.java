// 练习：读取一个.java 文件并且打印在控制台上。

import java.io.*;
import java.util.*;

class  FilieReaderTest
{
	public static void main(String[] args)  throws IOException
	{
		FileReader fw = new FileReader("DateDemo.java");
		
		char[] arr = new char[1024];
		int num = 0;
		while((num = fw.read(arr))!=-1)     // 将文件中的东西读到数组之中
		{
			System.out.print(new String(arr, 0, num));      
		}

		fw.close();
//		System.out.println("Hello World!");
	}
}

