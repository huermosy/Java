class Fu
{
	int num = 5;
	public void method1()
	{
		System.out.println("����ķ���1");
	}

	public void method2()
	{
		System.out.println("����ķ���2");
	}
}

class Zi extends Fu
{
	int num = 10;
	public void method1()  // ���ǶԸ������д
	{
		System.out.println("����ķ���1");
	}
	
	public void method3()
	{
		System.out.println("����ķ���3");
	}
}
/*
һ��С�᣺ �������Ƿ�ɹ����������ͱ����е����Ƿ��з�����Ҳ���ǿ���������ʱ��ߵ����еķ���
		  �������Ƿ�ɹ����������������������еķ����Ƿ���ڣ�Ҳ���ǿ���������ʱ�ұߵ���ķ�����
 �ܽ᣺��Ա�����ڶ�̬���õ�ʱ�򣬱��뿴��ߣ����п��ұߡ�

 
*/

class DuoTaiDemo4 
{
	public static void main(String[] args) 
	{
// һ��С���ܽᣬ�����Ǳ��뻹�����У��ڷ��ʳ�Ա����ʱ��ʼ���ǵ��� ��������ʱ������еĳ�Ա������
// ��̬��Ա�����ڶ�̬���õ�ʱ���ǿ����
    
		Fu z = new Zi();         // ����һ����̬�ĵ���
		Zi z = new Zi();
		System.out.println(z.num);   // �����еĳ�Ա����
		Fu f = new Fu();
		System.out.println(f.num);    // �����еĳ�Ա����
		z.method1();
		z.method2();
		z.method3();
		System.out.println("Hello World!");
	}
}