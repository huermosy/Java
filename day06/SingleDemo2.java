/* 面向对象，单例设计模式
java编程 饿汉式与懒汉式  区别是进入方法区的初始值不一样
*/
/*      这是饿汉式，直接初始化对象
class Single
{
	// 分三步走：构造函数私有化，本类对象，然后是创建一个本类中的方法。
	private Single(){}
	private static Single s = new Single();    // 理解一下对象的实例化和构造函数有关。
	public static Single getInstance()
	{
		return s;
	}


}
*/
// 这是懒汉式，在构造方法中初始化对象 具有延迟加载的特性， 只有在调用方法的时候， 方法区的s变量才将地址值赋给 堆内存中的变量。
class Single
{
	private Single(){}
	private static Single s = null;
	public static Single getInstance()     // 在懒汉式中可以加入synchronized关键字 ， 这是一个同步的关键字，只有在一个线程执行完毕后，另一个线程通过敲门的方式，询问当前是否为空，如果是空的话执行。但是存在效率较低的问题
	{
		if(s==null)
		{
			s = new Student();
		}
		return s;
	}
}

class  SingleDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
