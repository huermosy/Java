/*
�����븸�๹�캯��֮����о�
�ڴ����������ʱ��������Ȼ����и���Ĺ��캯������Ϊ������������ʽ��䣻Ȼ�������������еĹ��캯�����

Ϊʲô�������ʸ����еĹ��캯������Ϊ�����еĹ��캯������ֱ�ӻ�ȡ��������Ҫ�õ�ֵ���ȿ�һ�¸����еĹ��캯������ô�ȳ��Ի���
*/


class Fu
{
	int num;

	Fu()
	{
		num = 60;
		System.out.println("FU run");
	}

	Fu(int x)
	{
		System.out.println("Fu run"+x);
	}
	

}

class Zi extends Fu
{
 
	Zi()
	{
		super(4); // ������һ����ʽ����� super();���㲻д��������Լ���
		System.out.println("Zi run"+num);
	}
}

class ExtendDemo4 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		Student t = new Student();
		t.method();
		
		System.out.println(z.num);
	}
}


// �̳еĵ��÷��������캯���ĵ��÷����� ���������ĵ��÷���������
class Person
{
	private String name;

	Person(String name)
	{
		this.name = name;
		System.out.println(name);
	}

	void show()
	{
		System.out.println("���Ǹ���ķ���");
	}
}

class Student extends Person
{
	Student(String name)
	{
		super(name);
	}

	Student()
	{
		this(" ");    // this�ǵ��ñ����еĹ��캯��
	}

	void method()
	{
		super.show();   // ���������ļ̳�
	}
	
}


