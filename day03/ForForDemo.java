// ���Ƕ����ʽ����ʵ�������֮�л�����䡣
// ѭ��Ƕ�ס�
class ForForDemo 
{
	public static void main(String[] args) 
	{
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				System.out.print("*");
			}
			System.out.println();    // ֻ��һ�����ܾ��ǻ���
		}
		System.out.println("------------------");
		 
	// ��ӡ��Ҫ��ͼ��
	/*  ���������µ�����
	*****
	****
	***
	**
	*
	*/
		for(int x=0; x<5 ; x++ )
		{
			for(int y=x; y<5; y++)
			{
				System.out.print("*");
			}
			System.out.println();    // ������ܾ���һ������
			 
		}
		System.out.println("------------------");
	/*  �����ǳ��ϵ�����
	* 
	** 
	***
	*****
	*****
	*/
		for(int x=0; x<5 ; x++ )
		{
			for(int y=0; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println();    // ������ܾ���һ������
			 
		}
		System.out.println("------------------");
	/*
	���ǹ��ɵĹ��ɣ�
	�⳯�ϣ����Ըı�������������������ѭ���仯��
	�⳯�£����Ըı��ʼ��ֵ���ó�ʼ��ֵ������ѭ���仯
	*/
	/*
	1
	12
	123
	1234
	12345
	*/
		for(int x=1; x<=5 ; x++ )
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y);
			}
			System.out.println();    // ������ܾ���һ������
		}
		System.out.println("------------------");
		/*��ӡ9*9�˷���
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
		*/
		for(int x=1; x<=9 ; x++ )
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+ x*y+'\t');
			}
				System.out.println();
		}
	}
}
