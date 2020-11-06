/*
作者：huermosy
需求分析：查找的算法
普通的查找步骤：1.输出为小标，所以是int类型
2.中间变量需要传入的值为数组arr，还有需要查找的数

折半查找的步骤：1.   2.        存在缺陷，数组得是有序的！

看了很多次视频需要好好理解一下
练习： 有一个有序的数组，想要将一个元素插入到该数组中，还要保证该数组是有序的。
*/
class  ArrayTest4
{

	public static void main(String[] args) 
	{
		int[] x = new int[]{1,2,3,4,6,7,8,9,10};  // 也可以写做为 int[] x = {}
		System.out.println("Index:"+halfIndex_2(x, 5));
	}
// 定义功能，获得key在数组中第一次出现的位置的下标，如果没有出现，则返回-1
	public static int getIndex(int[] arr, int key)
	{
		for(int x=0; x<arr.length; x++)      // 数组的遍历
		{
			if(arr[x] == key)
			{
				return x;
			}  
		}
		return -1;     // 表示没有找到，这里用-1来表示。
	}


	public static int halfIndex(int[] arr, int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length -1;
		mid = (max - min)/2;
		while(arr[mid] != key)
		{
			if(key > arr[mid])
			{
				min = mid + 1;
			}
			else if(key < arr[mid])
			{
				max = mid - 1;
			}
			if(min > max)        // 索引的最小值大于最大值 那么就是越界       这里一定要注意不能用else if 否则就不是一条语句，会跳过执行
			{
				return -1;
			}
			mid = (max + min) >> 1;     // 右移1位， 就相当于/2
		}
		return mid;               // 把这个ruturn后的值改为min 即新的元素为要插入的位置
	}

	// 折半的第二种方式
	public static int halfIndex_2(int[] arr, int key)
	{
		int min = 0, max = arr.length-1, mid;
		while(min<=max)
		{
			mid = (min + max)/2;
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return min;            // 把这个ruturn后面的值改为min  即为要插入的位置
	}
}
