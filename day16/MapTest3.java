/*
练习：      获取该字符串中各个字母出现的次数；
希望打印的结果为：   {a:1,b:2.......}    以此类推

通过结果可以发现每个字母都有一个对应的次数，
说明字母与次数之间存在着一一对应的映射关系。

因此我们可以使用map集合。
为什么使用map集合？
当数据之间存在着映射关系时，就可以使用map集合。

思路：
1.将字符串转换为字符数组，因为要对每一个字母进行操作。   toCharArray()  将此字符串转换为一个新的字符数组。 

2.定义一个map集合，因为打印结果的字母有序，所以使用treemap集合

3.遍历数组。   相当于py中的那个思路
	用get方法括号中加键得到对应的值，并且如果值为空的话可以进行操作。
4.将map数据变成指定的字符串打印，这里就先打印一个map集合即可。

键是对应的字母，值时出现的次数


一个科普：
int和Integer的区别

1、Integer是int的包装类，int则是java的一种基本数据类型 

2、Integer变量必须实例化后才能被使用，而int变量不需要 

3、Integer实际是对象的引用，当new一个Integer时，实际上是生成一个指针指向此对象；而int则是直接存储数据值 。

4、Integer的默认值是null，int的默认值是0


*/

import java.util.*;

class  MapTest3
{
	public static void main(String[] args) 
	{
 
		toArray("dfefagduoahuermosy");
	}

	public static String toArray(String str)
	{
		char[] chs = str.toCharArray();         
		TreeMap<Character, Integer> t1 = new TreeMap<Character, Integer>();    
		
		for(int x = 0; x<chs.length; x++ )
		{
			Integer values = t1.get(chs[x]);   
			if(values==0)
			{
				t1.put(chs[x],1);
			}
			else
			{
				values++;
				t1.put(chs[x],values);
			}
			System.out.println(t1);
		}
		return null;
 	}
}
