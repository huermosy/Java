/*
IO�����и��ļ���
���˼·��
1.�����и����
	�ļ����������壬 ������ʽ�����ļ�������� ����һ��byte���͵�����
	����һ���ļ���ȡ��ASCII��Ĵ洢������ ����һ���ļ����ı�����
	��ʼ��ȡ�ļ�������ʽ��ɣ���������д���ļ���Ҫ�ں����ڲ�����������һ���и����  �洢������Ϊpart
	�������и����
2.����ϳɺ�����
	����һ��ArrayList���͵��б���ס����
	forѭ������и���part������ӡ�
	����һ�������������Ҷ���һ�������ڲ����ö�ٵĶ��������￴����������ʱ��һ�£�
	��ȡö�ٵ�Ԫ֮�󣬷���SequenceInputStream�ϲ����У�
	���������������byte����Ԫ�飬���峣��ASCII��Ȼ�����readд�������
	������������

*/

import java.io.*;
import java.util.*;

class SplitFile 
{
	public static void main(String[] args) throws IOException
	{
		merge();
	}

	public static void split() throws IOException
	{
		FileInputStream fi = new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\1.jpg");
		FileOutputStream fo = null;
		byte[] bt = new byte[1024*100];
		int len = 0;
		int count = 0;
		while((len = fi.read(bt))!=-1)
		{
			count++;
			fo = new FileOutputStream("D:\\Learning materials\\java\\java_\\day20\\t1.txt\\"+count+".part");
			fo.write(bt,0,len);
			fo.close();
		}
		fi.close();
	}


	public static void merge() throws IOException
	{
		ArrayList<FileInputStream> li = new ArrayList<FileInputStream>();

		for(int x=1; x<5; x++)
		{
			li.add(new FileInputStream("D:\\Learning materials\\java\\java_\\day20\\t1.txt\\"+x+".part"));
		}

// ������ֵĶ���������ʱ����⣬��������Ϊ�˵õ�Enumeration�Ķ���
		Iterator<FileInputStream> it = li.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fw = new FileOutputStream("D:\\Learning materials\\java\\java_\\day20\\t1.txt\\change.bmp");
		int len = 0;
		byte[] bt = new byte[1024];
		while((len = sis.read(bt))!=-1)
		{
			fw.write(bt,0,len);
		}
		fw.close();
		sis.close();
	}
}
