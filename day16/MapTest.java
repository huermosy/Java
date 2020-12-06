/*
练习：每一个学生都有对应的归属地，
学生Student,地址：String
学生属性：姓名，年龄。
注意：姓名和年龄相同时为同一个学生，保证学生的唯一性。
*/

import java.util.*;

class Student implements Comparable<Student>
{
	private int age;
	private String name;

	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student t)
	{
		int num = new Integer(this.age).compareTo(t.age);
		if(num==0)
		{
			return this.name.compareTo(t.name);
		}
		return num;
	}

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	// 因为要保证元素唯一性，所以想到引入HashCode与equals方法
	public int hashCode()
	{
		return name.hashCode() + age*43;    // name也有其独特的哈希值的方法。
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student) )   // 抛出异常
			throw new ClassCastException("类型不匹配");
		Student s = (Student)obj;       // 强转，目的是为了能够使用字符串独特的方法。
		return  this.name.equals(s.name) && this.age == s.age;

	}

	public String toString()   // 这个转为字符串的函数挺重要的，能够直接将地址转换为字符串类型，否则的话需要用上面的函数进行调用
	{
		return name+ " : "+ age;
	}


}

class  MapTest
{
	public static void main(String[] args) 
	{
		Map<Student,String> m1 = new HashMap<Student,String>();
		m1.put(new Student("zhangsan06",20),"Beijing");
		m1.put(new Student("zhangsan02",22),"Tianjing");
		m1.put(new Student("zhangsan04",20),"Shanghai");
		m1.put(new Student("zhangsan11",19),"haining");
		m1.put(new Student("zhangsan04",20),"Luoyang");
		// 第一种方法： Entry这种配对的取出方法
		// 第一步：首先用entrySet() 将其转为对应键的Entry这种类似婚配一起的集合。
		Set<Map.Entry<Student,String>> entryset = m1.entrySet();
		// 第二步：有了set集合就可以用到迭代器将键取出。
		Iterator<Map.Entry<Student,String>> doubleset = entryset.iterator();
		
		// 第三步：有了获取键的迭代器，就可以通过map的get方法，把键对应的值从map中取出来。
		while(doubleset.hasNext())
		{
			Map.Entry<Student,String> m2 = doubleset.next();
			Student key= m2.getKey();
			String value= m2.getValue();
			System.out.println("key:"+key+","+"value:"+value);
		}	

		// 第二种方法，使用keyset这一种先取出键，再取出键对应的值
		// 第一步：用keySet方法取出对应的键放入Set集合中。
		Set<Student> s1 = m1.keySet();
		// 第二步，用迭代器将键存入
		Iterator<Student> st1 = s1.iterator();
		// 第三步，根据对应的键取出对应的值
		while(st1.hasNext())
		{
			Student k1 = st1.next();
			String v1 = m1.get(k1);
			System.out.println("Key:"+k1+"  ,  "+"Values:"+v1);
		}
	}
}
