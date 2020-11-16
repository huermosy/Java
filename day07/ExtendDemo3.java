/*
研究一下覆盖的特性
子父类中函数的特点-覆盖（也叫重写）   第87讲
覆盖要注意的特点：1. 子类的权限必须大于等于父类的权限；
2. 只有静态才能覆盖静态

注意重载和重写的区别：
1.重载只看同名函数的参数列表；
2.重写：子父类中的方法名要一样，子类中的方法名可以适当增添新内容
*/
class Fu
{
	int num = 3;
}

class Zi extends Fu
{
	private int num = 4;
	void show()
	{
		System.out.println(num);   // 现在这个num是this.num
	}
}

class Tel
{
	void show()
	{
		System.out.println("age");
	}
}

class NewTel extends Tel
{
	void show()
	{
		super.show();   // 继承父类中的show方法
		System.out.println("name");
	}
}


class  ExtendDemo3
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
		NewTel t = new NewTel();
		t.show();
	}
}

