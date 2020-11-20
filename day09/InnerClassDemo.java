/*
类中有类 嵌套功能
访问的规则：1.内部类可以直接访问外部类的成员，包括私有;
	这是因为省略了一个外部类的引用： 格式为   外部类名.this

2.外部类想要访问内部类中的成员，必须建立一个内部类的对象；当然还新学到了一种嵌套方法的建立对象访问的方式

访问格式：
1. 外部类访问内部类的格式  new 外部类名.内部类名（）.对应的方法名();

2.内部的类名可以被修饰
如：private     static
当内部类中有静态成员，那么该类必须是静态的


*/
class Outsider      // 这是一个外部类名的方法
{
	private static int x=3;

	 class Inner        // 这是一个内部类名 ;  静态内部类
	{
		int x = 6;
		public void function()
		{
			int  x = 4;
			System.out.println("Inner:"+ Outsider.this.x);    //   这里省略了一个Outersider.this
		}
	}

	public  void method()
	{
		Inner n = new Inner();
		n.function();
	}

	public void show()
	{
		System.out.println("Outsider");
	}
}



class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		Outsider o = new Outsider();
		o.method();

		//new Outsider.Inner().function();
		//System.out.println("Hello World!");

		// 还有直接访问内部成员的格式，当然一般不常用，通常都是用上面这个格式
		//Outsider.Inner i = new Outsider().new Inner();
		//i.function();
	}
}
