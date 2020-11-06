/*
作者：huermosy
需求：认识二维数组，并且学会二维数组的遍历输出
*/
class  ArrayDemo4
{
	public static void main(String[] args) 
	{
		// System.out.println("Hello World!");
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		System.out.println(arr.length);     // 打印的是这个二维数组的长度
		System.out.println(arr[0].length);  // 打印的是这个二维数组中第一个小数组的长度

		// 用定义静态变量的方法定义二维数组变量
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0; x<=arr1.length-1; x++)
		{
			for(int y=0; y<=arr1[x].length-1; y++)
			{
				System.out.print(arr1[x][y]);
			}
		}
	}


}
