/*
���ߣ�huermosy
�����˽�extends�ؼ��֣�ѧϰ�̳���һ��֪ʶ��     �̳е����룺
����֪����Щ����£�����������֮�������ĳ�����ԣ��������Ǿ���Ҫ��������Գ�ȡ������ ר��������������ߴ���ĸ����ԡ�

ע�⣺ǧ��Ҫһ����Ϊ�˴���ļ򻯶��򻯣�һ����Ҫע��������֮�����л������ϵ�ſ��Լ̳�
*/

// �����Person�ҵ�����ѧ����͹�����֮�乲�ԵĶ��� Ҳ���Ƿֱ�����������֡�
class Person
{
	int age;
	String Name;
} 


class Student extends Person
{
	/*                                          
	int age;
	String name;
	*/
	void study()
	{
		System.out.println("good study!");
	}
}


class Worker extends Person
{
	/*
	int age;
	String name;
	*/
	void work()
	{
		System.out.println("good work!");
	}
}

class  ExtendsDemo
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.study();
		Worker w = new Worker();
		w.work();
		//System.out.println("Hello World!");
	}
}