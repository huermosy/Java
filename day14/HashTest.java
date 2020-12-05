/*
|-- Set: Ԫ��������ģ�(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
	|--HashSet:�ײ������ǹ�ϣ����
		HashSet ��α�֤Ԫ�ص�Ψһ�ԣ�
			��ͨ��Ԫ�ص�����������hashCode��equals�����
			���Ԫ�ص�Hashcode��ͬ���Ż����equals�Ƿ�Ϊtrue
			���Ԫ�ص�HashCode��ͬ���������equals��

			ע�⣺����hashSet���ж�Ԫ���Ƿ���ڣ��Լ�ɾ��Ԫ����������hashCode()�Լ�equals()����������ArrayList��ͬ��ArrayList������������equals������

HashTest       ���Ͽ��(HashSet)�Զ���洢����
����һ�������Զ���洢�������ϰ��


equals��hashSet����Ĭ�ϵķ�����equals��������������������
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
		s1.add(new Person("lisi01",10));     // ֻҪ�������µĶ���ͻ����equals��hashCode() ������������
		s1.add(new Person("lisi02",11));
		s1.add(new Person("lisi03",12));
		s1.add(new Person("lisi04",13));
		s1.add(new Person("lisi01",10));
		
		Iterator t1 = s1.iterator();

		while(t1.hasNext())
		{
			Person p = (Person)t1.next(); // ��Ϊadd�����õ�Ĭ�ϵĲ�����Object obj    .add(Object obj)  ֻ��������obj���ܽ����������������Ҫǿת����
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
		return name.hashCode() + age *88;     // ������֤��ϣֵΨһ�������Ļ��Ͳ���Ҫ�Ƚ��ˡ� �ַ���������������hashCode()������
	}

	public boolean equals(Object obj)       // ���ﻹû�и����ô����������    �Լ���һ��contains��api��Ȼ���ٿ�һ����ʵcontains�õľ���equals�ķ�����
	{
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;  // һ��ǿת,�����õ�p֮�еĶ���������ת�͡�
		System.out.println(this.name+"=="+p.name);     // �����������洫�����Ķ�����бȽϡ���  ֻ��û����ȷд����  �൱��    this.equals(p��ϣ���ж�Ӧ�Ķ���);
		return this.name.equals(p.name) && this.age == p.age;   // �ж������������Ƿ���ȣ���ȵĻ��Ͳ����������Ȳ������
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