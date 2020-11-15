/*
作者：huermosy
静态代码块， 格式：
static
{
}
作用：优先于main函数执行，用于初始化的时候使用
*/

class StaticCode
{
	static
	{
		System.out.println("a");
	}
}

class  StaticCodeDemo
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		New StaticCode();
		New StaticCode();
		System.out.println("Over!");
	}
	static
	{
		System.out.println("c");
	}
}
