/*
IO流（Properties练习）

思路：程序解读：
新建一个Properties类
为什么一定要用流来操作文件？因为放入内存有可能会消失（程序退出），而放入流文件则可以保存数据。

新建文件，如果文件不存在，则创建一个文件，并且文件的后缀名为.ini这种配置文件的格式
用文件输入流来操作文件，  并且将流中的数据加载进集合。
定义常数count，并且获取集合中的键time，getProperty这个方法能够返回一个值，如果值为null则+1，如果不为null则用Integer解析为整形数字。

将存完的数据重新写回去用setProperty这一个方法，并且定义输出流文件，  用store来将将内存结果存储到流中
记得关流。
新增的东西：就是count到了一定的次数会退出。
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
		prop.load(fis);        // 将流加载进入集合中

		int count = 0;
		String value = prop.getProperty("time");
		if(value!=null)
		{
			count = Integer.parseInt(value);
			if(count>4)
			{
				System.out.println("到期了，请您充值！");
				return;
			}
		}
		count+=1;

		prop.setProperty("time",count+"");
		FileOutputStream fos = new FileOutputStream("count.ini");
		prop.store(fos,"");        // 将Properties存储在流中
		fis.close();
		fos.close();
 	}
}
