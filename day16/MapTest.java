/*
��ϰ��ÿһ��ѧ�����ж�Ӧ�Ĺ����أ�
ѧ��Student,��ַ��String
ѧ�����ԣ����������䡣
ע�⣺������������ͬʱΪͬһ��ѧ������֤ѧ����Ψһ�ԡ�
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

	// ��ΪҪ��֤Ԫ��Ψһ�ԣ������뵽����HashCode��equals����
	public int hashCode()
	{
		return name.hashCode() + age*43;    // nameҲ������صĹ�ϣֵ�ķ�����
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student) )   // �׳��쳣
			throw new ClassCastException("���Ͳ�ƥ��");
		Student s = (Student)obj;       // ǿת��Ŀ����Ϊ���ܹ�ʹ���ַ������صķ�����
		return  this.name.equals(s.name) && this.age == s.age;

	}

	public String toString()   // ���תΪ�ַ����ĺ���ͦ��Ҫ�ģ��ܹ�ֱ�ӽ���ַת��Ϊ�ַ������ͣ�����Ļ���Ҫ������ĺ������е���
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
		// ��һ�ַ����� Entry������Ե�ȡ������
		// ��һ����������entrySet() ����תΪ��Ӧ����Entry�������ƻ���һ��ļ��ϡ�
		Set<Map.Entry<Student,String>> entryset = m1.entrySet();
		// �ڶ���������set���ϾͿ����õ�����������ȡ����
		Iterator<Map.Entry<Student,String>> doubleset = entryset.iterator();
		
		// �����������˻�ȡ���ĵ��������Ϳ���ͨ��map��get�������Ѽ���Ӧ��ֵ��map��ȡ������
		while(doubleset.hasNext())
		{
			Map.Entry<Student,String> m2 = doubleset.next();
			Student key= m2.getKey();
			String value= m2.getValue();
			System.out.println("key:"+key+","+"value:"+value);
		}	

		// �ڶ��ַ�����ʹ��keyset��һ����ȡ��������ȡ������Ӧ��ֵ
		// ��һ������keySet����ȡ����Ӧ�ļ�����Set�����С�
		Set<Student> s1 = m1.keySet();
		// �ڶ������õ�������������
		Iterator<Student> st1 = s1.iterator();
		// �����������ݶ�Ӧ�ļ�ȡ����Ӧ��ֵ
		while(st1.hasNext())
		{
			Student k1 = st1.next();
			String v1 = m1.get(k1);
			System.out.println("Key:"+k1+"  ,  "+"Values:"+v1);
		}
	}
}
