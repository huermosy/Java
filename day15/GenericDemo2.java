/*
编程的思路： 在原来的TreeSetTest.java  这个.java文件中加上对应的泛型，使之没有安全问题。
*/

import java.util.*;

class  GenericDemo2
{
	public static void main(String[] args) 
	{
		TreeSet<String> s1 = new TreeSet<String>(new LenCompareTo());

		s1.add("huermosy");
		s1.add("zhangzuguang");
		s1.add("qinchen");
		s1.add("linweixiang");
		s1.add("datouwa");

	Iterator<String> it = s1.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s+"="+s.length());
		}
//		System.out.println("Hello World!");
	}
}

class LenCompareTo implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = new Integer(s1.length()).compareTo(s2.length());
		if(num==1)
		{
			return 1;
		}
		if(num==0)
		{
			return s1.compareTo(s2);      // 按照自然顺序排序
		}
		return -1;
	}
}