/* 关键字：Abstract
当多个类中定义的名字相同，（在这个例子中BaseStudent与AdvanceStudent功能的名字相同），只是功能主体不同； 这时可以向上抽取，只用到功能的定义，而不用到功能的主体
抽象：看不懂的东西，就有一个abstract

抽象的特点：
1. 当修饰的方法名用上abstract时，那么对应的类名也必须用abstract修饰
2. 方法名在同类中时必须同抽象
3. 抽象的类不能用来实例化，创建对象
4. 抽象类中的方法要被使用，必须用子类复写所有的方法，然后创建子类的对象调用。

抽象类的理解：抽象类更像是老板，发布一系列需求，但是具体不知道怎么做，它应当交给员工继承，当然不同的员工也会有对应同名但不同的实现方法。
*/
abstract class Person
{
	abstract void show();    // 抽象方法不能有主体
	/*
	{
		System.out.println("这是对人的显示");
	}
	*/
	void sleep()
	{
		System.out.println("躺着");
	}
}

class BaseStudent extends Person
{
	void show()
	{
		//super.show();          // 对父类中方法的继承 , 无法对父类中的抽象方法继承
		System.out.println("study");
	}

	
}

class AdvancedStudent extends Person
{
	void show()
	{
	//	super.show();          // 对父类中方法的继承
		System.out.println("study");    // 否则这个是对基础班的重写
	}
}
class  AbstractDemo
{
	public static void main(String[] args) 
	{
		//new BaseStudent().show();         // 匿名对象的创建然后调用方法, 只能使用一次
		BaseStudent s = new BaseStudent();         
		s.sleep();
		//new Person.show();       // 创建Perso对象，因为有abstract 所以会报错
		s.show();1
		new AdvancedStudent().show();
		//System.out.println("Hello World!");
	}
}
