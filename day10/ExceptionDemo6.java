/*
finally������һ��ִ�еĴ��룬ͨ�����ڹر���Դ����������Ե�ʱ��û�йر���Դ�����Թٻ���Ϊû�о��飡��  �ǳ���Ҫ
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
			throw new FuShuException("����Ϊ����");
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
	���ݿ�Ĳ��裺
		1.�������ݿ⣻
		2.�������ݿ⣻
		3.�ر����ݿ�;
	try
	{
		1.�������ݿ⣻
		2.�������ݿ�;
	}
	catch (SQLException e)
	{
	}
	finally
	{
		�ر����ݿ�;
	}
}

*/