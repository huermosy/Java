/*
���󣺶�ѧ������������������

��Ϊ�������Լ�ֵ����ʽ���ڵġ�
����Ҫʹ�������Map���ϣ�TreeMap��
*/ 
import java.util.*;
class  MapTest2
{
	public static void main(String[] args) 
	{
		TreeMap<Student,String> m1 = new TreeMap<Student,String>(new SetNumcompare());     // ���Ƚ������롣
		m1.put(new Student("zhangsan06",20),"Beijing");
		m1.put(new Student("zhangsan02",22),"Tianjing");
		m1.put(new Student("zhangsan04",20),"Shanghai");
		m1.put(new Student("zhangsan11",19),"haining");
		m1.put(new Student("zhangsan04",20),"Luoyang");

		Set<Map.Entry<Student,String>> entryset = m1.entrySet();

		Iterator<Map.Entry<Student,String>> it = entryset.iterator();

		while(it.hasNext())
		{
			Map.Entry<Student, String> k_v = it.next();      // ����ֵ��ȡ��
			Student key = k_v.getKey();
			String Value = k_v.getValue();
			System.out.println("key:"+key+"  "+"value:"+ Value);
		}
		//��Entry��Եķ���
//		System.out.println("Hello World!");
	}
}


class SetNumcompare implements Comparator<Student>         // ���������������
{
	public int compare(Student s1, Student s2)
	{ 
		int num =  new Integer(s2.getAge()).compareTo( new Integer (s1.getAge()));    // ע�������޷�ȡ������int�ı���
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