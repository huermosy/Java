class OperateDemo4 
{
	public static void main(String[] args) 
	{
		System.out.println(2<<3);     // ����λ������2*8
		// ����������������ֵ���л���
		// ��һ�ַ������������������temp�� ����һ���Ƽ��ķ�����
		/*
		int a = 2, b = 3, temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a="+a+","+"b="+b);
		*/
		// �ڶ��ַ�����ʹ�üӷ����㣬���Ǵ������⣬���ܻ���������������
		/*
		int a = 2, b = 3;
		a = a+b;
		b = a - b;
		a = a - b;
		System.out.println("a="+a+","+"b="+b);
		*/
		// �����ַ����� ʹ�����ķ���
		int a = 2, b = 3;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a="+a+","+"b="+b);

	}
}