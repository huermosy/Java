/*
���ߣ�huermosy
���󣺹��ھ�̬������һЩ��������⡣
*/
class  StaticTest
{
	public static void main(String[] args) 
	{
		StaticDemo p = new StaticDemo();
		p.show();                    // �Ǿ�̬�����ö����½��ķ���������
		// StaticDemo.show();          //��̬����ֱ��������.��̬�������ĵ��÷���
	}
}

class StaticDemo
{
	String name = "zhangsan";

	public void show()
	{
		System.out.println("haha "+name);        // ��̬��Աֱ����
	}
}
