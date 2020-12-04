/*
�����ϰ���Ժúÿ�һ�£����� ��û�и����������� �˷Ѻܶ�ʱ���ˣ��ȹ���

���Զ��������ΪԪ�ش浽ArrayList�����У���ȡ���ظ�Ԫ�ء�
ex�����˶���ͬ����ͬ���䣬ʵΪͬһ���ˣ�Ϊ�ظ�Ԫ�ء�

˼·��1.���������������ݷ�װ�������
2.�������������˴��롣
3.ȡ����

Ҫ�㣺����һ��Person�࣬ �õ��ķ����� Iterator   hasNext   next
	��ȥ���ظ�Ԫ��֮����Ҫ�õ����ķ���ȡ��Ԫ��

ArrayList�ж�contains�Ƿ����������equals�������ײ����equals������
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

	public boolean equals(Object obj)       // ���ﻹû�и����ô����������    �Լ���һ��contains��api��Ȼ���ٿ�һ����ʵcontains�õľ���equals�ķ�����
	{
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;  // һ��ǿת
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

	public static ArrayList singleElement(ArrayList a)     // ȥ���ظ�Ԫ��
	{
		ArrayList newal = new ArrayList();
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();   // ������Ϊ����洢
			if(!newal.contains(obj))     // �����contains���õĶ�����Person���е��õĶ��󡣡���
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
		// ����һ����ʾ�ɡ�����
		Iterator it = li.iterator();
		while(it.hasNext())
		{	 
			 Person p = (Person)it.next();   // ����һ��ǿת
			 sop(p.getName()+"::"+p.getAge());
		}
//		ArrayList neo = singleElement(li);
 	}
}
