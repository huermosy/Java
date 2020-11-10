// 需求：描述汽车（颜色，轮胎数）。描述事物其实就是在描述事物的属性和行为
// 属性对应类中变量，行为对应类中的函数(方法)。
// 定义类，就是在描述事物，就是定义属性和行为。属性和行为共同成为类中的成员（成员变量和成员方法）
class Car
{
	// 描述颜色
	String color = "red";
	// 描述轮胎数
	int num = 4;
	// 运行行为
	void run()
	{
		System.out.println("color:"+color+","+"number:"+number);
	}
	 
}

class CarDemo
{
	// 新建一个car对象
	Car c = new Car();
	// 改变成员属性的值
	c.color = "purple";
	// 使用成员方法
	c.run();
}