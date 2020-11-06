/*
作者：huermosy
需求：学会遍历数组
*/
class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		// 数组的操作；
		// 获取数组中的元素，通常会用到遍历；
		// System.out.println("Hello World!");
		int[] arr = new int[3];
		int[] arr1 = new int[]{3,4,5,6,7};
		for(int x=0; x<3 ; x++ )
		{
			System.out.println("arr["+x+"]="+arr[x]+";");      // 用遍历的方法来访问数组中的每一个元素。
		}
		System.out.println(arr1.length);
		for(int x=0; x<arr1.length;x++)     // 其中length属性可以直接获取数组中元素的个数
		{
			System.out.println("arr1["+x+"]="+arr1[x]+";");
		}
		printarray(arr1);
		//需求：用定义一个数组做，用于打印数组中的元素，并且用逗号隔开
		/*
		编写思路：1.输出是打印一段东西，所以函数的数据类型定义为void类型
		2.看看输入的变量,貌似不太需要。 好吧，还是需要数组类型的变量的
		*/
 
	}
		public static void printarray(int[] arr1)
		{
			System.out.print("[arr1:");
			for(int x=0; x<arr1.length; x++)
			{
				 
				if (x != arr1.length-1)
				{
					System.out.print(arr1[x]+",");
				}
				else
				{
					System.out.print(arr1[x] + "]");
				}
			}
			return;
		}
}
