/*
������

����1.4�汾��û�з������ʱ��Ĵ��룺

���ڳ��ַ����ඨ��Ĵ��룺

ʲôʱ���巺���ࣿ
���������ݲ�ȷ��ʱ���ܹ�ʹ�÷�����

*/

import java.util.*;

class Student
{
}

class Worker
{
}
// java 1.4�汾�Ĵ���
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
// ������java1.5�汾��ʱ��Ĵ��� , �Ľ�֮����Ҫǿת
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
		Worker wk = w.getWW();    // ��Ҫһ��ǿת
//		System.out.println("Hello World!");
	}
}
