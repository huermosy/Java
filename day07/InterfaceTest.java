/*
总的来说，将基本的写在类中，将扩展的功能写在接口中。
*/

abstract class Student     // 定义学生这一个类
{
	 abstract void study();
}

abstract interface Play
{
	abstract void play();   // 不知道具体玩什么，可能是足球，可能是篮球，也可能是乒乓球 。
}

class Zhangsan extends Student implements Play   // 张三是一个学生
{
	void study(){};
	public void play()   // 它的权限得大于 它实现的类的权限，所以是public
	{
		System.out.println("玩一手足球");
	}
}



class  InterfaceTest
{
	public static void main(String[] args) 
	{
		Zhangsan s = new Zhangsan();
		s.play();
		System.out.println("Hello World!");
	}
}
