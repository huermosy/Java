class Fu
{
	int num = 5;
	public void method1()
	{
		System.out.println("父类的方法1");
	}

	public void method2()
	{
		System.out.println("父类的方法2");
	}
}

class Zi extends Fu
{
	int num = 10;
	public void method1()  // 这是对父类的重写
	{
		System.out.println("子类的方法1");
	}
	
	public void method3()
	{
		System.out.println("子类的方法3");
	}
}
/*
一个小结： 看编译是否成功，看引用型变量中的类是否有方法。也就是看创建对象时左边的类中的方法
		  看运行是否成功，看创建对象所属的类中的方法是否存在，也就是看创建对象时右边的类的方法。
 总结：成员函数在多态调用的时候，编译看左边，运行看右边。

 
*/

class DuoTaiDemo4 
{
	public static void main(String[] args) 
	{
// 一个小的总结，无论是编译还是运行，在访问成员变量时，始终是调用 创建对象时左边类中的成员变量。
// 静态成员函数在多态调用的时候都是看左边
    
		Fu z = new Zi();         // 这是一个多态的调用
		Zi z = new Zi();
		System.out.println(z.num);   // 子类中的成员变量
		Fu f = new Fu();
		System.out.println(f.num);    // 父类中的成员变量
		z.method1();
		z.method2();
		z.method3();
		System.out.println("Hello World!");
	}
}
