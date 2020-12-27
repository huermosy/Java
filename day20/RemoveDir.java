/*
删除原理： 在windows中，删除目录从里面往外删除，
既然是从里往外删除，就需要用到递归操作。
*/

import java.io.*;

class  RemoveDir
{
	public static void main(String[] args) 
	{
		File f = new File("D:\\test");
		RemoveFile(f);
	}

	public static void RemoveFile(File f)
	{
		File[] arr = f.listFiles();

		for(int x=0; x<arr.length ; x++ )
		{
			if(arr[x].isDirectory())
			{
				RemoveFile(arr[x]);
			}
			System.out.println(arr[x].toString()+"....."+arr[x].delete());
		}

		System.out.println(f+"::dir::"+f.delete());
	}
}
