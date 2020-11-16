/*
接口：初期理解可以是认为一个特殊的抽象类，  当抽象类中的方法都是抽象的，那么该类可以用接口来定义；
class定义类名；  Interface定义接口名

Interface 有固定格式：
1. public static final  用来修饰变量；
2. public abstract 用来定义抽象方法；

注意事项： 1.Interface不可以创建对象的，因为有抽象方法，并且自身也算是一个抽象类。
2. 注意interface中定义的方法一定要在子类中重写，不能够漏掉，否则会报错
*/
abstract interface InterA
{
	public static final int NUM = 4;
	public abstract void show();    // 定义抽象方法
	public abstract void show1();          // 如果子类中没有重写这一个方法的话 那么会报错
}

abstract interface InterB
{
	public abstract void show();
}

class FuDemo
{
	void show2()
	{
	System.out.println("这是一个父类");
	}
}

class Demo extends FuDemo implements InterA, InterB    // 接口的实现还有继承   ，从这里我们可以看到继承与实现之间的差异，也就是如果继承在子类中不重写方法的会就会报错。
{
	public void show()
	{
		System.out.println("haha");
	}

	public void show1()
	{
		System.out.println("不会报错了！");
	}
}

// 接口实现的一个传递性
interface A
{
	void show1();
}

interface B
{
	void show2();
}

interface C extends A,B
{
 
	void show3();
}

class D implements C
{
	public void show1(){};
	public void show2(){};
	public void show3(){};
}



class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Demo i = new Demo();
		i.show2();
		System.out.println(i.NUM);
		System.out.println(Inter.NUM);
		System.out.println(Demo.NUM);
		System.out.println("Hello World!");

	}
}
