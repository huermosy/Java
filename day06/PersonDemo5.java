/*
作者：huermosy
需求分析：定义一个人的类，并且在类中说明对应的名称与国际
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
