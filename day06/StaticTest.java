/*
作者：huermosy
需求：关于静态变量的一些测试与理解。
*/
class  StaticTest
{
	public static void main(String[] args) 
	{
		StaticDemo p = new StaticDemo();
		p.show();                    // 非静态变量用对象新建的方法来调用
		// StaticDemo.show();          //静态变量直接用类名.静态方法名的调用方法
	}
}

class StaticDemo
{
	String name = "zhangsan";

	public void show()
	{
		System.out.println("haha "+name);        // 静态成员直接用
	}
}
