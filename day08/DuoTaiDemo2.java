/*��̬��������ڵĶ�����̬��
�ˣ����� Ů��
���è ��

è x = new è();
���� x = new è();
���ﹲ�Եķ����ǳ�
������Էֳ�è��������

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
		System.out.println("��������");
	}

	public void sleep()
	{}
}

class DuoTaiDemo2
{
	public static void main(String[] args) 
	{
		Animal c = new Cat();      // �µ����⣬����һ������ת����  ��������Ϊǿת���� ���磺byte a ; int c = a;  byte���;�ת������int����
		function(c);
		 
		/*
		������ǿת���ͻᱨ���� ����ָ���������Ҫʼ�ն���������� ��new Animal() �ǶԸ���Ĳ�������˲��ܹ�ǿת��
		Animal a = new Animal();
		Cat c2 = (Cat) a;

		��������ʵ������һ������:
		����ү x = new ������();
		������.������

		������ y = (������) x;
		y.����Ϸ����
		*/
		System.out.println("Hello World!");
		function(new Dog());  // Animal a = new Dog();
		


	}
	 
	public static void function(Animal a)        // �ܽ���ҵ�����Ĺ���������
	{

		a.eat();
		if(a instanceof Cat)
		{
			Cat c1 = (Cat) a;  //��ô��β���ʹ������������ķ����أ�  ������һ�����ϵ�ǿת��
			c1.zhuolaoshu();      // �����Ϳ���ʹ������������ķ���
		}
		else if(a instanceof Dog)
		{
			Dog d1 = (Dog) a;
			d1.kanjia();
		}
	}
}