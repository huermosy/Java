/*
集合框架（泛型限定2）
编程思路：搞两个新的类，分别是Worker类和Student类；然后在主函数类中输出，并且按照姓名排序。
然后用迭代器当中的东西输出。   并且再定义一下Comparator这个比较器，得到的结论：泛型可以用父类的方法，但是直接用父类的话会降低扩展性

如果类名后面有？E这种格式就要声明相应的泛型，在声明泛型之后就没有对应的安全警告了
*/

import java.util.*;
class  GenericDemo7
{
	public static void main(String[] args) 
	{
		TreeSet<Student> s1 = new TreeSet<Student>(new comp());
		s1.add(new Student("mls-41"));
		s1.add(new Student("mls-09"));
		s1.add(new Student("mls-21"));
		s1.add(new Student("mls-11"));
		
		// 创建一个迭代器
		Iterator<Student> it = s1.iterator();
		while(it.hasNext())
		{
			System.out.println("输出："+it.next().getName());    // 
		}
	}
}

class comp implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
}

class Person
{
	private String name;

	Person(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}

class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
}

class Worker extends Person
{
	Worker(String name)
	{
		super(name);
	}
}