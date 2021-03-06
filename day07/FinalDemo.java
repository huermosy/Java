/*
理解一下关键字 final。
1. final 这个关键字能够修饰类、方法、变量
2. 当final修饰类时，那么作为这个类不可能作为父类，给其他类继承。
3. 在用final修饰方法的时候，不可以用来在进行复写， 一般进行复写那就是在子类之中
4. 用final修饰成员变量时，仅可以赋值一次，然后就不可以进行修改。
	在描述事物时，一些数据的出现是固定的，为了增加程序的可阅读性，一般用一个变量名来存储

5. 这个第五点知道就行，内部类定义在局部位置上时，只能访问该局部被final修饰的局部变量。
*/
class Demo      //  用finial修饰类名
{
	int x = 3;
	public static final double PI = 3.1415926;     // 将访问权限调到最大
	void show()
	{
		System.out.println("圆周率为：" + PI);
	}

}

class subDemo extends Demo
{	
	void show1()
	{
		super.show();   // 这个super是使用函数方法的继承, 在用final修饰父类方法后，还是可以继承父类的方法的。
	}
	void show()     // 在父类中用final修饰后 不可以复写
	{
		System.out.println(PI);
	}
}


class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		subDemo s = new subDemo();
		s.show();
	}
}
