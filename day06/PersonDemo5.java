/*
���ߣ�huermosy
�������������һ���˵��࣬����������˵����Ӧ�����������
*/
class Person
{
	String name;
	static String country="china";

	public void show()
	{
		System.out.println("name:"+name+".."+"country:"+country);
	}
}


class  PersonDemo5
{
	public static void main(String[] args) 
	{
		/*
		Person p = new Person();
		p.name = "Zhangsan";
		p.show();
		*/

		System.out.println(Person.country);
	}
}