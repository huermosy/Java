/*
��ϰ4 д���������������ҳ�����ĵط����и���
*/
/* ��һ�����
��һ�������
1.����ĵ�һ�����в���ͨ������Ϊ�ں����ڲ��׳��쳣���ٺ�����û�н�����������û��catch
2.�ڶԺ������������Ժ����������Ϊ��B  C D   �ɴ����ǿ��Կ����׳��쳣��finally����ؼ���ִ�е�˳������Ⱥ��ϵ��
�۲������func()�����м�һ��catch�����쳣�Ļ�����ӡ��˳��ΪB   A    D �쳣��func()�ڲ����ܹ����
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
// �ڶ��� ��һ����ȷд����������Test	Demo	Test  �����������ʵ��������
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

// �����⣺��һ�����  д����������  ��һ������ʧ�ܣ���ΪA�ӿ��в�û��func()��һ��������
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
		A a = new B();  // ����һ����̬��
		System.out.println(a.func());
	}
}
*/

// ������ д��������  A   B   ���⿼�������д��ķ������õ������໹�Ǹ���
// ��������з��ص�ֵ��true�Ļ� ����ô��ӡ:A B D C B D C B
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
	boolean show(char a)     // ����һ����������д��
	{
		System.out.println(a);
		return true;
	}
}

*/

// ������д���������� ��һ�����Ҳ��ʧ�ܵģ���ΪA�ӿ���û�ж���test������
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
	static A get() // ��һ��û�����ã�
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

// �����⣺���� ���������̳е�����
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
		// һ��Ҫע��������super();  ʡ�Ե���  ������super("A");
		System.out.println("C");
		i=5;
	}

	public static void main(String[] args)
	{
		int i = 4;   // ���i�൱����û�õ�
		Super d = new Demo("A");
		System.out.println(d.i);
	}
}
*/



// ������  �������      ����2��Ź���
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
		//������룬��������������Ҫ��ʹ�������ڲ���
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
�ڰ��⣺ д���������� ��������ʧ�ܣ�Ϊʲô�� ��Ϊ�Ǿ�̬�����޷����徲̬������ 
����ڲ����ж����˾�̬��Ա�����ڲ���ͱ��뱻��̬���Ρ�
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
9 ѡ���⣬д������𰸴���ԭ���õ���ע�͵ķ�ʽ��
class Demo
{
	int show(int a, int b){return 0;}
}
B.private int show(int a,int b)      �����ԣ���ΪȨ�޲������޷�����
C.private int show(int a,long b)     ���ԣ���Ϊ�͸��಻�ǲ���һ�������൱������
D.public short show(int a, int b)      �����ԣ����������Ϊ�������Ͳ�ͬ�������Ժ͸���������������һ������Ҫע�⣬����ֻ�������ڵĲ�����ͬ������Ӧ�����������Ͳ�ͬ
��Ϊ�Ӹ����е��������Ͳ�ͬ�����Բ��ܹ�ȷ�����׵��õ����ĸ����͵ķ�����
e.static int show(int a, int b)      �����ԣ���Ϊ��ֻ̬�ܸ��Ǿ�̬
*/


// 11 д������Ĵ𰸣�
/*
class Fu
{
	int num = 4;
	public void show()
	{
		System.out.println("����һ�����࣡");
	}
}

class Zi extends Fu
{
	int num = 5;
	public void show()
	{
		System.out.println("����һ������!");
	}
}

class Demo
{
	public static void main(String[] args)
	{
	Fu f = new Zi();   // ���Ƕ�̬�������󣬳�Ա�����뾲̬��������ߵĸ���
	Zi z = new Zi();   // �������������ഴ����Ӧ�Ķ���
	System.out.println(f.num);
	System.out.println(z.num);
	f.show();
	z.show();
	}
}

*/

// 12.   ���Ƹó��򣬲������
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
	// �������
	// �������ֽⷨ����һ�ַ��������¶���һ��sum��Ȼ����мӷ�������   �ڶ��ַ���������this  ���ֲ���ɳ�Ա��Ȼ��Ͷ����Ե����ˡ�   �����˵�һ�ֳɹ��ˣ�Ȼ����һ�µڶ��ַ�����
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
		c.show();    // ͨ���ú�����ӡ�������������ĺ�
	}
}
*/

/*
14 д��������
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
		// ����ʡ����һ��super();
		//super();
		int i =2;
		
	}
	public static void main(String[] args)   
	{
		Demo d = new Demo("yes");
		System.out.println(d.i);
	}
}
// ��һ�����ʧ�ܣ���Ϊ������ȱ�ٿյĹ��캯��   ��������Ϊ������Ӧ��ͨ����Ӧ��super�����ø����еĹ��캯��;
*/

// 16. д����������
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
����ʧ�ܣ���ΪSystem.out.println("A");  ��һ�����ִ�в�����
���ֱ�� throw new Exception() �׳��쳣���治�����ſ��ԣ����������䲻��ִ�еĵ������Ҫ���break continue
�������Ժ�13����һ����ȡ���Ϊ13���Ƿ�װ���˺������棬�Ǿ��ǿ���ִ�еõ��������ǲ��ᱨ��ġ�
*/

/*
17�⣬ѡ����ȷ��ѡ�
class Demo
{
	public void func()
	{
		// λ��1��
		new Inner();
	}

	class Inner()
	{
	}

	public static void main(String[] args)
	{
		Demo d = new Demo();
		// λ��2
		new Inner();
	}
}

ѡ�A.��λ��1д new Inner();
B.��λ��2д new Inner();
c.��λ��2д new d.Inner();
d.��λ��2д new Demo.Inner();

*/

// 18��   ����ʧ�ܡ���Ϊ���catchʱ�������catchҪ�������档
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
		// ���������ڲ���    ˼·�����ȵ���show������Ȼ����ͨ�����ʹ�������ڲ��ഫ��ȥ����
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
21 ��ʦ˵���м�����������
*/

// 22.����compare�����ڵĴ��룬�����������������  ����˵�Ƚ�����˼  �����ѭ������
/*
class Circle
{
	private static double pi = 3.14;
	private double radius;
}
*/

/*25������Լ���һ��
��һ�����б�дһ�������������������һ���ַ��������Ƿ����ĳ���ַ���
������ڣ��򷵻�����ַ���һ�γ��ֵ�λ��(��Ŵ�0��ʼ����)
���򷵻�-1��Ҫ�������ַ�������ַ����Բ�������ʽ�����÷�����
������������Ϊnull��Ӧ���׳�IllegalArguementException()�쳣
�����main�����п��ܳ��ֵ�������Ը÷����Ƿ���ȷ��


26�� ����compare���� �����в��ֵ����ʡ�����
��ʵͦ ������ �����������
public book getBook(){
return this;
}

return this; �򵥵������Ƿ��ص�ǰһ�����ʵ�����á�
���ص��� book��
��ô �ͱ��� returnһ��book���ʵ��
��Ϊ�㵱ǰ �� ��book�� ����this����book���ʵ��������
��ν�ķ��ض���Ҳ����������������ʱ����ķ�������
û�з������͵���void �磺private void setName
���з������͵ı���return �磺public book getBook ����book����
*/











