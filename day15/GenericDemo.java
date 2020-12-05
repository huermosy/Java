/* 集合框架:泛型的概述
编程的步骤：1.首先把基本的搞好，就是创建该创建的，打印该打印的。其中容器ArrayList中存放的东西是字符串,并且打印出其对应的长度
2.当在列表类型中加入一个数字类型就会报错。Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String。这是运行时期的出错
3.所以我们把容器加上对应的泛型，报错就会改为编译时期的报错。
4.讲报错的地方改正或者删除。

好处：1.将运行时的ClassCastException错误转移到了编译时期，方便于程序员解决问题，让运行时期的问题减少，更加安全。
2.避免了强制转换的麻烦。
*/
import java.util.*;

class  GenericDemo
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
		ArrayList<String> ls = new ArrayList<String>();

		ls.add("huermosy");
		ls.add("zhangzuguang");
		ls.add("qinneng");
		ls.add("nizhao");
//		ls.add(4);

		Iterator<String> it = ls.iterator();  // 创建迭代器; 因为迭代器中的泛型类型已经变成了String类型，所以强转可以把右边的String给省略
		while(it.hasNext())
		{
			String s1 = it.next();   //将object数据类型转换为String，因为object没有length()方法。
			System.out.println(s1+"="+s1.length());
		}
	}
}
