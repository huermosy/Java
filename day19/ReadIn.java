/*
��ȡ����¼��
System.out  ��׼�����������̨
System.in   ��׼�����룬����

����ͨ������¼�����ݡ�
��¼��һ�����ݵ�ʱ�򣬾ͽ������ݴ�ӡ��
���¼���������over����ֹͣ��ӡ�˳���

�Լ���������һ�� System.in�Ĺ���
*/

import java.io.*;

class ReadIn 
{
	public static void main(String[] args)  throws IOException
	{
//		System.out.println("Hello World!");
		InputStream fi = System.in;     // ע�������FileInputStream�Ļ�¼������ļ��������ֱ�ӴӼ���¼�룬����Ӧ����������
		StringBuilder b = new StringBuilder();

		while(true)
		{
			int ch = fi.read();     // read����һ���ֽڵ�ASCII��
			if(ch=='\r')
			{
				continue;
			}

			if(ch=='\n')
			{
				String s = b.toString();
				if("over".equals(s))
					break;
				System.out.println(s.toUpperCase());
				b.delete(0,b.length());
			}

			else
			{
				b.append((char)ch);
				 
			}	 
		}
	}
}