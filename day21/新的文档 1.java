/*
IO����ת�������ַ����룩
UTF-8�ĺ��壺�����3���ֽ�װ��Ҳ������1���ֽ�װ��
GBK���й������ı�����������ں��˸�����������ַ��š�
��Щ����GBK,��Щ����UTF-8,���Դ���ת����֮������⡣

*/

import java.io.*;
class  EncoderStream
{
	public static void main(String[] args) throws IOException
	{
		Writefile();
 	}

	public static void Readfile() throws IOException
	{
	
	}

	public static void Writefile() throws IOException
	{
		OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("GBK.txt"));

		fw.write("���");
		fw.close();
	}
}
