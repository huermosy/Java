/*
需求1：通过InputStreamReader将字节流转换成字符流，然后输出为大写。
源：键盘录入。   目的：控制台。
需求2：将键盘录入的数据存储到一个文件中
源：键盘录入。    目的：文件
需求3：将一个文件的数据输出在控制台上
源：文件      目的：控制台

流的最基本规律：
最痛苦的就是流对象有很多，不知道该用哪个
通过三个明确来完成。
1.明确源和目的。（共2个选择）
源：输入流。 InputStream Reader
目的：输出流。 OutputStream Writer
2.操作的数据是否为纯文本。
是：字符流。
不是：字节流。

3.当体系明确后，在明确要使用哪个具体的对象。
通过设备来进行区分：
源设备：内存，硬盘，键盘。
目的设备：内存，硬盘，控制台。

1.将一个本文文件中的数据存储到另一个文件中，复制文件。
源：因为是源，所以使用读取流。InputStream Reader  这两个都可以选择
是不是操作文本文件。
是！这时就可以选择Reader
这样体系就明确了。
接下来要明确要使用体系中的那个对象。 明确设备：硬盘上的一个文件。
Reader体系中可以操作文件的对象是 FileReader
是否需要提高效率：是！ 加入Reader体系中缓冲区 BufferedReader。
FileReader fr = new FileReader("a.txt");
BufferedRead sb = new BufferedRead(fr);

目的: OutputStream Writer     这两个都可以选择。
是否为纯文本。
是！Writer。
设备：硬盘，一个文件。
Writer体系中可以操作文件的对象FileWriter
是否需要提高效率：是！加入Writer体系中的缓冲区 BufferedWriter
FIleWriter fw = new FileWriter("a_copy.txt");
BufferedWriter sb1 = new BufferedWriter(fw);

留一个练习
需求1：将一个图片文件中数据存储到另一个文件，复制文件。
源：因为是源所以有两个选择：InputStream  和Read
因为是图片 所以要用字节流，所以是InputStream
因为是文件，所以明确了体系，是FileInputStream
体系明确之后，知道了是在硬盘中的文件

目的：因为是目的所以有两个选择，OutputStream 和Write
因为存储到另一个的应该是图片文件
在明确了体系中后知道了是硬盘中的文件。

需求2：将键盘录入的数据保存在一个文件中。
	按照三步走的原则。
	这个需求中有源和目的都存在。
	那么分别分析。
	源： InputStream(字节流) Reader（字符流）
	是不是纯文本？是！ Reader

	设备：键盘。对应的对象是System.in.这个对应的是字节流
	为了操作键盘更加方便，转成字符流按照字符串操作时最方便的。
	所以既然明确了Reader，那么就从Reader类中找子类，将System.in转换成Reader。
	用了Reader体系中的转换流，InputStreamReader
	InputStreamReader i = new InputStreamReader(System.in);
	需要提高效率吗？需要！ BufferedReader
	BufferedReader bufr = new BufferedReader(i);

	目的： OutputStream  Writer
	是不是纯文本？ 是！Writer
	设备：硬盘，一个文件 使用 FileWriter
	FileWrtier f = new FileWrtier("c.txt");
	当然也可以写作为：  OutputStreamWriter f1 = new OutputStreamWriter("");
	------------------------------
	搞一个改良，就是希望存储的文件格式有不同的类型GBK 和 utf-8

*/
import java.io.*;
class  TransferStreamDemo2
{
	public static void main(String[] args) throws IOException
	{

		// 键盘的常见写法：
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter fw =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d1.txt"),"UTF-8"));  // 默认形式为GBK
		String line = null;
		while((line = fr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			fw.write(line);
			fw.newLine();
			fw.flush();
		}
		fr.close();
		fw.close();
  	}
}
