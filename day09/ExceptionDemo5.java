/*
Exception中有一个特殊的子类异常RuntimeException 运行时异常。
如果再函数内容抛出该异常，函数可以不用声明，编译一样通过。
如果在函数上声明了该异常，调用者可以不用处理，编译一样通过。


这个没有做完，因为感觉有点懵。。
对于异常分两种：
1.编译时被监测的异常；  2.编译时不被检测的异常(运行时异常，RunTimeException);
*/

class Demo  
{
	int div(int a , int b) throws RuntimeException
	{
		return a/b;
	}
}

class  ExceptionDemo5
{
	public static void main(String[] args) 
	{
		// 创建对象并且调用
		Demo d = new Demo();
		int num = d.div(4,-9); 
		System.out.println("num:"+num);
		System.out.println("Code over!");
	}
}
