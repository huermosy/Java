/*
���ߣ�huermosy
����һ�����ͻ������֮��Ӧ�Ĺ��캯����
���캯�������ã��������ڸ�������г�ʼ����

��������Ϊ����һ�������е��������˵��С���ӿ���һ����Ϊ��

�������飺����һ���������У����������ڹ��캯��ִ�С��͹��캯��������
���������Ǹ����ж������ͳһ��ʼ���������캯���Ǹ���Ӧ�Ķ����ʼ����
*/
class Person
{
	private int age;       // ˽�л����������γ�Ա�ġ�
	private String name = "lisi";
// ����һ����������

	{
		System.out.println("cry..........");
	}

	public void SetAge(String nam)        // ���Ϊname ��Ա������Ӧ���������ʵķ������ֱ�Ϊset��get
	{
		name = nam;
	}

	public String GetAge()
	{
		return name;
	}
/*
	public void cry()
	{
		System.out.println("baby cry");
	}
*/
	Person()
	{
		System.out.println("name:"+name+",,"+"age:"+age);
		//cry();
	}
// ���ú������ص�˼�룬�Դ˿��Դ�����ͬ�˵Ĺ��캯����

	Person(int a)
	{
		age = a;
		System.out.println("name:"+name+",,"+"age:"+age);
		//cry();
	}

	Person(int a, String nam)
	{
		age = a;
		name = nam;
		System.out.println("name:"+name+",,"+"age:"+age);
		//cry();
	}
	
}


class  PersonDemo2
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		Person p1 = new Person(3);
		Person p2 = new Person(5, "wangxiaoer");
		p.SetAge("nolisi");
		p.SetAge("still_lisi");
		System.out.println(p.GetAge());
	}
}
