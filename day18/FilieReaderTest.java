// ��ϰ����ȡһ��.java �ļ����Ҵ�ӡ�ڿ���̨�ϡ�

import java.io.*;
import java.util.*;

class  FilieReaderTest
{
	public static void main(String[] args)  throws IOException
	{
		FileReader fw = new FileReader("DateDemo.java");
		
		char[] arr = new char[1024];
		int num = 0;
		while((num = fw.read(arr))!=-1)     // ���ļ��еĶ�����������֮��
		{
			System.out.print(new String(arr, 0, num));      
		}

		fw.close();
//		System.out.println("Hello World!");
	}
}

