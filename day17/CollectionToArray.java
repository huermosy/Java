/*
集合转数组  Collections 中的方法   toArray
Object[] toArray() 
返回一个数组，包含在这个列表中的所有元素在适当的顺序（从第一个到最后一个元素）。  
<T> T[] toArray(T[] a) 
返回一个数组，包含在这个列表中的所有元素在适当的顺序（从第一到最后一个元素）；返回数组的运行时类型是指定的数组的运行时类型。  

将集合中的元素转为数组用的是Collections工具类中的toArray方法，
如果数组的长度过小，就会创建新的数组存储;反之，如果新创建的数组的长度过大，那么剩余多的数组位置就会用null来补充。
所以，最好的方法就是创建一个正好大小的数组空间来存储。
*/

import java.util.*;

class  CollectionToArray
{
	public static void main(String[] args) 
	{
		List<String> ls = new ArrayList<String>();

		ls.add("datouwa");
		ls.add("gaugnguagn");
		ls.add("xixi");
		ls.add("dd");

		// 开始将集合中的元素转为数组
		String[] arr = ls.toArray(new String[ls.size()]);
		System.out.println(Arrays.toString(arr));
 	}
}
