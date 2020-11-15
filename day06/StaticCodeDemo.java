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
	int num = 9;

	StaticCode()
	{
		System.out.println("b");
	}

	static
	{
		System.out.println("a");
	}

	{
		System.out.println("c"+num);
	}

	StaticCode(int x)
	{
		System.out.println("d");
	}

	public static void show()
	{
		System.out.println("show run");
	}
}

class  StaticCodeDemo
{
	public static void main(String[] args) 
	{
		new StaticCode(4);
	}
	/*
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new StaticCode();
		new StaticCode();
		System.out.println("Over!");
	}
	static
	{
		System.out.println("c");
	}
	*/
}
