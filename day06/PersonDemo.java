/*
�ص㣡 ���һ�¶���ĳ�ʼ������
*/
class Person
{
	private String name;
	private int age;
	private static String country = "cn";      // �����һ��static��̬��������Ϊ�����Ǻܶ๲�ԵĶ���
	Person(String name, int age)       // ����һ����Ĺ��캯��
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println(this.name+"..."+this.age);
	}

	public void countryshow()
	{
		System.out.println("country:"+country);
	}
}


class PersonDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/* Person p = new Person("zhangsan", 20);      ��仰��ִ����ʲô��
1. ��Ϊ��new����ؼ��֣�����ͨ��jvm���������ҵ�Person.class ��һ���ļ�
2. ��̬��������ĳ�ʼ��������еĻ��Ƕ�Person.class�������г�ʼ��
3. �ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ�����ҵ�����Ǵ����˶���
4. �ڶ��ڴ��н���������������ԣ�Ĭ�ϵĳ�ʼ�������ִ��
5. �����Ե���ʾ�Ĵ����ĳ�ʼ����
6. �Զ�����й�������ĳ�ʼ��
7. �Զ���Ĺ��캯���ĳ�ʼ����
8. ���ڴ��ַ�������ڴ��е�p������
*/
