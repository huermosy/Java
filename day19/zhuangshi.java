/*
需求：定一个Person，只有吃饭的功能，但是这明显是不够的，所以我们新增一个SuperPerson增强其中的功能，同时接受Person类

装饰设计模式：当原有的类中的功能需要增强的时候，就需要用到装饰设计模式，
装饰设计模式是自己定义一个装饰类，同时将需要装饰的对象传入到装饰类之中，从而实现功能增强的目的。

被装饰的对象需要传入到 装饰类中的构造函数之中。
复习：单例设计模式：就是确保一个类只有一个实例，有两种设计方法，分别是饿汉式与懒汉式。

*/

class Person
{
	public void chifan()
	{
		System.out.println("eating");
	}
}

class SuperPerson   // 这是一个装饰类，增强了第一个Person类中的功能。
{
	private Person p;
	SuperPerson(Person p)
	{
		this.p = p;
	}

	public void Superchifan()
	{
		//System.out.println("eating");
		p.chifan();      // 这一条语句的功能在原有的类中有，可以直接调用，说明了被装饰的关系。
		System.out.println("drinking");
		System.out.println("sleeping");
		System.out.println("cooking");
	}
}


class  Zhuangshi
{
	public static void main(String[] args) 
	{

		Person p = new Person();
//		p.chifan();
		SuperPerson p1 = new SuperPerson(p);
		p1.Superchifan();
//		System.out.println("Hello World!");
	}
}
