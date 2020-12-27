/*
练习：
将一个指定目录下的java文件的绝对路径，存储到一个文本文件中。
建立一个java文件列表文件。

思路：
1.对指定的目录进行递归；
2.获取递归过程中的java文件的路径；
3.将这些路径存储到集合中，
4.将这些数据写到一个文件中


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
				if(fw!=null)    // 防止文件没有读到的情况，就是一开始就抛出错误
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
