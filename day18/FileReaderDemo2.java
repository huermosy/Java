// �ļ���ȡ��ʽ��  ��������ķ�ʽ��ȡ


import java.io.*;
class FileReaderDemo2 
{
	public static void main(String[] args)  throws IOException     // �׳��쳣��
	{
		FileReader fw = new FileReader("demo.txt");
		char[] buf = new char[1024];
		int num = 0;
		while((num = fw.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,num));
		}
//		System.out.println("Hello World!");
	}
}