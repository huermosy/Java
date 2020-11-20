/*
Inner

这个匿名内部类的练习做的不太好，可以再尝试
*/

interface Inter   // 定义一个抽象类
{
	void method();
}

class Test
{
	// 第一种方法，不用匿名的方法，直接用的是内部类
	/*
	static class Inner implements Inter
	{
		public void method()     // 这里子类中定义方法的权限要大于父类
		{
			System.out.print("method run");
		}
	}
	*/
	static Inter function()
	{
	/*
	{
		return new Inner();
	}
	*/
		//第二种方法  补足代码，通过匿名内部类。
	 
		return new Inter()
		{
			public void method()
			{
				System.out.print("method run");
			}
		};
	}
 
}

class  InnerClassTest
{
	public static void main(String[] args) 
	{
		Test.function().method();      // 只有Inter类才能调用method方法  ，这里不太懂 理解一下

		/*
		Inter in = Test.function;
		in.method();
		*/
	}
}
