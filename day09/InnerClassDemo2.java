/*
�������(�����ڲ���)
���ڲ��ඨ���ھֲ�ʱ���������ص㣺
1. ���ܹ������η�������
2. ����ֱ��ʹ���ⲿ���еı��������ֲ��еı�����Ҫ��final���Σ�  ����û�з�����һ�㰡����

�����ڲ������û�����ֵ��ڲ��࣬
*/


// �ڲ������л����ڲ������һ�����֣��˺�����,������һ���ڲ���������˿�����������private��װ
/*
class Body
{
	private class Heart
	{
	}

	public void show()
	{
		new Heart().
	}
}

*/

class Outer
{
	int x = 3;
	void method(final int a)
	{
		int y = 4;
		class Inner
		{
			void function()
			{
				System.out.println(a);
			}
		}
		new Inner().function();
	}
}

class InnerClassDemo2
{
	public static void main(String[] args) 
	{
		new Outer().method(8);
		new Outer().method(9);   // ��Ȼ��final ���ǳ�ջ֮��͸�a�µı����ˡ�
		Outer o = new Outer();
		o.method(10);
		//System.out.println("Hello World!");
	}
}
