// ���ζ�ԭ�����е��ļ�����д

import java.io.*;

class  FileWriterDemo3
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
// ����һ������ʹ��fw����һֱʹ��
		FileWriter fw = null;   // ����һ��fw������
		try
		{
			fw = new FileWriter("xixi.txt",true);
			fw.write("��д����\r���һ��С�");
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