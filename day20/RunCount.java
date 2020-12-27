/*
IO����Properties��ϰ��

˼·����������
�½�һ��Properties��
Ϊʲôһ��Ҫ�����������ļ�����Ϊ�����ڴ��п��ܻ���ʧ�������˳��������������ļ�����Ա������ݡ�

�½��ļ�������ļ������ڣ��򴴽�һ���ļ��������ļ��ĺ�׺��Ϊ.ini���������ļ��ĸ�ʽ
���ļ��������������ļ���  ���ҽ����е����ݼ��ؽ����ϡ�
���峣��count�����һ�ȡ�����еļ�time��getProperty��������ܹ�����һ��ֵ�����ֵΪnull��+1�������Ϊnull����Integer����Ϊ�������֡�

���������������д��ȥ��setProperty��һ�����������Ҷ���������ļ���  ��store�������ڴ����洢������
�ǵù�����
�����Ķ���������count����һ���Ĵ������˳���
*/


import java.io.*;
import java.util.*;

class  RunCount
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		File f = new File("count.ini");
		if(!f.exists())
			f.createNewFile();
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);        // �������ؽ��뼯����

		int count = 0;
		String value = prop.getProperty("time");
		if(value!=null)
		{
			count = Integer.parseInt(value);
			if(count>4)
			{
				System.out.println("�����ˣ�������ֵ��");
				return;
			}
		}
		count+=1;

		prop.setProperty("time",count+"");
		FileOutputStream fos = new FileOutputStream("count.ini");
		prop.store(fos,"");        // ��Properties�洢������
		fis.close();
		fos.close();
 	}
}
