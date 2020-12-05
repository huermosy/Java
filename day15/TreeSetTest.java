/*
练习：根据字符串的长度进行排序

compartTo()   可以让字符串调用，按照字符串的自然顺序排序。
*/
import java.util.*;

class  TreeSetTest
{
	public static void main(String[] args) 
	{   
		/*
		// 试一下用匿名函数的方法
		TreeSet s1 = new TreeSet(new  Comparator()
		{
			public int compare(Object o1, Object o2)      //   注意：compare里面的参数必须是Object  这个数据类型
			{
		// 来一个强转
		String s1 = (String)o1;
		String s2 = (String)o2;
		//return (s1.length() - s2.length());
		
		if(s1.length() > s2.length())
			return 1;
		if(s1.length() == s2.length())
			return s1.compareTo(s2);            // 按照自然顺序排序。
		return -1;
			}
			});        
			*/
		TreeSet s1 = new TreeSet(new  StrlenComparator());

		s1.add("huermosy");
		s1.add("liuneng");
		s1.add("datouwa");
		s1.add("ahao");
		s1.add("yangxiaopang");

		Iterator t1 = s1.iterator();
		while(t1.hasNext())     // 这里的这个含义要搞清楚
		{
			
			System.out.println(t1.next());
		}
		//System.out.println("Hello World!");
	}
}


class StrlenComparator implements Comparator
{
	public int compare(Object o1, Object o2)      //   注意：compare里面的参数必须是Object  这个数据类型
	{
		// 来一个强转
		String s1 = (String)o1;
		String s2 = (String)o2;
		//return (s1.length() - s2.length());
		
		if(s1.length() > s2.length())
			return 1;
		if(s1.length() == s2.length())
			return s1.compareTo(s2);            // 按照自然顺序排序。
		return -1;
		

	}
}
