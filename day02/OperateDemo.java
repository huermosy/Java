class  OperateDemo
{
	public static void main(String[] args) 
	{	/*
		\n:����
		\b:�˸��൱��backspace
		\r���൱�ڰ��»س���
		\t���Ʊ�����൱�ڰ���table
		*/
		System.out.println("Hello\nWorld!");
		System.out.println("\"Hello World!\"");  //���һ����˫���ŵ�Hello World,����\�������ת���
		System.out.println("\\Hello World!\\");
		int a = 3,b;

		b = a++;     // a++�൱��a=a+1 �����漰������Ⱥ�˳���ȼ���b=a �ټ���  a= a+1
		System.out.println("a="+a+","+"b="+b);     // Ϊ���û����õ�����
 
		// �ַ������ݺ��κ�������+���������ն������ַ���
		System.out.println("5+5="+(5+5));  // ���Ϊ 5+5=55

		char st = '��';
		System.out.println(st);

	}
}
