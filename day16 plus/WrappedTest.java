/*
练习：对一个字符串中的数值进行从小到大的排序
“20 78 9 -7 88 36 29”

编写的思路：
1.将字符串通过split方法分割成字符串数组;
2.将字符串数组转成int类型的数组;
3.将int类型的数组排序;
4.将排序后的数组转成字符串类型输出输出。
*/

import java.util.Arrays;      // 引入数组包，能够很快地排序

class  WrappedTest
{
	public static void main(String[] args) 
	{
		String s = "20 78 9 -7 88 36 29";    // 创建一个新的字符串
		System.out.println("排序前的输出："+s);
		String s1 = Stringsort(s);
		System.out.println("排序后的输出："+s1);
//		System.out.println("Hello World!");
	}
	
	public static String Stringsort(String s1)
	{
		// 1.将字符串通过split方法分割成字符串数组;
		String[] arr_str =  Stringsplit(s1);

		// 2.将字符串数组转成int类型的数组;
		int[] arr_int = StringInt(arr_str);

		// 3.将int类型的数组排序;
		ArraySort(arr_int);

		// 4.将排序后的数组转成字符串类型输出。
		String str1 = ArraytoString(arr_int);
		return str1;
		
	}
	
	public static String[] Stringsplit(String s1)
	{
		String[] st = s1.split(" ");       // 通过按空格分割可以得到每个元素为字符串的数组结构。
		return st;
	}

	public static int[] StringInt(String[] arr_str)
	{
		int[] arr_int = new int[arr_str.length];       // 开辟数组空间
		for(int x = 0; x<arr_str.length; x++)
		{
			arr_int[x] = Integer.parseInt(arr_str[x]);        // 将字符串解析为int类型的变量。
		}
		return arr_int;
	}
	 
	public static void ArraySort(int[] arr_int)
	{
		Arrays.sort(arr_int);
	}

	public static String ArraytoString(int[] arr_int)
	{
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<arr_int.length ;x++ )
		{
			if(x!=arr_int.length-1)
				sb.append(arr_int[x]+" ");    // 容器中添加元素。
			else
				sb.append(arr_int[x]);
		}
		return sb.toString();
	}

}
