/*
集合(增强for循环)
用一种高级遍历的方法     for(数据类型  变量名：被遍历的的集合(Collection)或者数组)
这种高级遍历方法底层调用的是迭代器的遍历方法

第一个是ArrayList的数组
对集合进行遍历。
只能获取集合元素，但是不能对集合进行操作。

迭代器除了遍历，还可以进行remove集合中元素的动作。
如果是用ListIterator，还可以在遍历过程中进行增删改查的动作。

创建一个Hashmap<>   分别用keySet()和entrySet()的方法将它取出
*/
// 思路：创建一个数组，然后用高级遍历方法将它输出。

import java.util.*;
class ForEachDemo 
{
	public static void main(String[] args) 
	{
		// 1.第一个要求的完成
		ArrayList<String> s = new ArrayList<String>();    // 创建一个列表类型的数组

		s.add("xixi");
		s.add("haha");
		s.add("hehe");
		s.add("dada");
		for(String str:s)
		{
			sop(str);
		}
		// 2.第二个要求的完成,第一种方法，直接集合取出
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(1,"hu");
		m1.put(2,"er");
		m1.put(3,"mo");

		Set<Integer> keyset = m1.keySet();   // 获取其中的键,返回值为一个set集合
		for(Integer key:keyset)          //   从set集合中取出东西
		{
			sop(key+":"+m1.get(key));
		}

		Set<Map.Entry<Integer, String>> entryset = m1.entrySet();    // 返回一个map对应的映射视图，也就是对应的集合。
		for(Map.Entry<Integer, String> ent: entryset)      // 也可以两步变成一步：Map.Entry<Integer, String> entryset = m1.entrySet())，将集合中的一对成对取出，变成一个个的小集合操作。
		{
			sop(ent.getKey()+":"+ent.getValue());
		}


//		System.out.println("Hello World!");
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
