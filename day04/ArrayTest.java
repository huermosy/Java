/*
作者：huermosy
需求：给定一个数组，获取数组中的最大值和最小值
思路：1.获取最值需要进行比较，每一次比较都会有一个较大的值，因为该值不确定，通过一个变量进行临储
2. 让数组中的每一个元素都和这个变量中的值进行比较。如果大雨了变量中的值，就用该变量记录较大值
3. 当所有的元素都比较完成，那么该变量中存储的就是数组中的最大值了
步骤：
1.定义变量，初始化数组中的任意一个元素即可。
2. 通过循环语句对数组进行遍历。
3. 在变量过程中判断条件，如果遍历到的元素比变量中的元素大，就赋值给变量
*/
class ArrayTest 
{
	public static void main(String[] args) 
	{
		double[] arr = new double[]{2.0,3.0,4.0,5.0,6.0,7.0,8.0};
		System.out.println("max值为:"+Arraymax(arr));
		// System.out.println("min值为:"+Arraymin(arr));
	}

	public static int Arraymax(int[] arr)    // 定义最大值的函数
	{
		int temp = 0;
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]>0)
				temp = arr[x];
			 
		}
		return temp;
	}

	public static int Arraymin(int[] arr)    // 定义最小值的函数
	{
		int temp = 10;
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]<0)
				temp = arr[x];
			 
		}
		return temp;
	}
 
	public static double Arraymax(double[] arr)    // 以重载形式定义最大数值。
	{
		double temp = 0.0;
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]>0)
				temp = arr[x];
		}
		return temp;
	}
}
