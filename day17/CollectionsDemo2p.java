/*
Collections  reverseOrder 这一个工具类
用treeset这个数据结构来做
Collections-SynList  并且又学了两个Collections工具类的API 分别是swap和shuffle
*/
import java.util.*;

class StrLencompartor implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		else if(s1.length()<s2.length())
			return -1;
		else
			return s1.compareTo(s2);
	}
}

class  CollectionsDemo2p
{
	public static void main(String[] args) 
	{
		OrderDemo();
 	}

	public static void OrderDemo()
	{
		TreeSet<String> s = new TreeSet<String>(Collections.reverseOrder()); 
		s.add("a");
		s.add("huermosy");
		s.add("zwa");
		s.add("a");
		s.add("liuneng");
		sop(s);
 		Iterator it = s.iterator();    // 用迭代器取出
		while(it.hasNext())
		{
			String st = (String)it.next();     // 一个向下转型，因为sop中传入得是String类型
			sop(st);
		}
	}

	public static void sop(Object str)    // 因为输出是一个List中的内容，传入String类型的数据类型会报错。  用Object这个上帝是没有错的，只不过缺点是不能使用特有的方法 ，可以传入List<String>这个数据类型。
	{
		System.out.println(str);
	} 
}
