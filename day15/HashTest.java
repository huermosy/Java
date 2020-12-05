/*
|-- Set: 元素是无序的，(存入和取出的顺序不一定一致)，元素不可以重复。
	|--HashSet:底层数据是哈希表。
		HashSet 如何保证元素的唯一性？
			是通过元素的两个方法：hashCode和equals来完成
			如果元素的Hashcode相同，才会调用equals是否为true
			如果元素的HashCode不同，不会调用equals。

			注意：对于hashSet来判断元素是否存在，以及删除元素依赖的是hashCode()以及equals()方法。这与ArrayList不同，ArrayList仅仅依赖的是equals方法。

HashTest       集合框架(HashSet)自定义存储对象
这是一个关于自定义存储对象的练习。


equals和hashSet都是默认的方法，equals相等则不输出，不相等则输出
*/



import java.util.*;


class HashTest 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}


	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
		HashSet s1 = new HashSet();
		s1.add(new Person("lisi01",10));     // 只要创建了新的对象就会调用equals和hashCode() 这两个函数。
		s1.add(new Person("lisi02",11));
		s1.add(new Person("lisi03",12));
		s1.add(new Person("lisi04",13));
		s1.add(new Person("lisi01",10));
		
		Iterator t1 = s1.iterator();

		while(t1.hasNext())
		{
			Person p = (Person)t1.next(); // 因为add方法用的默认的参数是Object obj    .add(Object obj)  只有里面是obj才能进入任意对象，所以需要强转换。
			sop(p.getName()+"::"+p.getAge());	 
		}
	}
}

 

class Person
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int hashCode()
	{
		System.out.println(this.name+" hashCode:" );
		return name.hashCode() + age *88;     // 尽量保证哈希值唯一！这样的话就不需要比较了。 字符串本身有自身的hashCode()方法。
	}

	public boolean equals(Object obj)       // 这里还没有搞的怎么懂。。。。    自己查一下contains的api，然后再看一下其实contains用的就是equals的方法。
	{
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;  // 一个强转,才能用到p之中的东西，向下转型。
		System.out.println(this.name+"=="+p.name);     // 本类对象和外面传进来的对象进行比较。。  只是没有明确写出来  相当于    this.equals(p哈希表中对应的对象);
		return this.name.equals(p.name) && this.age == p.age;   // 判断姓名与年龄是否相等，相等的话就不输出，不相等才输出。
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
