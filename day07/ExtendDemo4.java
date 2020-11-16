/*
子类与父类构造函数之间的研究
在创建子类对象时，虚拟机先会运行父类的构造函数，因为虚拟机自身的隐式语句；然后再运行子类中的构造函数语句

为什么子类会访问父类中的构造函数，因为父类中的构造函数可以直接获取，子类想要得到值会先看一下父类中的构造函数是怎么先初试化的
*/


class Fu
{
	int num;

	Fu()
	{
		num = 60;
		System.out.println("FU run");
	}

	Fu(int x)
	{
		System.out.println("Fu run"+x);
	}
	

}

class Zi extends Fu
{
 
	Zi()
	{
		super(4); // 这里有一个隐式的语句 super();就算不写，虚拟机自己加
		System.out.println("Zi run"+num);
	}
}

class ExtendDemo4 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		Student t = new Student();
		t.method();
		
		System.out.println(z.num);
	}
}


// 继承的调用方法：构造函数的调用方法和 函数方法的调用方法的区别：
class Person
{
	private String name;

	Person(String name)
	{
		this.name = name;
		System.out.println(name);
	}

	void show()
	{
		System.out.println("这是父类的方法");
	}
}

class Student extends Person
{
	Student(String name)
	{
		super(name);
	}

	Student()
	{
		this(" ");    // this是调用本类中的构造函数
	}

	void method()
	{
		super.show();   // 函数方法的继承
	}
	
}


