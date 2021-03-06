/*
用中文的话解释一遍：其中Exception类是写在上帝Object中的；定义一个A异常类继承Exception，一个B异常类继承了A异常；定义一个C异常继承Exception类
定义一个父类，父类异常中的show方法抛出了A异常方法;定义一个子类，这个子类继承这个父类，重写其中的show方法，看看它能够继承谁？

得出的结论：1.如果父类的方法抛出异常，那么当该子类继承父类的方法也抛出异常的时候，只能抛出该异常的父类或者相应的子类
2. 如果父类抛出的是多异常，那么子类覆盖这个父类的时候，只能抛出这个父类的子集
3. 如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时，也不可以抛出异常；
	如果子类发生了异常，不可以抛出，而是应该用try catch解决。
*/


/*
这里异常的层级关系为：
Exception-->
			AException-->
						BException->>
			CException-->
*/
class AException extends Exception
{
}

class BException extends AException
{
}

class CException
{
}

// 创建一个Test类 然后调用父类试一试
class Test
{
	void function(Fu f)
	{
		try
		{
			f.show();
		}
		catch (AException a)
		{
		}
	}
}

class Fu 
{
	void show() throws AException // 抛出A异常
	{
		System.out.println("父类运行！");
	}
}

class Zi extends Fu
{
	void show()    //throws CException  // 或者抛出一个BException,    这里如果自己出现了一个c异常不能子类自己处理
	{
		try
		{
		System.out.println("子类运行!");
		}
		catch(Exception e)     // 注意其中的类名格式；
		{
		}
	}
}


class ExceptionDemo7 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Test t = new Test();
		t.function(new Zi());         // 也可以用多态的方法 new Zi();  相当于  Fu f = new Zi();
	}
}
