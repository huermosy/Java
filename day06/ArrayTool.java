/*
作者：huermosy
需求：静态的应用-工具类
每一个应用程序都有共性的功能，可以将这些功能进行抽取，独立封装。以便复用
虽然可以通过建立ArrayTool的对象使用这些工具方法，对数组进行操作。
发现了问题：1.对象是用于封装数据的，可是ArrayTool对象并未封装特有数据。
2.操作数组的每一个方法都没有用到ArrayTool对象中的特有数据。

这时就考虑，让程序更严谨，是不需要对象的。
可以将ArrayTool中的方法都定义成static，直接通过调用类名实现功能即可。

将方法都静态后，可以方便使用，但是该类还是可以被其他程序建立对象，
为了更加严谨，强制让该类不能建立对象。可以通过将构造函数私有化完成。
*/

/**这是一个可以对数组进行操作的工具类，该类中可以提供获取最值，排序等功能操作
@author huermosy
@version V1.1
*/
public class  ArrayTool
{
	/** 
	空参数构造函数
	*/
	private ArrayTool(){}
// 其中getMax与getMin是返回索引值的下标；
	/**
	获得一个整形数组中的最大值
	@param arr 接收一个int类型的数组
	@return 返回一个数组的最大值对应的索引值
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1; x<arr.length ; x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return max;
		//System.out.println("Hello World!");
	}

	/**
	获得一个整形数组的最小值
	@param arr 整形数组
	@return 返回一个数组的最小值对应的索引值
	*/
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return min;
		//System.out.println("Hello World!");
	}

// 直接按顺序排序, 按从小到大的顺序
	/**
	使得一个整形数组的从小到大排序
	@param arr 整形数组
 
	*/
	public static void selectSort(int[] arr)
	{
		for(int x=0; x<=arr.length-1 ; x++ )
		{
			for(int y=x; y<=arr.length-1; y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr, x, y);
				}
			}
		}
	}
	
// 冒泡排序,按从小到大排序
	/**
	使得一个整形数组的从小到大进行冒泡排序
	@param arr 整形数组
	*/	
	public static void bubbleSort(int[] arr)
	{
		for(int x =0; x<=arr.length-1 ; x++ )
		{
			for(int y=0; y<=arr.length-x-1 ; y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr, y, y+1);
				}
			}
		}
	}

// swap 函数交换两个数的位置
	/**
	给数组中的元素进行位置置换
	@param arr 整形数组  
	@param a 要置换的第一个位置    
	@param b 要置换的第二个位置
	*/
	private static void swap(int[] arr, int a, int b)      // swap函数外部不用调用 ，所以可以隐藏起来。
	{
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	// 打印输出
	/**
	打印数组中的元素
	@param arr 整形数组
	*/
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length ;x++ )
		{
			if(x!= arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
}
