/*
ɾ��ԭ�� ��windows�У�ɾ��Ŀ¼����������ɾ����
��Ȼ�Ǵ�������ɾ��������Ҫ�õ��ݹ������
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
