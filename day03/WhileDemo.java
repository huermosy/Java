/*
���ߣ�huermosy
���������ʵ��һ��whileѭ��
��д˼·�������ʼ�����ʽ
		whlie(�������ʽ)
		{
		ѭ���壨ִ����䣩
		}
*/

class WhileDemo 
{
	public static void main(String[] args) 
	{
		int x = 3;
		/*
		while(x>-1)
		{
		System.out.println("Hello World!");
		x-=1;
		}
		*/
		do
		{
			System.out.println("Hello World!");
			x -= 1;
		}
		while(x>-1);

		do
		{
			System.out.println("Hello World!");
			x -= 1;
		}
		while(x>4);
/* ˵��һ��do while��while������
1.while���ж��������ʽ����ִ��ѭ���塣
2.do  while������λ�ִ��һ��ѭ���壬Ȼ���ھ����������ʽ�����жϡ�
*/

	}
}
