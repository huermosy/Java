/*
Runtime对象
一个java应用程序的类 Runtime，允许应用程序与环境中运行应用程序接口的一个实例。
目前的运行时间可以从 getRuntime方法得到的。 
一个应用程序无法创建该类的自己的实例。说明该类中的方法都是静态的。
发现该类中还有非静态方法，
说明该类肯定会提供方法获取本类对象，而且该方法是静态的，并返回值类型是本类类型。

有这个特点你看出该类使用了单例设计模式完成

该方式是 static Runtime getRuntime();
*/
class RuntimeDemo 
{
	public static void main(String[] args) throws Exception
	{
		Runtime s = Runtime.getRuntime();        // 创建一个Runtime类
		Process p1 = s.exec("Notepad SystemDemo.java");

		// 将打开的应用关闭,杀死进程
		/*
		Thread.sleep(4000);
		p1.destroy();
		*/
 	}
}
