/*
这个练习可以好好看一下！！！ 还没有搞出结果来。。 浪费很多时间了，先过了

将自定义对象作为元素存到ArrayList集合中，并取出重复元素。
ex：存人对象，同姓名同年龄，实为同一个人，为重复元素。

思路：1.对人描述，将数据封装进入对象。
2.定义容器，将人存入。
3.取出。

要点：定义一个Person类， 用到的方法： Iterator   hasNext   next
	在去除重复元素之后还需要用迭代的方法取出元素

ArrayList判断contains是否包含依赖于equals方法，底层调用equals方法。
*/
import java.util.*;

class Person
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj)       // 这里还没有搞的怎么懂。。。。    自己查一下contains的api，然后再看一下其实contains用的就是equals的方法。
	{
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;  // 一个强转
		System.out.println(this.name+"====="+p.name);
		return this.name.equals(p.name) && this.age == p.age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
}


class  ArrayListTest2
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static ArrayList singleElement(ArrayList a)     // 去除重复元素
	{
		ArrayList newal = new ArrayList();
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();   // 将其作为对象存储
			if(!newal.contains(obj))     // 这里的contains调用的对象是Person类中调用的对象。。。
			{
				newal.add(obj);
			}
		}
		return newal;
	}


	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		ArrayList li = new ArrayList();
		li.add(new Person("Lisi",33));
		li.add(new Person("zhangsan",33));
		li.add(new Person("Lisi",33));
		li.add(new Person("wanger",33));
		li.add(new Person("Lisi",33));
		li.add(new Person("Lisi",33));
		li.add(new Person("wanger",33));

		li = singleElement(li);
		// 先来一个显示吧。。。
		Iterator it = li.iterator();
		while(it.hasNext())
		{	 
			 Person p = (Person)it.next();   // 这是一个强转
			 sop(p.getName()+"::"+p.getAge());
		}
//		ArrayList neo = singleElement(li);
 	}
}
