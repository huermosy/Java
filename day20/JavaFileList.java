/*
��ϰ��
��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����洢��һ���ı��ļ��С�
����һ��java�ļ��б��ļ���

˼·��
1.��ָ����Ŀ¼���еݹ飻
2.��ȡ�ݹ�����е�java�ļ���·����
3.����Щ·���洢�������У�
4.����Щ����д��һ���ļ���


*/
import java.io.*;
import java.util.*;


class JavaFileList 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\Learning materials\\java\\java_\\day20");
		List<File> list = new ArrayList<File>();
		filetolist(f, list);
		System.out.println(list.size());
		File file = new File(f,"javatext.txt");
		writetoFile(list, file.toString());
  	}

	public static void filetolist(File f, List<File> list)
	{
 
		File[] arr = f.listFiles();
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x].isDirectory())
				filetolist(arr[x], list);
			else
				if(arr[x].getName().endsWith(".java"))
				{
					list.add(arr[x]);
				}
 		}
	}

	public static void writetoFile(List<File> list, String javaFile) throws IOException
	{
		BufferedWriter fw = null;
		try
		{
			 fw = new BufferedWriter(new FileWriter(javaFile));
			 for(File f:list)
			 {
				 String path = f.getAbsolutePath();
				 fw.write(path);
				 fw.newLine();
				 fw.flush();
		     }
		}

		catch(IOException e)
		{
			throw e;
		}

		finally
		{
			try
			{
				if(fw!=null)    // ��ֹ�ļ�û�ж��������������һ��ʼ���׳�����
				{
					fw.close();
				}
 			}

			catch(IOException e)
			{
				throw e;
			}
		}
	}
}
