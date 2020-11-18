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

class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		Animal c = new Cat();      // Cat c = new Cat();     这里用到父类Animal是多态的体现
		function(c);    // 出现了错误，无法从静态上下文中访问静态方法；
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
	public static void function(Animal a)        // 总结后找到事物的共性特征。
	{
		a.eat();
	}
}
