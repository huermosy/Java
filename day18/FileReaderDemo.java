// ����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ��������       FileReader
// Ҫ��֤���ļ��Ǵ��ڵģ���������ڣ��ᷢ���쳣FileNotFoundException  �����ļ��������һ������Ϊ-1����������ж��Ƿ���Ҫ�������

import java.io.*;
class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fw = new FileReader("demo.txt");
		int ch = 0;      // ����Ķ�����ASCII��
		while((ch = fw.read())!= -1)
		{
//			ch = fw.read();      // ���һ��ͷһ���ַ�
			System.out.print(ch);
		}

		fw.close();
//		System.out.println("Hello World!");
	}
}
