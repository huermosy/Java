// System.currentTimeMillis()  ����һ��������ĺ��� Ȼ�����ֽ����Ļ�������������������ͼƬ, ����������һ�������������Ҫ��ʱ��


import java.io.*;

class  Copypic2
{
	public static void main(String[] args) throws IOException
	{
//		System.out.println("Hello World!");
		long start = System.currentTimeMillis();
		copypict();
		long end = System.currentTimeMillis();
		System.out.println(end-start +"����");
	}

	public static void copypict() throws IOException
	{
		MyBufferedInputStreamDemo bi = new MyBufferedInputStreamDemo(new FileInputStream("pict1.PNG"));	
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("pict6.PNG"));	

//		System.out.println("����ĵ�һ���ֽ�Ϊ��"+bi.MyReader());
		int len = 0;
		while((len = bi.MyReader())!=-1)
		{
			bo.write(len);
		}
		bi.Myclose();
		bo.close();
	}
}