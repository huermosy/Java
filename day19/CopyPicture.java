// 图片的操作是字节流的操作

import java.io.*;

class CopyPicture 
{
	public static void main(String[] args) 
	{
		FileInputStream fi = null;
		FileOutputStream fo = null;
		long start = System.currentTimeMillis();
		try
		{
			fi= new FileInputStream("D:\\Learning materials\\java\\java_\\day19\\pict.PNG");     // 读取图片
			fo = new FileOutputStream("D:\\Learning materials\\java\\java_\\day19\\pict3.PNG");     // 写入图片
	//		byte[] byt = new byte[1024];
			int num = 0;
			while((num = fi.read())!=-1)
			{
	//			fo.write(byt,0,num);
				fo.write(num);    // 将ASCII码转换为相应的字节流,但是这种方法明显慢了很多
			}
		}

		catch(IOException e)
		{
			System.out.println(e.toString());
		}

		finally
		{
			try
			{
				fi.close();
			}
			catch(IOException e)
			{
				System.out.println("读取图片有误");
			}
			try
			{
				fo.close();	
			}
			catch (IOException e)
			{
				System.out.println("写入图片有误");
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start + "毫秒");
	}
	
}
