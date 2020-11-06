/*
作者：huermosy
需求：1.由给定的数组实现选择排序，并且知道选择排序的内涵。
	  2.由给定的数组实现冒泡排序，并且知道冒泡排序的内涵
步骤1：1.首先选择函数的步骤，因为是实现一个排序的目的，没有输出的数据类型，所以数据类型是void。
	   2.其次要用到的变量为int arr[]类型。
步骤2：其实与步骤1类似，就是算法不同

为了有高集成的封装，我们可以对函数代码做改进，这里我们首先可以对交换部分的函数做一个封装。

好好理解这个例子！！！！
*/
import java.util.*;      // 从外部导入库实现java的功能。


class  ArrayTest2
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{4 ,5, 7 ,2 ,1 ,7 ,8 };
		printarray(arr);
		bubbling(arr);             // 按最大值顺序排序的序列
		//Arrays.sort(arr);
		printarray(arr);
		 
	}


	public static void selectSort(int arr[])      // 实现选择排序功能的函数，从大大小排序的算法
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x; y<arr.length ;y++ )
			{
				Swap(arr, x, y);
			}
		}
	}

	public static void bubbling(int[] arr)   // 实现冒泡排序功能的函数,从大到小排序的算法。另一种实现方式 for(int x=arr.length-1; x>0; x--)
	{
		for(int x=0; x<arr.length; x++)          //  控制循环的次数  另一种实现方式 for(int y-0; y<x; y++)
		{
			for(int y=0; y<arr.length-x-1; y++)    // 控制冒泡取舍线的位置
			{
				Swap(arr, y, y+1);
			}
		}
		return;
	}

	// 以为数组的输出应该是遍历的形式，所以还要定义一个遍历输出的函数
	public static void printarray(int[] arr1)
		{
			System.out.print("[arr1: ");
			for(int x=0; x<arr1.length; x++)
			{
				 
				if (x != arr1.length-1)
				{
					System.out.print(arr1[x]+",");
				}
				else
				{
					System.out.println(arr1[x] + "]");
				}
			}
			return;
		}


	public static void Swap(int[] arr, int x, int y)
		{
			 int temp;
			 if(arr[x]<arr[y])
			 {
				 temp = arr[x];
				 arr[x] = arr[y];
				 arr[y] = temp;
			 }
		}
}
