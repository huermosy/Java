// IO�����г�Ŀ¼���������ݣ�  �ݹ�
/*
���������õݹ�ķ�������ӡ��Ŀ¼�л��е�Ŀ¼��

�ݹ���ǵ��ú�������
1.�ݹ�Ҫע���޶�������
2.�ݹ�Ҫע��ݹ�Ĵ���������ջ�����

��ϰ1��1.�ݹ����㣺10����ת���ɶ����ơ�

��ϰ2������1+��n�����
*/


import java.io.*;

class FileDemo3 
{
	public static void main(String[] args) 
	{
/*		System.out.println("Hello World!");
		File dir = new File("D:\\Learning materials\\java\\java_");
		show(dir);
*/
//		toBin(10);
//		System.out.println(sum(100));
		File dir = new File("D:\\Learning materials\\java\\java_");
		show(dir,0);
	}

//   ��ϰ1�� ��һ����ת���ɶ����Ƶĳ�����������Ļ����Ի�һ�½ṹ��ͼ��
	public static void toBin(int number)
	{
		if(number>0)
		{
			toBin(number/2);
			System.out.println(number%2);
 		}
	}

// ��ϰ2�� ���ֵĺͣ���1�ӵ�n
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return sum(n-1)+n;
	}

	public static String getlevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("|--");
		for(int x = 0; x<level; x++)
		{
			sb.insert(0, "|  ");
		}
		return sb.toString();
	}

	public static void show(File dir, int level)
	{
 		File[] arr = dir.listFiles();
		
		level++;
		// ��һ������forѭ����ӡ���ļ�����
		/*
		for(int x=0; x<arr.length; x++)
		{
			System.out.println(arr[x]);
		}
		*/
		for(File name:arr)
		{
			System.out.println(getlevel(level)+name);
			if(name.isDirectory())
				show(name,level);
			else
				System.out.println(getlevel(level)+name);
		}
	}
}
