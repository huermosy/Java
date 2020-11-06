/*
作者：huermosy
需求分析：用查表法做十六进制的转换
步骤：1. 输出与中间变量与前面的分析一致
2.用查表法建立表;
3.通过算法建立表格;
查表法：将所有的元素临时存储起来。建立对应关系，在每次&15后的值作为索引查建立好的表，就能找到对应的元素
这样比-10+'a'简单很多   这个表的建立可以通过数据的形式来定义。

代码改进：为实现十六进制正常显示，用StringBuffer和reverse()打印反转。我们可以用另一种方法，就是用数组存储对应的数字,并且通过遍历整个数组做相应的反转。

这个案例逻辑性较高，好好理解一下！！
// 十进制转换为二进制的案例制表法
*/
class  ArrayTest6
{
	public static void main(String[] args) 
	{
		to_binary(10);
		// to_hex(60);
		// System.out.println("Hello World!");
	}

	public static void to_hex(int num)
	{	
		//StringBuffer sb = new StringBuffer();
		char[] chs = {'0','1','2','3','4',
			'5','6','7','8','9','A','B',
			'C','D','E','F'};
		/*
		for(int x = 0; x<8 ; x++ )
		{
			int temp = num & 15;
			sb.append(chs[temp]);
			// System.out.print(chs[temp]);
			num = num >>> 4;      // 逻辑右移
		}
		System.out.print(sb.reverse());
		*/
		// char 一个新的数组
		char[] arr = new char[8] ;
		int pos=arr.length - 1;    // 定义一个pos指针
		while(num!=0)
		{
			int temp = num & 15;
			arr[--pos] = chs[temp];         //逆向思维，从数组一开始 开始逆向输出。
			num = num>>>4;
		}
		// 逆向输出
		System.out.println("pos的值为:"+pos);
		for(int x=pos;x<=arr.length-1;x++)
		{
			System.out.print(arr[x]);
		}
	}
	public static void to_binary(int num)
	{
		// 定义一个查的表格
		char[] chs = {'0','1'};
		
		// 定义一个新的数组
		// 定义一个指针
		char[] arr = new char[32];
		int pos = arr.length;
		while(num != 0)
		{
			int temp = num&1;
			arr[--pos] = chs[temp];
			num = num >>> 1;

		}
		System.out.println("pos指针的值="+pos);
		for(int x=pos; x<=arr.length-1; x++)
		{
			System.out.print(arr[x]);
		}
	}
}
