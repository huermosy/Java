/*
 异常声明；throws
*/
class Demo  
{
	int div(int a, int b) throws Exception     // 在throw上声明了可能出现的问题，抛给调用它的类解决     这个除法可能会出现除0的错误
	{
		return a/b;
	}
}

class ExceptionDemo1  
{
	public static void main(String[] args)  //throws Exception   // 抛给虚拟机解决
	{
		Demo d = new Demo();
		try
		{
			int div = d.div(4,0);     // 这是一种除0异常，可以解决;    当发生异常的时候，就有 new ArithmeticException    这是一个除0异常的类建立
			System.out.println(div);      // 在抛给虚拟机后就停止运行后面的代码了
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
			 
		 
		System.out.println("发生除零异常了!");
		

		System.out.println("code run!");
		 
		
		//System.out.println("Hello World!");

		//byte[] arr = new byte[1024*1024*60000];   分配内存过大
	}
}
