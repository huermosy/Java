/*
有些项目中会出现特有的问题，而这些问题并没有被java所描述与封装；
所以对于这样的问题，我们可以按照java对异常的封装思想，
将特有的问题，进行自定义的异常封装;

自定义异常。

需求：在本程序中，对于除数是-1，我们将这个现象也看做是无法运算的，那么就应该对这个问题进行自定义的描述。

如果函数内部出现了throw异常，那就必须要给对应的处理；
1.要么在内部try exception处理
2.要么在函数上声明让调用者处理；
一般内部出现问题，都要在函数外部用throws声明。


这一节没有通过，有错误
*/

class FuException extends Exception  // getMessage
{
	String msg;
	FuException(String msg)      // 这是一个构造函数
	{
		this.msg = msg;
	}
 
	public String getMessage()
	{
		return msg;
	}
 
}


class Demo 
{
	int div(int a, int b) throws FuException
	{
		if(b<0)
			throw new FuException("出现了除数是负数的情况 ");   // 手动通过throw抛出一个FuException()异常
		return a/b;
	}
}



class  ExceptionDemo3
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int num = d.div(4,-1);
			System.out.println("num"+num);
		}
		catch(FuException e)
		{
			System.out.println(e.toString());    // 
			System.out.println("出现了除数是负数的情况！");
		}
		//System.out.println("Hello World!");
	}
}



/*

class Person    // 复习一下继承  super
{
	private String num;
	Person(String num)
	{
		this.num = num;
	}

	public String getnum()
	{
		return num;
	}
}

class Student extends Person
{
	Student(String num)
	{
		super(num);      // 继承父类
	}
}

// 调用方法： new Student("张三").getnum();

// 按照这一个写法与思想，可以写一下throwable类

 
class Throwable
{
	String message;
	Throwable(String message)     // 构造函数
	{
		this.message = message;
	}

	String getMessage()
	{
		return message;
	}
}

class Exception extends Throwable
{
	Exception(String message)
	{
		super(message);
	}
}

// 调用方法： new Exception("这是一个错误").getMessage();



*/