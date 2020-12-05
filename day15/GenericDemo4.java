/*
集合框架(泛型方法)
如果定义的方法中对应的数据类型不确定，那么可以将泛型定义在方法上。
注意：泛型的作用范围仅仅在局部。

静态方法无法访问类上定义的泛型，
如果静态方法中对应的数据类型不确定，可以自己创建一个泛型。
*/

class Demo<S>
{
	public<S> void print(S t)        // 数据类型跟着类的数据类型走
	{
		System.out.println("print:"+t);
	}

	public<T> void show(T p)
	{
		System.out.println("show:"+p);
	}

	public static  void out(S s)
	{
		System.out.println("out:"+s);
	}
}


class GenericDemo4 
{
	public static void main(String[] args) 
	{
		Demo <String> d = new Demo<String>();
		d.print("xixi");
		d.show(new Integer(624));
		d.out("huermosy");
//		System.out.println("Hello World!");
	}
}
