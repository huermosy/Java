/*
���ߣ�huermosy
����1.���ݳ�������ֵ�������Ӧ��������
	  2.��������ָ�����·ݣ���ӡ���·������ļ��ڡ�3,4,5���� 6,7,8�ļ� 9,10,11�＾  12,1,2����
*/
class IfTest  
{
	public static void main(String[] args) 
	{
		int n = 2;
		if(n==1)
			System.out.println("Monday");
		else if(n==2)
			System.out.println("Tuesday");
		else
			System.out.println("�������");
		//System.out.println("Hello World!");
		int m = 3;

		if(m == 3|| m==4 || m==5)                // �������ӷ��ĺô���ֻҪһ�������������Ͳ��ü����һ�ߣ�ִ��Ч�����
			System.out.println(x+"����");
		else if(m == 6|| m==7 ||m==8)
			System.out.println(x+"�ļ�");
		else if(m == 9|| m==10 || m==11)
			System.out.println(x+"�＾");
		else if(m == 12|| m==1 || m==2)
			System.out.println(x+"����");
		else
			System.out.println("�������,�·ݲ����ڣ�");
		{
		}
	}
}