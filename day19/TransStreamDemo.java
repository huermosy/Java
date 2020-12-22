/*
IO 流（读取转换流）
键盘录入的read方法都是字节流InputStream的方法，
能否将字节流转换成字符流，然后使用字符流的readLine方法呢，
通过查阅API  我们看到了一个类InputStreamReader    通过它，能够有效地将字节转换成字符

键盘录入最常见的写法，就是使用OutputStreamWriter 这一个类，通过它，可以不用System.out.println这样的输出语句
将字符流转换成字节流，


 
*/

import java.io.*;
class  TransStreamDemo
{
	public static void main(String[] args) throws IOException
	{
//		System.out.println("Hello World!");
//		InputStream f = System.in;    // 等待键盘录入
		// 从字节流到字符流的转换
//		InputStreamReader fr = new InputStreamReader(f);
		// 加一个缓冲器技术提高速度,BufferedReader创建一个使用默认大小缓冲区的缓冲字符输入流。
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));   // 将这三句话拼成一句话

//		OutputStream fw = System.out; // 控制台输出
//		OutputStreamWriter fw1 =new OutputStreamWriter(fw);
		// 这是一个缓冲技术， 能够使用缓冲区的特有方法
		BufferedWriter sb1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("new.txt")));   // 也来一个一和三

		String len = null;
		while((len = sb.readLine())!=null)
		{
			if("over".equals(len))
				break;
//			System.out.println(len.toUpperCase());
			sb1.write(len.toUpperCase());
			sb1.newLine();
			sb1.flush();
		}
	}
}
