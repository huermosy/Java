/*
Set<Map.Entry<k,v>> EntrySet
编程思路：在第一步，
	转换为Entry这种类似婚配的集合
第二步，第三步中的东西均有变化


*/
import java.util.*;

class MapDemo2 
{
	public static void main(String[] args) 
	{
		Map<String,String> m1 = new HashMap<String,String>();
		m1.put("06","zhangsan06");
		m1.put("01","zhangsan01");
		m1.put("03","zhangsan03");
		m1.put("04","zhangsan04");
		// 第一步：首先用entrySet() 将其转为对应键的Entry这种类似婚配一起的集合。
		Set<Map.Entry<String,String>> entryset = m1.entrySet();
		// 第二步：有了set集合就可以用到迭代器将键取出。
		Iterator<Map.Entry<String,String>> doubleset = entryset.iterator();
		
		// 第三步：有了获取键的迭代器，就可以通过map的get方法，把键对应的值从map中取出来。
		while(doubleset.hasNext())
		{
			Map.Entry<String,String> m2 = doubleset.next();
			String key= m2.getKey();
			String value= m2.getValue();
			System.out.println("key:"+key+","+"value:"+value);
		}
	}
}
