/*
IO����ת�������ַ����룩
UTF-8�ĺ��壺�����3���ֽ�װ��Ҳ������1���ֽ�װ��
GBK���й������ı�����������ں��˸�����������ַ��š�
��Щ����GBK,��Щ����UTF-8,���Դ���ת����֮������⡣
�ֱ���һ�£�
��UTF-8�ĸ�ʽ��GBK�ĸ�ʽ;
��GBK�ĸ�ʽ��һ��UTF-8�ĸ�ʽ;
*/

import java.io.*;
class  EncoderStream
{
	public static void main(String[] args) throws IOException
	{
		Readfile();
		
 	}

	public static void Readfile() throws IOException
	{
//		InputStreamReader fo = new InputStreamReader(new FileInputStream("UTF.txt"));       // ������GBK�ĸ�ʽ��һ��UTF-8�ĸ�ʽ,  �������ĸ�ʽ
		InputStreamReader fo = new InputStreamReader(new FileInputStream("GBK.txt"),"UTF-8");       // ������UTF-8�ĸ�ʽ��һ��GBK�ĸ�ʽ�����Ϊ�ʺŵĸ�ʽ��

		int len = 0;
		char[] bt = new char[10];
		len = fo.read(bt);
		String s = new String(bt,0,len);
		System.out.println(s);

	}

	public static void Writefile() throws IOException
	{
		OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("GBK.txt"));

		fw.write("���");
		fw.close();
	}

		public static void Writefile1() throws IOException
	{
		OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("UTF.txt"),"UTF-8");

		fw.write("���");
		fw.close();
	}
}