/*
System:类中的方法和属性都是静态的。
out：标准输出，默认是控制台
in：标准输入，默认是键盘

描述系统一些信息。
获取系统属性信息：Properties getProperties();
*/

import java.util.*;
class  SystemDemo
{
	public static void main(String[] args) 
	{
		Properties pro = System.getProperties();
		// 因为Properties是Hashtable的子类，也就是Map集合的一个子类对象。
		// 那么可以通过map的方法取出该集合中的元素。
		// 该集合中存储的都是字符串没有泛型定义
		
 
		
		// 如何在系统中自定一些特有的信息呢？
		System.setProperty("hu","chenxi");
		// 获取指定属性信息
		String s1 = System.getProperty("user.home");
		System.out.println(s1);

		// 能否在jvm启动的时候，动态加载一些属性信息
		String s2 = System.getProperty("zhang");
		System.out.println(s2);
 
		//获取所有属性信息
		/*
		for(Object obj:pro.keySet())          // 使用增强的for取出
		{
			String value = (String)pro.get(obj);          // 这是一个强转
			System.out.println(obj+"::"+value);
		}
		*/
	}
}
