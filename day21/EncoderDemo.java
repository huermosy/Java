/*
�ַ�����  
1�����룺�����ö��Ķ�����ɿ������Ķ����� �ַ�������ֽ�����
2�����룺���������Ķ�����ɿ��ö��Ķ����� �ֽ��������ַ���

1.  String-->Byte[]  str.getBytes(charsetName);
2.  Byte[]-->String   new String(byte[],charsetName);

���˼·������һ�������ַ���������תΪ�ֽ����飬Ҳ���Ǳ��룬������飬�ǵ���Arrays�ķ��������������ɵ�ֵַ��
�ٽ�����ַ��������

���������õı��뷽ʽ��iso8859-1  ��ʶ�����ģ������ʱ������ȱ�һ���ٽ�һ�Ρ�  ��utf-8ʶ��������������ֽڹʲ���������gbk���
*/

import java.io.*;
import java.util.*;
class  EncoderDemo 
{
	public static void main(String[] args)  throws Exception
	{
		String s = "���";
		byte[] bt = s.getBytes("GBK");        
		System.out.println(Arrays.toString(bt));
		String s1 = new String(bt,"iso8859-1");
		System.out.println(s1);
		byte[] bt1 = s1.getBytes("iso8859-1");
		System.out.println(Arrays.toString(bt1));
		String s2 = new String(bt1,"gbk");
		System.out.println(s2);
	}
}
