// System.currentTimeMillis()  这是一个计算秒的函数 然后用字节流的缓冲器技术来拷贝复制图片, 并且来计算一下这个操作所需要的时间


import java.io.*;

class  Copypic2
{
	public static void main(String[] args) throws IOException
	{
//		System.out.println("Hello World!");
		long start = System.currentTimeMillis();
		copypict();
		long end = System.currentTimeMillis();
		System.out.println(end-start +"毫秒");
	}

	public static void copypict() throws IOException
	{
		MyBufferedInputStreamDemo bi = new MyBufferedInputStreamDemo(new FileInputStream("pict1.PNG"));	
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("pict6.PNG"));	

//		System.out.println("输出的第一个字节为："+bi.MyReader());
		int len = 0;
		while((len = bi.MyReader())!=-1)
		{
			bo.write(len);
		}
		bi.Myclose();
		bo.close();
	}
}
