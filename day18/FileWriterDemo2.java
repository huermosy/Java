/*
I/O�쳣����   ��������Ҫ�׳��쳣�� try����
*/

import java.io.*;

class  FileWriterDemo2
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
// ����һ������ʹ��fw����һֱʹ��
		FileWriter fw = null;   // ����һ��fw������
		try
		{
			fw = new FileWriter("xixi.txt");
			fw.write("������ļ���д��������");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}

		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.close();  // �ر�ʱһ����ִ�е����
				}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
			 
		}
	}
}
