/*
作者：huermosy
需求：1.了解this的使用。
2.比较两个同龄人的年龄，看是否相同。

this:看上去，是用于区分局部变量和成员变量同名的情况。
this 代表的是本类的对象，代表它所载函数所述对象的引用。
简单说，哪个对象在调用this所在的函数，this就代表哪个对象。
*/
class Person
{
	// 创建成员变量
	private int age;
	private String name="zhangsan";

	Person(int age)
	{
		this.age = age;
		//System.out.println("name:"+name+"..."+"age:"+age);
	}
	
	Person(String name, int age)
	{
		this.age = age;
		this.name = name;       // this代表的是所创建的类的那个对象。
		//System.out.println("name:"+name+"...."+"age:"+age);
	}

	public void speak()
	{
		System.out.println("name:"+this.name+"...."+"age:"+this.age);     // 其中this可以写也可以不写，仅影响阅读性。    毕老师指的是---     传智播客的毕老师指的是---
	}

	public boolean compare(Person p)
	{
		return this.age==p.age;
	}
}



class  PersonDemo3
{
	public static void main(String[] args) 
	{
		Person p = new Person(20);
		Person p1 = new Person("guangguagn", 20);     // 此时this 指代的对象就是p1。
		p1.speak();
		boolean b = p1.compare(p);
		System.out.println(b);
	}
}
