/*
泛型类

早期1.4版本还没有泛型类的时候的代码：

后期出现泛型类定义的代码：

什么时候定义泛型类？
当引用数据不确定时，能够使用泛型类

*/

import java.util.*;

class Student
{
}

class Worker
{
}
// java 1.4版本的代码
 class Tool
{
	private Object obj;
 
	public void setObject(Object obj)
	{
		this.obj = obj;
	}

	public Object getObject()
	{
		return obj;
	}
}
// 这里是java1.5版本的时候的代码 , 改进之后不需要强转
class Util<WW>
{
	private WW w;

	public void setWW(WW w)
	{
		this.w = w;
	}

	public WW getWW()
	{
		return w;
	}
}

class  GenericDemo3
{
	public static void main(String[] args) 
	{

		Util<Worker> w = new Util<Worker>();
		w.setWW(new Worker());
		Worker wk = w.getWW();    // 需要一个强转
//		System.out.println("Hello World!");
	}
}
