// ͼƬ�Ĳ������ֽ����Ĳ���

import java.io.*;

class CopyPicture 
{
	public static void main(String[] args) 
	{
		FileInputStream fi = null;
		FileOutputStream fo = null;
		long start = System.currentTimeMillis();
		try
		{
			fi= new FileInputStream("D:\\Learning materials\\java\\java_\\day19\\pict.PNG");     // ��ȡͼƬ
			fo = new FileOutputStream("D:\\Learning materials\\java\\java_\\day19\\pict3.PNG");     // д��ͼƬ
	//		byte[] byt = new byte[1024];
			int num = 0;
			while((num = fi.read())!=-1)
			{
	//			fo.write(byt,0,num);
				fo.write(num);    // ��ASCII��ת��Ϊ��Ӧ���ֽ���,�������ַ����������˺ܶ�
			}
		}

		catch(IOException e)
		{
			System.out.println(e.toString());
		}

		finally
		{
			try
			{
				fi.close();
			}
			catch(IOException e)
			{
				System.out.println("��ȡͼƬ����");
			}
			try
			{
				fo.close();	
			}
			catch (IOException e)
			{
				System.out.println("д��ͼƬ����");
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start + "����");
	}
	
}
