/*
设计模式：解决某一类问题最行之有效的方法。
java中23种设计模式：
单例设计模式：解决一个类在内存中只存在一个对象。

想要保证对象的唯一性。
1.为了避免其他程序过多建立该类对象，先禁止其他程序建立该类对象。
2. 还为了让其他程序可以访问该类对象，只好在本类中，自定义一个对象。
3. 为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。
 
这三步怎么用代码体现：
1. 将构造函数私有化，
2. 在类中创建一个本类对象
3. 在本类中定义一个可以访问这个对象的函数

单例设计模式在class类中的应用
*/

class Single
{
	private int num;

	public void setNum(int num)
	{
		this.num = num;
	}

	public int getnum()
	{
		return num;
	}

	private Single(){}

	private static Single s = new Single();
	public static Single getSingle()        // 因为不能用方法调用，只能用类名调用，而 类名调用必须是静态的，所以必须加static修饰
	{
		return s;
	}
}


class  SingleDemo
{
	public static void main(String[] args) 
	{
		/*
		//Single s1 = new Single();
		//Single ss = new Single();
		Single s1 = Single.getSingle();
		Single ss = Single.getSingle();
		s1.setNum(10);
		System.out.println(ss.getnum());
		//System.out.println("Hello World!");
		*/
		
		//Student a1 = new Student();
		//Student a2 = new Student();
		Student a1 = Student.getInstance();
		Student a2 = Student.getInstance();
		a1.setAge(30);
		System.out.println(a2.getAge());
	}
}

class Student
{
	private int age = 20;
	// 开始应用单例设计的思想： 本类中仅允许一个对象。
	private  Student(){}       // 将构造函数私有化

	private static Student c = new Student();          // 在本类中创建一个对象
	// 创建一个可以访问该类的方法
	public static Student getInstance()
	{
		return c;
	}

	public  void setAge(int age)
	{
		this.age = age;
	}

	public  int getAge()
	{
		return age;
	}

}

 