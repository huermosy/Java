/*集合框架(实现Comparator方式排序)
TreeSet的第二种比较方法
当集合不具有比较行的时候，这时候我们需要在函数初始化的时候就让元素具有比较性
因此，我们引入比较器compartor  来进行初始化。


当类中同时有equals函数与Comparator比较器时，采取的是Comparator比较器。
*/

import java.util.*;
class  TreeSetDemo2
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		TreeSet s1 = new TreeSet(new Mycompare());
		s1.add(new Student("guang",22));
		s1.add(new Student("chen",23));
		s1.add(new Student("hao",22));
		s1.add(new Student("yuhongchao",24));
		s1.add(new Student("hao",22));

		Iterator t1 = s1.iterator();
		while(t1.hasNext())
		{
			Student s = (Student)t1.next();       // 高一个多态
			sop(s.getName()+"的年龄是："+s.getAge());
		}

//		System.out.println("Hello World!");
	}
}

class Mycompare implements Comparator     // 这一个是按照行名排序的比较器
{
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getName().compareTo(s2.getName());
	}
	
}


// 创建这个学生类
class Student implements Comparable    // 该接口强制让学生具备比较性。
{
	private int age;
	private String name;

	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public int compareTo(Object obj)     // 自动调用
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");
		Student p = (Student)obj;   // 来一个强转
		System.out.println(this.name +"  compare to...."+ p.name);
		
		if(this.getAge()>p.getAge())
		{
			return -1;        // 这里通过返回值来确定二叉树存储的顺序,  这是降序
		}

		else if(this.getAge()==p.getAge())
		{
			return -(this.name.compareTo(p.name));
		}
		
		return 1;
	}
}