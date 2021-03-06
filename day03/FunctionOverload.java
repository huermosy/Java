/*
作者：huermosy
需求分析：1.定义一个函数实现两个数相加。
2.重载这个函数，以完成更丰富的功能
编写思路：1.输出为整形，所以是int数据类型
2.一共要用到2个变量，所以定义两个int类型的变量
3.另一个代码为提高代码复用性，可以直接拿已经定义好的函数来传
*/
class FunctionOverload 
{
	public static void main(String[] args) 
	{
		System.out.println(add(1,2,3));
		ninebynine();
		//System.out.println("Hello World!");
	}

	public static int add(int x, int y)
	{
		return x+y;
	}
//这里是函数重载
	public static int add(int x, int y, int z)
	{
		return	add(x,y) + z;
	
	}
	public static void ninebynine(int num)
	{
		for(int x=1; x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+(y*x)+"\t");
			}
			System.out.println();
		}
	}
	public static void ninebynine()
	{
		ninebynine(9);
	}

}
