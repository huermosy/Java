/*
finally：定义一定执行的代码，通常用于关闭资源，如果在面试的时候没有关闭资源，面试官会认为没有经验！！  非常重要
*/


class FuShuException extends Exception
{
	FuShuException(String msg)
	{
		super(msg);
	}
}
class Demo
{
	int div(int a,int b) throws FuShuException
	{
		if(b<0)
			throw new FuShuException("除数为负数");
		return a/b;
	}
}
class  ExceptionDemo6
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Demo d = new Demo();
		try
		{
			int number = d.div(4,1);
			System.out.println("number:"+number);
		}
		catch (FuShuException f)
		{
			System.out.println(f.toString());
			//Sysetm.out.println("code running");
			return;
		}
		finally 
		{
			System.out.println("finally");
		}
		System.out.println("code funish!");
	}
}

/*
public void method() 
{
	数据库的步骤：
		1.连接数据库；
		2.操作数据库；
		3.关闭数据库;
	try
	{
		1.连接数据库；
		2.操作数据库;
	}
	catch (SQLException e)
	{
	}
	finally
	{
		关闭数据库;
	}
}

*/