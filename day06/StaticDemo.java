/*
���ߣ�huermosy
��̬����飬 ��ʽ��
static
{
}
���ã�������main����ִ�У����ڳ�ʼ����ʱ��ʹ��
*/

class StaticCode
{
	static
	{
		System.out.println("a");
	}
}

class  StaticCodeDemo
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		New StaticCode();
		New StaticCode();
		System.out.println("Over!");
	}
	static
	{
		System.out.println("c");
	}
}
