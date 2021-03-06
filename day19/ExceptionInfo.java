/*
IO流（异常的日志信息）
并且添加一个报错的时间点,并且用一个SimpleDateFormat来做一个时间的格式化
*/

import java.io.*;
import java.text.*;
import java.util.*;

class ExceptionInfo 
{
	public static void main(String[] args) 
	{
		try
		{
			int[] arr = new int[2];
			System.out.println(arr[3]);
			
		}

		catch(Exception e)
		{
			try
			{
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
				String s = sdf.format(d);   // 有返回值接收
				PrintStream p = new PrintStream("Exception.log");
				p.println(s);
				System.setOut(p);	
			}
			catch(IOException e1)
			{
				throw new RuntimeException("日志文件创建失败");
			}
			 
			e.printStackTrace(System.out);
		}
		 
 	}
}
