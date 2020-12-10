/*
集合(Arrays)
几个常用的方法： asList
asList(T... a) 
返回由指定数组支持的一个固定大小的列表。 

toString(int[] a)     直接用就不用定义一个容器然后转换这么麻烦的操作了
返回指定数组的内容的字符串表示形式。 

将数组变成List集合有什么好处？ 可以利用集合的思想与方法来操作数组，
但是注意一点：不能对集合中的元素增删，因为数组的长度是固定的。否则会发生：Exception in thread "main" java.lang.UnsupportedOperationException 这一个报错的方式。 
能用:contains, get ,indexOf, subList();

如果数组中的元素都是对象，那么变成集合的时候，该数组中的元素就直接变成了集合中的元素。
如果数组中的元素都是基本数据类型，那么变成集合的时候，该数组本身就会变成集合中的元素
*/

import java.util.*;

class ArraysDemo 
{


	public static void main(String[] args) 
	{
		String[] str = {"a","bf","ed","fa"};
		List<String> s1 = Arrays.asList(str);
		sop(s1);
//		s1.add("guangguagn");
		sop("bf:"+s1.subList(1,3));
		int[] arr1 = {1,4,9,2};
		Integer[] arr1 = {1,4,9,2};     // 基本数据类型封装类封装成对象
		sop(arr1);
		List<Integer> list1 = Arrays.asList(arr1);
		sop(list1);
//		System.out.println("Hello World!");

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
