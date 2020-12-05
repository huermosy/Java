/*
Set:���򣬲��ظ���Ԫ��
	|--HashSet:  ���ݽṹ�ǹ�ϣ��
	|--TreeSet�����Զ�Set���ϵ�Ԫ�ظ���ASCII���������
	�ײ����ݽṹ�Ƕ�������Ϊ�˱�֤����Ԫ�ص�Ψһ�ԣ���compareTo()������

	TreeSet����ĵ�һ�ַ�ʽ����Ԫ��������бȽ��ԡ�
	Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo������
	���ַ�ʽҲ��ΪԪ�ص���Ȼ˳�򣬻��߽�Ĭ��˳��

�ӱ���ʧ�ܵ�ԭ�򿴣�ѧ����û�бȽ��ԡ�����Ҫ��comparable����ӿ��ࡣ
TreeSet�ԱȽ�ʵ�ֹ��ܣ�������Ϊû�бȽ���   ������Ҫ��student���ж���һ��Comparable��
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
			Student s = (Student)t1.next();       // ��һ����̬
			sop(s.getName()+"�������ǣ�"+s.getAge());
		}

//		System.out.println("Hello World!");
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