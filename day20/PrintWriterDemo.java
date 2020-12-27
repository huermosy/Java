/*
打印流
IO流（printWriter）
PrintWriter是字符流。 是OutputStream中的一个子类
其中最强的功能：println可以用这个方法直接将数据类型原样打印出去

构造函数可以接受的参数类型.
1. file对象。File
2. 字符串路径。String
3. 字节输出流。OutputStream
4. 字符输出流。 Writer

编程注释：
用字节流的形式读入文件，并且用缓冲区的方式提高效率。
定义一个输出流，用的是OutputStream的子类，PrintWriter
然后用readLine()方法操作读入文件，用println(可以查一下API它的优势)来操作输出文件输入
记得关流和抛异常。
*/
import java.io.*;

class  PrintWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter fw = new PrintWriter(new FileWriter("a.txt"),true);
		String line = null;
		while((line = fr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			fw.println(line.toUpperCase());
		}
		fr.close();
		fw.close();
	}
}
