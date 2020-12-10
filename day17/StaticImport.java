/*
StaticImport  静态导入     具体使用： 用import static 再导入具体的类名。
注意如果出现重名的函数或者方法那么就要写清楚具体的类名

*/

// 这里编写的思路：创建一个int类型的数组，然后用sort方法排序，为二分查找做准备，然后用toString转为字符串输出。

import java.util.*;
import static java.util.Arrays.*;
import static java.lang.System.*;

class  StaticImport
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,9,4,3};
		sort(arr);
		int index = binarySearch(arr,4);
		out.println(Arrays.toString(arr));
		out.println(index);
//		System.out.println("Hello World!");
	}
}
