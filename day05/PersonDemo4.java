/*
作者：huermosy
this函数只能用在构造函数的第一行。 初始化的语句要先执行。
*/
class Person
{
	private int age;
	private String name;
	
	Person()
	{
	
	}

	Person(String name)
	{
		this.name = name;
	}

	Person(String name, int age)
	{
		this(name);  // 这样的传递方式只适用于构造函数之间的传递。 本来是 this.name = name;
		this.age = age;
	}

	public void speak()
	{
		System.out.println("name:"+name+"..."+"age:"+age);
	}
}


class  PersonDemo4
{
	public static void main(String[] args) 
	{
		Person p = new Person("huermosy", 14);
		p.speak();
		// System.out.println("Hello World!");
	}
}
