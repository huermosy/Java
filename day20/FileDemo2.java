/*
IO����File������-�ļ��б�
�˽�һ��File���е�list��listRoots����������
static File[] listRoots() 
�г����õ��ļ�ϵͳ�� 
String[] list() 
���ص��ַ����ڸ�Ŀ¼�µĳ���·�������ļ���Ŀ¼����Ϊ���顣  

��һ�������ܹ��г��ܹ��й���Ȩ�޵Ĵ��̣��ڶ��������ܹ��г�c���о��嶼����Щ�ļ�


list() 
���ص��ַ����ڸ�Ŀ¼�µĳ���·�������ļ���Ŀ¼����Ϊ���顣 

��һ����ϰ�����˵�����·����������������ļ���Ŀ¼���õ�list(FilenameFilter Filter)�����綼������.java��Щ�ļ�

��ϰ��ʵ�֣��������ڲ����еķ�����д��ʵ�ֶ�Ӧ�Ĺ��ܣ�Ҫ�õ�endsWith���������ʵ�֡����Ҳ���accept��һ��api����
Ȼ��Ľ�һ�£���listFiles��list�ã���ΪlistFiles���Ѿ��кܶ෽���ˡ���Ϊ�õ�����File����б���� �õ������Ժ���Զ�β���
*/
import java.io.*;

class  FileDemo2
{
	public static void main(String[] args) 
	{
//		method_1();
//		method_2();
		method_4();
 	}
	
	// ��һ���Ľ���listFiles
	public static void method_4()
	{
		File f = new File("c://");
		File[] arr = f.listFiles();    

		for(File name:arr)
		{
			sop(name.getName()+"::"+name.length());
		}
	
	}


	// ������һ����ϰ��Ҳ���ǹ�����
	public static void method_3()
	{
		File f = new File("D:\\Learning materials\\java\\java_\\day20");
		String[] arr = f.list(new FilenameFilter()       // ����һ�������ڲ�����,����listΪһ���ַ�������
		{
			public boolean accept(File dir, String name)
			{
				return name.endsWith(".java");
			}
		});

		
		for(String name:arr)
		{
 			sop(name);
		}
	}

	public static void method_1()
	{
 		File[] files = File.listRoots();
		for(File f:files)
			sop(f);
	}

	public static void method_2()
	{
		File f = new File("c://");
		String[] names = f.list();
		for(String name:names)
			sop(name);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
