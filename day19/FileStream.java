/*
��Ҫ����ͼƬ���ݵ�ʱ��Ӧ���õ��ֽ���
����ʹ���ֽ���д���ļ� �õ�FileOutputStream ��һ����
Ȼ��ʹ���ֽ�����ȡ�ļ����õ�FileInputStream ��һ���ࡣ(�����ֽ����Ķ�ȡ����3�ַ�������ͨ�������飬����(available��һ������))
�ֽ������Բ���flushÿ��д���ʱ��ˢ��
*/
import java.io.*;

class FileStream 
{
	public static void main(String[] args) throws IOException
	{
//		FileWrite();
		FileRead_3();
//		System.out.println("Hello World!");
	}


	public static void FileWrite() throws IOException
	{
		FileOutputStream fw = new FileOutputStream("qq.txt");    // �����ֽ����Ĵ���

		fw.write("fajlfkd\r\nhuermosy".getBytes());    
		fw.close();
	}
// ��ͨ�Ķ�ȡ��ʽ
	public static void FileRead_1() throws IOException
	{
		FileInputStream fr = new FileInputStream("qq.txt");
		int num = 0;
//		byte[] bt = new byte[];
		while((num = fr.read())!=-1)
		{
			sop((char)(num));
//			bt.append(num);
//			sop(num.);
		}
		fr.close();
 	}
// ��������ķ�ʽ
	public static void FileRead_2() throws IOException
	{
		FileInputStream fr = new FileInputStream("qq.txt");
		int num = 0;
		byte[] bt = new byte[1024];
		while((num = fr.read(bt))!=-1)
		{
			sop(new String(bt,0,num));
		}
		fr.close();
 	}
// �ֽ������еĶ�ȡ��ʽ
	public static void FileRead_3() throws IOException
	{
		FileInputStream fr = new FileInputStream("qq.txt");
		int num = fr.available();
		byte[] bt = new byte[num];
		fr.read(bt);       // ���ı����е����ݶ��뵽�ֽ�������ȥ
		sop(new String(bt));
		fr.close();
 	}



	public static void sop(Object str)
	{
		System.out.print(str);
	}
}