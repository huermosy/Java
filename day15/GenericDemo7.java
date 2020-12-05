/*
���Ͽ�ܣ������޶�2��
���˼·���������µ��࣬�ֱ���Worker���Student�ࣻȻ����������������������Ұ�����������
Ȼ���õ��������еĶ��������   �����ٶ���һ��Comparator����Ƚ������õ��Ľ��ۣ����Ϳ����ø���ķ���������ֱ���ø���Ļ��ή����չ��

������������У�E���ָ�ʽ��Ҫ������Ӧ�ķ��ͣ�����������֮���û�ж�Ӧ�İ�ȫ������
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
		
		// ����һ��������
		Iterator<Student> it = s1.iterator();
		while(it.hasNext())
		{
			System.out.println("�����"+it.next().getName());    // 
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