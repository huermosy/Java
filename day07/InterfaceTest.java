/*
�ܵ���˵����������д�����У�����չ�Ĺ���д�ڽӿ��С�
*/

abstract class Student     // ����ѧ����һ����
{
	 abstract void study();
}

abstract interface Play
{
	abstract void play();   // ��֪��������ʲô�����������򣬿���������Ҳ������ƹ���� ��
}

class Zhangsan extends Student implements Play   // ������һ��ѧ��
{
	void study(){};
	public void play()   // ����Ȩ�޵ô��� ��ʵ�ֵ����Ȩ�ޣ�������public
	{
		System.out.println("��һ������");
	}
}



class  InterfaceTest
{
	public static void main(String[] args) 
	{
		Zhangsan s = new Zhangsan();
		s.play();
		System.out.println("Hello World!");
	}
}