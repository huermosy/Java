/*
���ߣ�huermosy
this����ֻ�����ڹ��캯���ĵ�һ�С� ��ʼ�������Ҫ��ִ�С�
*/
class Person
{
	private int age;
	private String name;
	
	Person()
	{
	
	}

	Person(String name)
	{
		this.name = name;
	}

	Person(String name, int age)
	{
		this(name);  // �����Ĵ��ݷ�ʽֻ�����ڹ��캯��֮��Ĵ��ݡ� ������ this.name = name;
		this.age = age;
	}

	public void speak()
	{
		System.out.println("name:"+name+"..."+"age:"+age);
	}
}


class  PersonDemo4
{
	public static void main(String[] args) 
	{
		Person p = new Person("huermosy", 14);
		p.speak();
		// System.out.println("Hello World!");
	}
}
