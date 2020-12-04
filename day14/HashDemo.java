/*
搞一下哈希集合：
特点：1.无序    2.元素不可重复。
*/

import java.util.*;

class  HashDemo
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
		HashSet s1 = new HashSet();
		s1.add("java01");
		s1.add("java02");
		s1.add("java03");
		s1.add("java04");
		s1.add("java01");
		// 看一下这个第一次进入的元素的输出的值和第二次进入的元素的输出的值的区别，输出是一个boolean类型的
		sop(s1.add("java01"));
		sop(s1.add("java05"));

		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			sop("哈希表中的内容为："+it.next());
		}
	}

	public static void sop(Object obj) 
	{
		System.out.println(obj);
	}
}
