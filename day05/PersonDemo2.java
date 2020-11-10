/*
作者：huermosy
对象一键立就会调用与之对应的构造函数。
构造函数的作用：可以用于给对象进行初始化。

可以联想为，人一出生就有的事物，比如说：小孩子哭这一个行为。

构造代码块：对象一键立就运行，而且优先于构造函数执行。和构造函数的区别：
构造代码块是给所有对象进行统一初始化，而构造函数是给对应的对象初始化。
*/
class Person
{
	private int age;       // 私有化是用来修饰成员的。
	private String name = "lisi";
// 创建一个构造代码块

	{
		System.out.println("cry..........");
	}

	public void SetAge(String nam)        // 这个为name 成员变量对应的两个访问的方法，分别为set与get
	{
		name = nam;
	}

	public String GetAge()
	{
		return name;
	}
/*
	public void cry()
	{
		System.out.println("baby cry");
	}
*/
	Person()
	{
		System.out.println("name:"+name+",,"+"age:"+age);
		//cry();
	}
// 利用函数重载的思想，以此可以创建不同人的构造函数。

	Person(int a)
	{
		age = a;
		System.out.println("name:"+name+",,"+"age:"+age);
		//cry();
	}

	Person(int a, String nam)
	{
		age = a;
		name = nam;
		System.out.println("name:"+name+",,"+"age:"+age);
		//cry();
	}
	
}


class  PersonDemo2
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		Person p1 = new Person(3);
		Person p2 = new Person(5, "wangxiaoer");
		p.SetAge("nolisi");
		p.SetAge("still_lisi");
		System.out.println(p.GetAge());
	}
}
