/*
IO�����ϲ�����
	���˼·������һ��Vector���� Ȼ�������ļ���  ��Enumerationö�ٽ��ļ�����
	����һ��SequenceInputStream �ϲ���������ö�ٵ��ļ��� ���� �ļ��������
	�����ֽ����飬  ���Ұ����ֽ�����ĸ�ʽ���룬���ж���Ķ�����ASCII�룬���Ҷ���-1��Ϊ���һ�С�
	.write����д��������ļ������ֽ���������0����Ӧ��ASCII�룩
	������
*/


import java.util.*;
import java.io.*;
class  SquenceDemo
{
	public static void main(String[] args) throws IOException
	{
		Vector<FileInputStream> v1 = new Vector<FileInputStream>();

		v1.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\b1.txt"));
		v1.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\b2.txt"));
		v1.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\b3.txt"));

		Enumeration<FileInputStream> en = v1.elements();
		SequenceInputStream si = new SequenceInputStream(en);
		FileOutputStream fo = new FileOutputStream("D:\\Learning materials\\java\\java_\\day20\\b4.txt");
		byte[] bt= new byte[1024];
		
		int len = 0;
		while((len = si.read(bt))!=-1)
		{
			fo.write(bt,0,len);
		}
		si.close();
		fo.close();
	}
}