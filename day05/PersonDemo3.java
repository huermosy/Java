/*
���ߣ�huermosy
����1.�˽�this��ʹ�á�
2.�Ƚ�����ͬ���˵����䣬���Ƿ���ͬ��

this:����ȥ�����������־ֲ������ͳ�Ա����ͬ���������
this �������Ǳ���Ķ��󣬴��������غ���������������á�
��˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����
*/
class Person
{
	// ������Ա����
	private int age;
	private String name="zhangsan";

	Person(int age)
	{
		this.age = age;
		//System.out.println("name:"+name+"..."+"age:"+age);
	}
	
	Person(String name, int age)
	{
		this.age = age;
		this.name = name;       // this��������������������Ǹ�����
		//System.out.println("name:"+name+"...."+"age:"+age);
	}

	public void speak()
	{
		System.out.println("name:"+this.name+"...."+"age:"+this.age);     // ����this����дҲ���Բ�д����Ӱ���Ķ��ԡ�    ����ʦָ����---     ���ǲ��͵ı���ʦָ����---
	}

	public boolean compare(Person p)
	{
		return this.age==p.age;
	}
}



class  PersonDemo3
{
	public static void main(String[] args) 
	{
		Person p = new Person(20);
		Person p1 = new Person("guangguagn", 20);     // ��ʱthis ָ���Ķ������p1��
		p1.speak();
		boolean b = p1.compare(p);
		System.out.println(b);
	}
}