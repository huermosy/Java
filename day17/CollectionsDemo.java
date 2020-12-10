/*
集合工具类：Collections
需求：对列表中的字符串元素做一个自然排序和一个长度排序

需求：掌握Collections-binarySearch的使用，以及写一个和它一样功能的方法
*/

import java.util.*;
class  CollectionsDemo
{
	public static void main(String[] args) 
	{
		maxDemo();
	}

	public static void maxDemo()
	{
		List<String> s = new ArrayList<String>(); 
		s.add("a");
		s.add("huermosy");
		s.add("zwa");
		s.add("a");
		s.add("liuneng");

//		sop(s);
		Collections.sort(s, new StrLenCompare());   // 经过Collections工具类排序
		sop(s);
//		Collections.sort(s, new StrLenCompare());   // 经过Collections工具类排序,   经过查阅API可以看到我们还可以通过第二个参数传入一个比较器类实现自定义的排序
//		String max = Collections.max(s, new StrLenCompare());      // 获得字符串之中元素的自然顺序最大值和长度的最大值。
//		int index = Collections.binarySearch(s,"huermosy");     // 返回指定的插入的位置。
//		sop(max);
		int index = HalfSort(s, "bc", new StrLenCompare());
		sop(index);
 	}

	public static void sop(Object obj)    // 因为输出是一个List中的内容，传入String类型的数据类型会报错。  用Object这个上帝是没有错的，只不过缺点是不能使用特有的方法 ，可以传入List<String>这个数据类型。
	{
		System.out.println(obj);
	} 
	// 创建一个比较器 实现implements   comparator

	// 创建一个折半排序的方法，也就是binarySearch的原理。
	public static int HalfSort(List<String> s2, String key, Comparator<String> cmp)
	{
		int min,mid,max;
		min = 0;
		max = s2.size()-1;        //  List容器是用的size， 数组用的是length
		while(min<=max)      // 如果min大于max则跳出循环。
		{	
			mid = (max + min)>>1;
			String var = s2.get(mid);     // 根据索引的位置得到元素
			// 字符串可以按照自然顺序比较
			int num = cmp.compare(var,key);
			if(num<0)
			{
				min = mid + 1;
			}
			else if(num>0)
			{
				max = mid - 1;
			}	
			else
			{
				return mid;
			}
		}
		return min;      // 如果查找没有成功则返回最小值的索引值。
	}
}



class StrLenCompare implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		else if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}