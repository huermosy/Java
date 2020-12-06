/*
需求：对学生对象的年龄进行升序

因为数据是以键值对形式存在的。
所以要使用排序的Map集合，TreeMap。
*/ 
import java.util.*;
class  MapTest2
{
	public static void main(String[] args) 
	{
		TreeMap<Student,String> m1 = new TreeMap<Student,String>(new SetNumcompare());     // 将比较器传入。
		m1.put(new Student("zhangsan06",20),"Beijing");
		m1.put(new Student("zhangsan02",22),"Tianjing");
		m1.put(new Student("zhangsan04",20),"Shanghai");
		m1.put(new Student("zhangsan11",19),"haining");
		m1.put(new Student("zhangsan04",20),"Luoyang");

		Set<Map.Entry<Student,String>> entryset = m1.entrySet();

		Iterator<Map.Entry<Student,String>> it = entryset.iterator();

		while(it.hasNext())
		{
			Map.Entry<Student, String> k_v = it.next();      // 将键值对取出
			Student key = k_v.getKey();
			String Value = k_v.getValue();
			System.out.println("key:"+key+"  "+"value:"+ Value);
		}
		//用Entry配对的方法
//		System.out.println("Hello World!");
	}
}


class SetNumcompare implements Comparator<Student>         // 按照年龄进行升序
{
	public int compare(Student s1, Student s2)
	{ 
		int num =  new Integer(s2.getAge()).compareTo( new Integer (s1.getAge()));    // 注意这里无法取消引用int的报错
		if(num == 0)
		{
			return s2.getName().compareTo(s1.getName());
		}
		return num;
	}

}



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