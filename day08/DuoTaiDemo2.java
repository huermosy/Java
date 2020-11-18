/*多态：事物存在的多种形态；
人：男人 女人
动物：猫 狗

猫 x = new 猫();
动物 x = new 猫();
动物共性的方法是吃
动物可以分成猫、猪、狗

1.多态的体现： 父类的引用指向了子类的对象
2.多态的前提： 必须类与类之间存在关系，要么继承，要么实现； 还有一个前提：存在覆盖
3.多态的好处： 大大提高了程序的扩展性
4.多态的弊端： 只能访问父类中定义好的成员，子类中特殊的就没法访问
5.多态的应用：
*/

abstract class Animal
{
	abstract void eat();  // 定义一个抽象类方法，知道动物有这一个共性，但是不知道具体怎么做
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("猫吃鱼");
	}

	public void zhuolaoshu()
	{
		System.out.println("捉老鼠");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("狗啃骨头");
	}

	public void kanjia()
	{
		System.out.println("看个家");
	}
}

class Pig
{
	public void eat()
	{
		System.out.println("猪吃饲料");
	}

	public void sleep()
	{}
}

class DuoTaiDemo2
{
	public static void main(String[] args) 
	{
		Animal c = new Cat();      // 新的理解，这是一个向上转换；  可以理解为强转换， 比如：byte a ; int c = a;  byte类型就转换成了int类型
		function(c);
		 
		/*
		这样的强转换就会报错， 父类指向的引用需要始终对子类操作， 而new Animal() 是对父类的操作，因此不能够强转换
		Animal a = new Animal();
		Cat c2 = (Cat) a;

		这里在现实举例的一个理解:
		胡老爷 x = new 胡晨熙();
		胡晨熙.看电视

		胡晨熙 y = (胡晨熙) x;
		y.玩游戏（）
		*/
		System.out.println("Hello World!");
		function(new Dog());  // Animal a = new Dog();
		


	}
	 
	public static void function(Animal a)        // 总结后找到事物的共性特征。
	{

		a.eat();
		if(a instanceof Cat)
		{
			Cat c1 = (Cat) a;  //那么如何才能使用子类中特殊的方法呢？  这里用一个向上的强转换
			c1.zhuolaoshu();      // 这样就可以使用子类中特殊的方法
		}
		else if(a instanceof Dog)
		{
			Dog d1 = (Dog) a;
			d1.kanjia();
		}
	}
}
