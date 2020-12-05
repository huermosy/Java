/*���Ͽ��(ʵ��Comparator��ʽ����)
TreeSet�ĵڶ��ֱȽϷ���
�����ϲ����бȽ��е�ʱ����ʱ��������Ҫ�ں�����ʼ����ʱ�����Ԫ�ؾ��бȽ���
��ˣ���������Ƚ���compartor  �����г�ʼ����


������ͬʱ��equals������Comparator�Ƚ���ʱ����ȡ����Comparator�Ƚ�����
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
			Student s = (Student)t1.next();       // ��һ����̬
			sop(s.getName()+"�������ǣ�"+s.getAge());
		}

//		System.out.println("Hello World!");
	}
}

class Mycompare implements Comparator     // ��һ���ǰ�����������ıȽ���
{
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getName().compareTo(s2.getName());
	}
	
}


// �������ѧ����
class Student implements Comparable    // �ýӿ�ǿ����ѧ���߱��Ƚ��ԡ�
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

	public int compareTo(Object obj)     // �Զ�����
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("����ѧ������");
		Student p = (Student)obj;   // ��һ��ǿת
		System.out.println(this.name +"  compare to...."+ p.name);
		
		if(this.getAge()>p.getAge())
		{
			return -1;        // ����ͨ������ֵ��ȷ���������洢��˳��,  ���ǽ���
		}

		else if(this.getAge()==p.getAge())
		{
			return -(this.name.compareTo(p.name));
		}
		
		return 1;
	}
}