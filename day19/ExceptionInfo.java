/*
IO�����쳣����־��Ϣ��
��������һ��������ʱ���,������һ��SimpleDateFormat����һ��ʱ��ĸ�ʽ��
*/

import java.io.*;
import java.text.*;
import java.util.*;

class ExceptionInfo 
{
	public static void main(String[] args) 
	{
		try
		{
			int[] arr = new int[2];
			System.out.println(arr[3]);
			
		}

		catch(Exception e)
		{
			try
			{
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
				String s = sdf.format(d);   // �з���ֵ����
				PrintStream p = new PrintStream("Exception.log");
				p.println(s);
				System.setOut(p);	
			}
			catch(IOException e1)
			{
				throw new RuntimeException("��־�ļ�����ʧ��");
			}
			 
			e.printStackTrace(System.out);
		}
		 
 	}
}