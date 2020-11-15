/*
作者：huermosy
需求；对public static void main(String[] args) 函数的一些探索  并且玩一遍参数传递， 掌握一下静态类的传递
*/
class  MainDemo
{
	public static void main(String[] args) 
	{
		String[] arr = {"haha", "xixi", "lala", "muamua"};
		MainTest.main(arr);        // 静态变量的类名调用方法
	}
}

class  MainTest
{
	public static void main(String[] args) 
	{
		for(int x=0; x<args.length; x++)
		{
			System.out.println(args[x]);
		}
	}
}

