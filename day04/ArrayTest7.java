/*
作者：huermosy
需求分析：将十进制转二进制，八进制，十六进制集成，做成一个高集成度的封装
步骤：1.
*/
class ArrayTest7 
{
	public static void main(String[] args) 
	{
		 
		to_binary(17);
		to_eight(17);
		to_hex(100);
		//System.out.println("Hello World!");
	}
	// 十进制转二进制

	public static void to_binary(int num)
	{
		trans(num,1,1);
		System.out.println(" ");
	}

	// 十进制转八进制
	public static void to_eight(int num)
	{
		trans(num,7,3);
		System.out.println(" ");
	}
	
	// 十进制转十六进制
	public static void to_hex(int num)
	{
		trans(num,15,4);
		System.out.println(" ");
	}

 
	public static void trans(int num, int base, int offset)    // 三个参数分别是要转换的参数、与上的值与偏移量
	{
		if(num==0)
		{
			System.out.print(0);
			return;
		}
		// 定义一个需要遍历的表格
		char[] chs = {'0','1','2','3',
			'4','5','6','7','8','9','A',
			'B','C','D','E','F'};
		// 定义一个可以存储数据的数组
		char[] arr = new char[32];
		// 定义一个指针
		int pos = arr.length;

		while(num!=0)
		{
			int temp = num & base;
			arr[--pos] = chs[temp];
			num = num >>> offset;
		}
//		System.out.println(pos);
		// 遍历数组实现输出
		
		for(int x = pos; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}

	}
}
