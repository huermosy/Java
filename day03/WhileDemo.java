/*
作者：huermosy
需求分析：实现一个while循环
编写思路：定义初始化表达式
		whlie(条件表达式)
		{
		循环体（执行语句）
		}
*/

class WhileDemo 
{
	public static void main(String[] args) 
	{
		int x = 3;
		/*
		while(x>-1)
		{
		System.out.println("Hello World!");
		x-=1;
		}
		*/
		do
		{
			System.out.println("Hello World!");
			x -= 1;
		}
		while(x>-1);

		do
		{
			System.out.println("Hello World!");
			x -= 1;
		}
		while(x>4);
/* 说明一下do while与while的区别
1.while先判断条件表达式，在执行循环体。
2.do  while无论如何会执行一次循环体，然后在经过条件表达式进行判断。
*/

	}
}
