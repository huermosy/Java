// 需求：描述汽车（颜色，轮胎数）。描述事物其实就是在描述事物的属性和行为
// 属性对应类中变量，行为对应类中的函数(方法)。
// 定义类，就是在描述事物，就是定义属性和行为。属性和行为共同成为类中的成员（成员变量和成员方法）

/*
成员变量与局部变量的区别：
成员变量作用于整个类中，而局部变量作用于单条语句中或者函数之中

成员变量存在于堆中，因为对象的存在而存在；而局部变量在栈内存中
*/
class Car
{
	// 描述颜色
	String color = "red";
	// 描述轮胎数
	int num = 4;
	// 运行行为
	void run()
	{
		System.out.println("color:"+color+","+"number:"+num);
	}
	 
}

// 开始生产汽车
class CarDemo
{
	public static void main(String[] args) 
	{
		// 新建一个car对象,在java中用new操作符来完成
		// 其实就是在堆内存中产生一个实体
		Car c = new Car();     // c是一个类类型变量，类类型变量指向对象
		// 改变成员属性的值，将已有的车改为蓝色。使用的方法：对象.对象成员
		c.color = "purple";
		// 使用成员方法，使用方法：  对象.对象方法。
		c.run();
		// 定义一个新的类
		Car c1 = new Car();
		c1.run();
	}
// 需求：汽车修配厂。对汽车进行改装，3个轮胎，颜色为红色
	public static void show(Car c)         //传入的类型为Car数据类型，类比于int float char等
	{
		c.num = 3;
		c.color = "red";
		c.run();
	}
}