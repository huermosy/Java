/*
面向对象(匿名内部类)
当内部类定义在局部时，有以下特点：
1. 不能够被修饰符给修饰
2. 可以直接使用外部类中的变量，而局部中的变量需要被final修饰，  好像没有发现这一点啊。。

匿名内部类就是没有名字的内部类，

1. 匿名内部类就是内部类的简写格式；
2. 定义内部类的前提：内部类必须实现一个接口或者继承一个类；
3. 匿名内部类的格式： new 父类名(){定义方法体}
4. 其实匿名内部类就是一个带有父类 搞出来的子类对象，并且方法体比较胖。理解为带内容的子类对象比较好。

	 new AbsDemo(){方法的定义}.方法名();   写法的理解：把一大段看做是一个对象； 因为没有Inner这个子类了，所以new一个
 AbsDemo()的父类，然后将方法写上。因为在子类中没有定义show方法，所以在父类后面跟上对应的方法名，补充完整，这一大段可以看做是一个对象，然后调用show()方法。
*/
abstract class AbsDemo
{
	abstract void show();
}


class Outer
{
	private int x;
	/*
	class Inner extends AbsDemo
	{
		void show(int a)
		{
			System.out.println(a);
		}
	}
	*/
	public void function()
	{
		// 和 new Inner() 类比     进而和 AbsDemo a = new Inner() 类比  其实这样可以理解为一个多态的方法

		new AbsDemo()          // 下面这个整体是AbsDemo的子类对象
		{
			void show()
			{
				System.out.println("x="+x);
			}
			void haha()
			{
				System.out.println("hahaha");
			}
		}.show();                  //   里面就是要输出的内容   可以看做是   new AbsDemo(){方法的定义}.方法名();   这是开发中玩awt的常用写法
		//a.show();
		// a.haha();     这一条编译不会通过，因为多态的编译看左边父类，因为AbsDemo中并没有定义  haha（）这一个方法。
 
	}
}

class InnerClassDemo4
{
	public static void main(String[] args) 
	{
		 new Outer().function();
 
	 
		//System.out.println("Hello World!");
	}
}

class InnerTest  // Object是所有类的上帝， 用匿名对象类做
{
	static class Inner
	{
		public void function()
		{}
	}

	public static void mian(String[] args)
	{
		new Inner().function;
	}
}