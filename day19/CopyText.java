// IO�� �������ı��ļ���
/*
����ԭ��
��ʵ���ǽ�c���µ��ļ����ݴ洢��D�̵�һ���ļ��С�
���裺
1. ��D�̴���һ���ļ�������������c���е��ļ�����
2.�����ȡ����C���ļ�������
3.ͨ�����ϵĶ�д������ݵĴ洢��
4.�ر��ļ�

�����ֿ�������,���Զ���һ��

��ϰ����һ�������������׳��쳣�ķ�������Ӧ���������ҲҪ�׳��쳣��
*/

import java.io.*;
class  CopyText
{
	public static void main(String[] args) throws IOException
	{
		copy_2();  
//		System.out.println("Hello World!");
	}

	public static void copy_1() throws IOException
	{
		FileReader fr = new FileReader("RunTimeDemo.java");
		FileWriter fw = new FileWriter("RunTimeDemo_copy.java");

		int num = 0;
		while((num = fr.read())!=-1)
		{
			fw.write(num);    // ������д��Ķ���ASCII��  û��Ҫ����Ӧ��ת��
		}
		fr.close();
		fw.close();
	}
	
	public static void copy_2()
	{
		// ������������
		FileReader fr = null;
		FileWriter fw = null;

		try
		{
			fr = new FileReader("RunTimeDemo.java");
			fw = new FileWriter("RunTimeDemo_copy1.java");
			char[] arr = new char[1024];
			int num = 0;
			while((num = fr.read(arr))!=-1)
			{
				fw.write(arr, 0, num);
			}
		}

		catch(IOException e)
		{
			sop(e.toString());
		}

		finally
		{
			try
			{
				if(fr!=null)
				{
					fr.close();
				}
			}
			catch(IOException e)
			{
				sop(e.toString());
			}

			try
			{
				if(fw!=null)
				{
					fw.close();
				}
			}
			catch(IOException e)
			{
				sop(e.toString());
			}
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
