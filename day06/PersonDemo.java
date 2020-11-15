/*
重点！ 理解一下对象的初始化过程
*/
class Person
{
	private String name;
	private int age;
	private static String country = "cn";      // 这里给一个static静态变量，因为国籍是很多共性的东西
	Person(String name, int age)       // 这是一个类的构造函数
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println(this.name+"..."+this.age);
	}

	public void countryshow()
	{
		System.out.println("country:"+country);
	}
}


class PersonDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/* Person p = new Person("zhangsan", 20);      这句话都执行了什么？
1. 因为有new这个关键字，所以通过jvm这个虚拟机找到Person.class 这一个文件
2. 静态代码块对类的初始化，如果有的话是对Person.class这个类进行初始化
3. 在堆内存中开辟空间，分配内存地址。（我的理解是创建了对象）
4. 在堆内存中建立对象的特有属性，默认的初始化代码的执行
5. 对属性的显示的代码块的初始化。
6. 对对象进行构造代码块的初始化
7. 对对象的构造函数的初始化。
8. 将内存地址赋给堆内存中的p变量。
*/
