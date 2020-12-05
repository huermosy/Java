/*
Set:无序，不重复的元素
	|--HashSet:  数据结构是哈希表
	|--TreeSet：可以对Set集合的元素根据ASCII码进行排序。
	底层数据结构是二叉树，为了保证数据元素的唯一性，用compareTo()方法，

	TreeSet排序的第一种方式，让元素自身具有比较性。
	元素需要实现Comparable接口，覆盖compareTo方法。
	这种方式也成为元素的自然顺序，或者叫默认顺序。

从编译失败的原因看：学生类没有比较性。所以要用comparable这个接口类。
TreeSet以比较实现功能，但是因为没有比较性   所以需要在student类中定义一个Comparable。
*/

import java.util.*;
class  TreeSetDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		TreeSet s1 = new TreeSet();
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