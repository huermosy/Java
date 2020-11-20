/*
��Щ��Ŀ�л�������е����⣬����Щ���Ⲣû�б�java���������װ��
���Զ������������⣬���ǿ��԰���java���쳣�ķ�װ˼�룬
�����е����⣬�����Զ�����쳣��װ;

�Զ����쳣��

�����ڱ������У����ڳ�����-1�����ǽ��������Ҳ�������޷�����ģ���ô��Ӧ�ö������������Զ����������

��������ڲ�������throw�쳣���Ǿͱ���Ҫ����Ӧ�Ĵ���
1.Ҫô���ڲ�try exception����
2.Ҫô�ں����������õ����ߴ���
һ���ڲ��������⣬��Ҫ�ں����ⲿ��throws������


��һ��û��ͨ�����д���
*/

class FuException extends Exception  // getMessage
{
	String msg;
	FuException(String msg)      // ����һ�����캯��
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
			throw new FuException("�����˳����Ǹ�������� ");   // �ֶ�ͨ��throw�׳�һ��FuException()�쳣
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
			System.out.println("�����˳����Ǹ����������");
		}
		//System.out.println("Hello World!");
	}
}



/*

class Person    // ��ϰһ�¼̳�  super
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
		super(num);      // �̳и���
	}
}

// ���÷����� new Student("����").getnum();

// ������һ��д����˼�룬����дһ��throwable��

 
class Throwable
{
	String message;
	Throwable(String message)     // ���캯��
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

// ���÷����� new Exception("����һ������").getMessage();



*/