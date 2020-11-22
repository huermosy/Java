/*
练习4 写出程序结果，并且找出错误的地方进行改正
*/
/* 这一题错了
第一题解析：
1.程序的第一次运行不会通过，因为在函数内部抛出异常，再函数上没有进行声明或者没有catch
2.在对函数进行抛了以后输出的数字为：B  C D   由此我们可以看到抛出异常与finally这个关键字执行的顺序步骤的先后关系。
观察如果在func()函数中加一个catch处理异常的话，打印的顺序为B   A    D 异常在func()内部就能够解决
*/
/*
class Practice4
{
	public static void func() //throws Exception
	{
		try
		{
			throw new Exception();     
		}
	 
		catch(Exception e)
		{
		}
 
		finally
		{
			System.out.println("B");
		}
	}


	public static void main(String[] args) 
	{
		try
		{
			func();
			System.out.println("A");
		}
		catch (Exception e)
		{
			System.out.println("C");
		}
		System.out.println("D");
	}
}
*/
// 第二题 这一题正确写出程序结果：Test	Demo	Test  考的是子类的实例化过程
/*
class Test
{
	Test()
	{
		System.out.println("Test");
	}
}

class Demo extends Test
{
	Demo()
	{
		super();
		System.out.println("Demo");
	}
	public static void main(String[] args)
	{
		new Demo();
		new Test();
	}
}

*/

// 第三题：这一题错了  写出程序结果：  这一个编译失败，因为A接口中并没有func()这一个方法。
/*
interface A
{
}

class B implements A
{
	public String func()
	{
		return "func";
	}
}

class Demo
{
	public static void main(String[] args)
	{
		A a = new B();  // 这是一个多态；
		System.out.println(a.func());
	}
}
*/

// 第四题 写出程序结果  A   B   这题考察的是重写后的方法调用的是子类还是父类
// 如果子类中返回的值是true的话 则这么打印:A B D C B D C B
/*
class Fu
{
	boolean show(char a)
	{
		System.out.println(a);
		return true;
	}
}

class Demo extends Fu
{
	public static void main(String[] args)
	{
		int i = 0;
		Fu f = new Demo();
		Demo d = new Demo();
		for(f.show('A'); f.show('B')&&(i<2); f.show('C'))
		{
			i++;
			d.show('D');
		}
	}
	boolean show(char a)     // 这是一个函数的重写。
	{
		System.out.println(a);
		return true;
	}
}

*/

// 第五题写出程序结果： 这一题编译也是失败的，因为A接口中没有定义test方法。
/*
interface A
{
}

class B implements A
{
	public String test()
	{
		return "yes";
	}
}

class Demo
{
	static A get() // 这一句没有理解好，
	{
		return new B();
	}

	public static void main(String[] args)
	{
		A a=get();
		System.out.println(a.test());
	}
}
*/

// 第六题：错误。 搞清楚这个继承的流程
/*
class Super
{
	int i = 0;
	public Super(String a)
	{
		System.out.println("A");
		i=0;

	}
	public Super()
	{
		System.out.println("B");
		i+=2;
	}
}

class Demo extends Super
{
	public Demo(String a)
	{
		// 一定要注意这里是super();  省略的是  而不是super("A");
		System.out.println("C");
		i=5;
	}

	public static void main(String[] args)
	{
		int i = 4;   // 这个i相当于是没用的
		Super d = new Demo("A");
		System.out.println(d.i);
	}
}
*/



// 第七题  补足代码      做了2遍才过，
/*
interface Inter
{
	void show(int a, int b);
	void func();
}
class Demo
{
	public static void main(String[] args)
	{
		//补足代码，调用两个函数，要求使用匿名内部类
		Inter i = new Inter()
		{
			public void show(int a, int b)
			{
			}
			public void func()
			{}
		};
		i.show(2,3);
		i.func();
	}
}
*/

/*
第八题： 写出程序结果： 这道题编译失败，为什么？ 因为非静态类中无法定义静态变量。 
如果内部类中定义了静态成员，该内部类就必须被静态修饰。
class TD
{
	int y = 6;
	class Inner
	{
		static int y = 3;
		void show()
		{
			System.out.println(y);
		}
	}
}
class TC
{
	public static void main(String[] args)
	{
		TD.Inner ti = new TD().new Inner();
		ti,show();
	}
}
*/

/*
9 选择题，写出错误答案错误原因，用单行注释的方式。
class Demo
{
	int show(int a, int b){return 0;}
}
B.private int show(int a,int b)      不可以，因为权限不够，无法覆盖
C.private int show(int a,long b)     可以，因为和父类不是不是一个函数相当于重载
D.public short show(int a, int b)      不可以，这个函数因为数据类型不同，不可以和父类或者子类出现在一起，其中要注意，重载只是括号内的参数不同，而不应该是数据类型不同
因为子父类中的数据类型不同，所以不能够确定到底调用的是哪个类型的方法。
e.static int show(int a, int b)      不可以，因为静态只能覆盖静态
*/


// 11 写出程序的答案：
/*
class Fu
{
	int num = 4;
	public void show()
	{
		System.out.println("这是一个父类！");
	}
}

class Zi extends Fu
{
	int num = 5;
	public void show()
	{
		System.out.println("这是一个子类!");
	}
}

class Demo
{
	public static void main(String[] args)
	{
	Fu f = new Zi();   // 这是多态创建对象，成员变量与静态方法看左边的父类
	Zi z = new Zi();   // 这是正常的子类创建对应的对象
	System.out.println(f.num);
	System.out.println(z.num);
	f.show();
	z.show();
	}
}

*/

// 12.   完善该程序，补充代码
/*
interface A
{
	void show();
}

interface B
{
	void add(int a, int b);
}

class C implements A,B
{
	// 程序代码
	// 共有两种解法，第一种方法：重新定义一个sum，然后进行加法操作；   第二种方法，利用this  将局部变成成员，然后就都可以调用了。   我用了第一种成功了，然后尝试一下第二种方法。
	//public int sum = 0;
	private int a,b;
	public void add(int a, int b)
	{
		this.a = a;
		this.b = b;
		//sum = a+b;
		//return sum;
	}

	public void show()
	{
		System.out.println(a+b);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		C c = new C();
		c.add(4, 2);
		c.show();    // 通过该函数打印以上两个函数的和
	}
}
*/

/*
14 写出程序结果
class Super
{
	public int i = 0;
	Super(){}
	public Super(String s)
	{
		i=1;
	}

}

class Demo extends Super
{
	public Demo(String s)
	{
		// 这里省略了一个super();
		//super();
		int i =2;
		
	}
	public static void main(String[] args)   
	{
		Demo d = new Demo("yes");
		System.out.println(d.i);
	}
}
// 这一题编译失败，因为父类中缺少空的构造函数   或者是因为子类中应该通过对应的super语句调用父类中的构造函数;
*/

// 16. 写出程序结果：
/*
class Demo
{
	public static void func()
	{
		try
		{
			throw new Exception();
			System.out.println("A");
		}
		catch (Exception e)
		{
			System.out.println("B");
		}
	
	}
	public static void main(String[] args)
	{
		try
		{
			func();
		}
		catch (Exception e)
		{
			System.out.println("C");
		}
		System.out.println("D");
	}
}
编译失败，因为System.out.println("A");  这一条语句执行不到，
如果直接 throw new Exception() 抛出异常后面不跟语句才可以，如果跟着语句不能执行的到，这个要类比break continue
这道题可以和13题做一个类比。因为13题是封装到了函数里面，那就是可能执行得到，所以是不会报错的。
*/

/*
17题，选择正确的选项。
class Demo
{
	public void func()
	{
		// 位置1；
		new Inner();
	}

	class Inner()
	{
	}

	public static void main(String[] args)
	{
		Demo d = new Demo();
		// 位置2
		new Inner();
	}
}

选项：A.在位置1写 new Inner();
B.在位置2写 new Inner();
c.在位置2写 new d.Inner();
d.在位置2写 new Demo.Inner();

*/

// 18题   编译失败。因为多个catch时，父类的catch要放在下面。
/*
class Exc0 extends Exception{}
class Exc1 extends Exc0
{
}

class Demo
{
	public static void main(String[] args)
	{
		try
		{
			throw new Exc1();
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		catch(Exc0 e)
		{
			System.out.println("Exc0");
		}
	}
}


*/
/*
19.
interface Test
{
	void func();
}

class Demo
{
	public static void main(String[] args)
	{
		// 补充匿名内部类    思路：首先调用show方法，然后再通过这个使用匿名内部类传进去参数
		new Demo.show(New Test()
		{
			public void func(){}
		});
	}

	void show(Test t)
	{
		t.func();
	}
}
*/

/*
21 老师说是有技术含量的题
*/

// 22.补足compare函数内的代码，不许添加其他函数。  可以说比较有意思  结合了循环遍历
/*
class Circle
{
	private static double pi = 3.14;
	private double radius;
}
*/

/*25题可以自己练一下
在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，
如果存在，则返回这个字符第一次出现的位置(序号从0开始计算)
否则返回-1，要搜索的字符数组和字符都以参数的形式传给该方法，
如果传入的数组为null，应该抛出IllegalArguementException()异常
在类的main方法中可能出现的情况测试该方法是否正确，


26题 补足compare代码 还是有部分的疑问。。。
其实挺 好理解的 首先来看这个
public book getBook(){
return this;
}

return this; 简单的理解就是返回当前一个类的实例引用。
返回的是 book类
那么 就必须 return一个book类的实例
因为你当前 的 是book类 所以this就是book类的实例的引用
所谓的返回对象也就是在你声明方法时定义的返回类型
没有返回类型的是void 如：private void setName
具有返回类型的必须return 如：public book getBook 返回book类型
*/











