/*��̬��������ڵĶ�����̬��
�ˣ����� Ů��
���è ��

è x = new è();
���� x = new è();
���ﹲ�Եķ����ǳ�
������Էֳ�è������

1.��̬�����֣� ���������ָ��������Ķ���
2.��̬��ǰ�᣺ ����������֮����ڹ�ϵ��Ҫô�̳У�Ҫôʵ�֣� ����һ��ǰ�᣺���ڸ���
3.��̬�ĺô��� �������˳������չ��
4.��̬�ı׶ˣ� ֻ�ܷ��ʸ����ж���õĳ�Ա������������ľ�û������
5.��̬��Ӧ�ã�
*/

abstract class Animal
{
	abstract void eat();  // ����һ�������෽����֪����������һ�����ԣ����ǲ�֪��������ô��
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("è����");
	}

	public void zhuolaoshu()
	{
		System.out.println("׽����");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("���й�ͷ");
	}

	public void kanjia()
	{
		System.out.println("������");
	}
}

class Pig
{
	public void eat()
	{
		System.out.println("�������");
	}

	public void sleep()
	{}
}

class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		Animal c = new Cat();      // Cat c = new Cat();     �����õ�����Animal�Ƕ�̬������
		function(c);    // �����˴����޷��Ӿ�̬�������з��ʾ�̬������
		c.zhuolaoshu();
		System.out.println("Hello World!");
	}
	/*
	public static void function(Cat c)
	{
		c.eat();
	}

	public static void function(Dog d)
	{
		d.eat();
	}
	*/
	public static void function(Animal a)        // �ܽ���ҵ�����Ĺ���������
	{
		a.eat();
	}
}
