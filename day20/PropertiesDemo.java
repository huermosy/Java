/*
Class Properties
�ö�����ص㣺�������ڼ�ֵ����ʽ�������ļ���
��ô�ڼ�������ʱ����Ҫ�����й̶���ʽ����=ֵ

getProperty(String key) 
����������б�������ָ���ļ������ԡ� 

setProperty(String key, String value) 
���÷��� put Hashtable�� 

stringPropertyNames() 
����������б��з���һ��������м������Ķ�Ӧֵ���ַ�����������Ĭ�������б��еĲ�ͬ�������ͬһ�����Ƶ�һ����û�д���Ҫ�����б����ҵ��� 


��ʾ����ν����е����ݴ洢�������С�
��Ҫ��info.txt�еļ�ֱ���ݴ浽�����н��в�����
1.��һ������info.txt�ļ�������
2. ��ȡһ�����ݣ�������������"="�����и
3.�Ⱥ������Ϊ�����ұ���Ϊֵ�����뵽Properties�����м��ɡ�

store(OutputStream out, String comments) 
д��������б��ؼ�Ԫ�ضԣ����� Properties���ʽ�����ʵ���������ص�һ�� Properties��ʹ�� load(InputStream)������ 
��store������洢������
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
		p.load(w);     // �����е����ݼ��ؽ�����
		p.setProperty("wangwu","32");
		FileOutputStream w1 = new FileOutputStream("info.txt");
		p.store(w1,"try1");
		System.out.println(p);
	}

	// ����load��һ���ײ�ԭ��
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

		// ��Propertiesת���ɼ��ϵ���ʽ
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
