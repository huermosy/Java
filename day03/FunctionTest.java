/*
作者：huermosy

需求1：定义一个矩形，做成函数
需求2：定义一个9*9乘法表的函数

编写思路1：1.函数的输出为一个*的矩形，这里用void类型表示
2.其中用到的变量为矩形对应的宽和高，这里用int类型表示

编写思路2：1. 输出为99乘法表，打印，所以函数的数据类型为void类型
2.为了能够使99乘法表能够做相应的变换，我们设置对应的未知数1个， 为了x*x 这一个表格的需求

*/
class  FunctionTest
{
	public static void main(String[] args) 
	{
		rectangele(3,4);   //为了得到一个3*4的矩形
		ninebynine(6);
		//System.out.println("Hello World!");
	}
	public static void rectangele(int x, int y)
	{
		for(int a=0; a<x; a++)
		{
			for(int b=0; b<y ; b++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 这是一个向上尖的表示形式，所以我们可以改变判断的条件
	public static void ninebynine(int x )
	{
		for(int a=1; a<=x; a++)
		{
			for(int b=1; b<=a ; b++ )
			{
				System.out.print(b+"*"+a+"="+(a*b)+"\t");
			}
			System.out.println();
		}
	}
}
