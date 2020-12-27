/*
Class Properties
该对象的特点：可以用于键值对形式的配置文件。
那么在加载数据时，需要数据有固定格式：键=值

getProperty(String key) 
在这个属性列表中搜索指定的键的属性。 

setProperty(String key, String value) 
调用方法 put Hashtable。 

stringPropertyNames() 
在这个属性列表中返回一组键，其中键和它的对应值是字符串，包括在默认属性列表中的不同键，如果同一个名称的一个键没有从主要属性列表中找到。 


演示：如何将流中的数据存储到集合中。
想要将info.txt中的简直数据存到集合中进行操作。
1.用一个流与info.txt文件关联。
2. 读取一行数据，将该行数据用"="进行切割。
3.等号左边作为键，右边作为值。存入到Properties集合中即可。

store(OutputStream out, String comments) 
写这个属性列表（关键元素对）在这 Properties表格式来合适的输出流加载到一个 Properties表使用 load(InputStream)方法。 
用store将结果存储到流中
*/

import java.util.*;
import java.io.*;

class  PropertiesDemo
{
	public static void main(String[] args) throws IOException
	{
		// method_1();
		loadDemo();
	}

	public static void loadDemo() throws IOException
	{
		Properties p = new Properties();
		FileInputStream w = new FileInputStream("info.txt");
		p.load(w);     // 将流中的数据加载进集合
		p.setProperty("wangwu","32");
		FileOutputStream w1 = new FileOutputStream("info.txt");
		p.store(w1,"try1");
		System.out.println(p);
	}

	// 这是load的一个底层原理
	public static void method_1() throws IOException
	{
		BufferedReader fr = new BufferedReader(new FileReader("info.txt"));
		String len = null;
		Properties prop = new Properties();
		while((len = fr.readLine())!=null)
		{
			String[] arr = len.split("=");
			prop.setProperty(arr[0], arr[1]);
//			System.out.println(len);
		}
		System.out.println(prop);
		fr.close();

	}

	public static void setAndGet()
	{
		Properties p = new Properties();

		p.setProperty("zhangsan","38");
		p.setProperty("lisi","23");
		
		sop(p);
		String value = p.getProperty("zhangsan");
		sop(value);

		// 将Properties转换成集合的形式
		Set<String> names = p.stringPropertyNames();
		for(String name:names)
		{
			sop(name);
		}

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
