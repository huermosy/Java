/*
���Ͽ��(���ͷ���)
�������ķ����ж�Ӧ���������Ͳ�ȷ������ô���Խ����Ͷ����ڷ����ϡ�
ע�⣺���͵����÷�Χ�����ھֲ���

��̬�����޷��������϶���ķ��ͣ�
�����̬�����ж�Ӧ���������Ͳ�ȷ���������Լ�����һ�����͡�
*/

class Demo<S>
{
	public<S> void print(S t)        // �������͸����������������
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