/*
�������(�����ڲ���)
���ڲ��ඨ���ھֲ�ʱ���������ص㣺
1. ���ܹ������η�������
2. ����ֱ��ʹ���ⲿ���еı��������ֲ��еı�����Ҫ��final���Σ�  ����û�з�����һ�㰡����

�����ڲ������û�����ֵ��ڲ��࣬

1. �����ڲ�������ڲ���ļ�д��ʽ��
2. �����ڲ����ǰ�᣺�ڲ������ʵ��һ���ӿڻ��߼̳�һ���ࣻ
3. �����ڲ���ĸ�ʽ�� new ������(){���巽����}
4. ��ʵ�����ڲ������һ�����и��� �������������󣬲��ҷ�����Ƚ��֡�����Ϊ�����ݵ��������ȽϺá�

	 new AbsDemo(){�����Ķ���}.������();   д�������⣺��һ��ο�����һ������ ��Ϊû��Inner��������ˣ�����newһ��
 AbsDemo()�ĸ��࣬Ȼ�󽫷���д�ϡ���Ϊ��������û�ж���show�����������ڸ��������϶�Ӧ�ķ�������������������һ��ο��Կ�����һ������Ȼ�����show()������
*/
abstract class AbsDemo
{
	abstract void show();
}


class Outer
{
	private int x;
	/*
	class Inner extends AbsDemo
	{
		void show(int a)
		{
			System.out.println(a);
		}
	}
	*/
	public void function()
	{
		// �� new Inner() ���     ������ AbsDemo a = new Inner() ���  ��ʵ������������Ϊһ����̬�ķ���

		new AbsDemo()          // �������������AbsDemo���������
		{
			void show()
			{
				System.out.println("x="+x);
			}
			void haha()
			{
				System.out.println("hahaha");
			}
		}.show();                  //   �������Ҫ���������   ���Կ�����   new AbsDemo(){�����Ķ���}.������();   ���ǿ�������awt�ĳ���д��
		//a.show();
		// a.haha();     ��һ�����벻��ͨ������Ϊ��̬�ı��뿴��߸��࣬��ΪAbsDemo�в�û�ж���  haha������һ��������
 
	}
}

class InnerClassDemo4
{
	public static void main(String[] args) 
	{
		 new Outer().function();
 
	 
		//System.out.println("Hello World!");
	}
}

class InnerTest  // Object����������ϵۣ� ��������������
{
	static class Inner
	{
		public void function()
		{}
	}

	public static void mian(String[] args)
	{
		new Inner().function;
	}
}