/*
异常：就是程序在运行时出现的不正常的情况；
java对问题的描述也是会被封装成类来解决

java的异常报错会有两种形式： 1.error：这一种异常是较为严重，一般不能够解决。
2.Exception:这一种异常比较轻，一般来说能够采用针对性的方法解决。


java中为了增加可阅读性，将某些父类的后缀名加在子类后面，这样一眼就能看出是谁的子类。
*/
class Demo throw Exception     // 在throw上声明了可能出现的问题
{
	int div(int a, int b)
	{
		return a/b;
	}
}

class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int div = d.div(4,0);     // 这是一种除0异常，可以解决;    当发生异常的时候，就有 new ArithmeticException    这是一个除0异常的类建立
			System.out.println(div);
		}
		catch(Exception e)
		{
			System.out.println("发生除零异常了!");
		

		System.out.println("code run!");
		System.out.println(e.toString()); // by zero
		System.out.println(e.getMessage());   // 异常名称：异常信息
		e.printStackTrace();   // 异常名称，异常信息，异常出现的位置。
		}
		//System.out.println("Hello World!");

		//byte[] arr = new byte[1024*1024*60000];   分配内存过大
	}
}
