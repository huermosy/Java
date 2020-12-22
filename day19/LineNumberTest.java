//���ڿ�ʼ��ģ��,��������Ҫ�ĺ������ֳ�������
/*
int getLineNumber() 
��ȡ��ǰ��������  

void setLineNumber(int lineNumber) 
���õ�ǰ������  

String MyreadLine()  

Myclose()

�е�һЩ���ܿ��Դ�MyBufferedReader �и��̳�������
*/

import java.io.*;
import java.util.*;

class MyLineNumberReader extends MyBufferedReader
{	
 	private int linenum;      // ��˽�л����еı���
	MyLineNumberReader(Reader r)
	{
		super(r);
	}
	
	public String MyreadLine() throws IOException
	{
		linenum++;
		return super.MyreadLine();    // �����return�������Ϊ�ܵ�����Ĺ��ܺ�����ȥ��
		// ����һ��buffer����,��read�ķ�������д����,����ĩβ�ķ���ֵΪ-1
		/*
		StringBuilder buff = new StringBuilder();
		int num = 0;
		while((num = r.read())!=-1)
		{
			if(num == '\r')
			{
				continue;
			}
			else if(num == '\n')
			{
				return buff.toString();
			}
			else
			{
				buff.append((char)num);
			}
			 
		}
		if(buff.length()!=0)     
		{
			return buff.toString();      // �����ǽ����һ�е�num����ת�����ַ������ͣ�  ��Ϊ�����ܻ�û��ת����ţ����Ի�û�ж���
		}
		*/
	}

	public void setLineNumber(int lineNumber) 
	{
		linenum = lineNumber;
	}
	
	public int getLineNumber()
	{
		return linenum;
	}
/*
	public void Myclose() throws IOException
	{
		r.close();
	}
*/
}


class LineNumberTest 
{
	public static void main(String[] args) throws IOException
	{
		MyLineNumberReader r1 = new MyLineNumberReader(new FileReader("CopyText.java"));
		String n = null;
		r1.setLineNumber(100);
		while((n = r1.MyreadLine())!=null)
		{
			System.out.println(r1.getLineNumber()+"::"+n);
		}
		r1.Myclose();
		//		System.out.println("Hello World!");
	}


}
