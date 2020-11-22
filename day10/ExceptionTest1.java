/*
有一个长方形和圆形。 都可以获取面积，对于面积如果出现非法数值，视为是获取面积出现问题。
问题通过异常来表示，   现在对这个程序进行基本设计。
设计思路：定义一个获取面积的接口， 定义一个长方形实现这个接口类， 并且里面有对应的私有参数，构造函数以及对应的函数。
*/

class NoValueException extends RuntimeException   // 这是一个特殊的类（继承的东西），不需要用try	catch捕捉，而是会直接停止，告诉用户具体错误在第几行
{
	NoValueException(String msg) // 对应的构造函数
	{
		super(msg);     // 继承了Exception这个父类中有的东西
	}
}

interface Shape
{
	void getArea();
}

class Rect implements Shape
{
	private int width, height;  // 这是矩形的宽和高，是矩形私有的属性

	Rect(int width, int height)//throws NoValueException // 矩形的构造函数
	{
		
		if(width<0 || height<0) 
		{
			throw new NoValueException("宽度和长度之中有一个值出现了负数！");  // 出现非法值，开始抛弃，注意逻辑，这个函数内部中有抛的东西，所以要在函数上也有一个抛的东西。
			//System.out.println("输入错误！");
		}
		//else  ..  因为这里要写括号我省略了
		
		this.width = width; 
		this.height = height;
	
	}

	public void getArea()
	{
		System.out.println("Area:"+(height*width));
	}

}

// 然后我们可以按照这个思路写一下圆形的异常与报错
class Circle implements Shape
{
	public final static double pi = 3.14; // 权限调到最大，static加上去表示数据可以共享。
	private double radius;   // 定义圆形的半径
	Circle(double radius)
	{
		if(radius<0)    // 这里是一个可能出现的错误
		{
			throw new NoValueException("输入半径非法");   // 这是函数内部的一个抛
		}
		this.radius = radius;
	}

	public void getArea()   // 注意要覆盖抽象接口中的方法。
	{
		System.out.println("circle's Area:"+(pi*radius*radius));
	}

}






class ExceptionTest1 
{
	public static void main(String[] args) 
	{
			Rect s = new Rect(3,5);     // 这里new以后的东西是要看构造函数里面传的东西 ，
		/*这里我们想一下异常，就是在Rect()中传负数，就是有异常了。解决的方法:
		1. 在构造函数中加对应的条件判断，这种方法是以前学的，有点过时了，而且有错误，输出面积为0，并且如果if太多的话看起来比较多，很繁琐
		2.用try catch 进行处理 ，只要出现错误可以直接跳到异常处理
		*/
			s.getArea();    // 矩形的面积。

			Circle s1 = new Circle(3);

			s1.getArea();   // 圆的面积
		 
		//	System.out.println("有错误");
	 
		 
			System.out.println("over!");
	}
}
