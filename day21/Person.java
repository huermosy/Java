// 对象的序列化     用Serializable启用序列化功能

import java.io.*;

class  Person implements Serializable
{
	public static final long serialVersionUID = 42L;
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public  String toString()
	{
		return name + ":"+ age;
	}
}
