/* �ؼ��֣�Abstract
��������ж����������ͬ���������������BaseStudent��AdvanceStudent���ܵ�������ͬ����ֻ�ǹ������岻ͬ�� ��ʱ�������ϳ�ȡ��ֻ�õ����ܵĶ��壬�����õ����ܵ�����
���󣺿������Ķ���������һ��abstract

������ص㣺
1. �����εķ���������abstractʱ����ô��Ӧ������Ҳ������abstract����
2. ��������ͬ����ʱ����ͬ����
3. ������಻������ʵ��������������
4. �������еķ���Ҫ��ʹ�ã����������ิд���еķ�����Ȼ�󴴽�����Ķ�����á�

����������⣺������������ϰ壬����һϵ�����󣬵��Ǿ��岻֪����ô������Ӧ������Ա���̳У���Ȼ��ͬ��Ա��Ҳ���ж�Ӧͬ������ͬ��ʵ�ַ�����
*/
abstract class Person
{
	abstract void show();    // ���󷽷�����������
	/*
	{
		System.out.println("���Ƕ��˵���ʾ");
	}
	*/
	void sleep()
	{
		System.out.println("����");
	}
}

class BaseStudent extends Person
{
	void show()
	{
		//super.show();          // �Ը����з����ļ̳� , �޷��Ը����еĳ��󷽷��̳�
		System.out.println("study");
	}

	
}

class AdvancedStudent extends Person
{
	void show()
	{
	//	super.show();          // �Ը����з����ļ̳�
		System.out.println("study");    // ��������ǶԻ��������д
	}
}
class  AbstractDemo
{
	public static void main(String[] args) 
	{
		//new BaseStudent().show();         // ��������Ĵ���Ȼ����÷���, ֻ��ʹ��һ��
		BaseStudent s = new BaseStudent();         
		s.sleep();
		//new Person.show();       // ����Perso������Ϊ��abstract ���Իᱨ��
		s.show();1
		new AdvancedStudent().show();
		//System.out.println("Hello World!");
	}
}