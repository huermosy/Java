/*
���ߣ�huermosy

����1������һ�����Σ����ɺ���
����2������һ��9*9�˷���ĺ���

��д˼·1��1.���������Ϊһ��*�ľ��Σ�������void���ͱ�ʾ
2.�����õ��ı���Ϊ���ζ�Ӧ�Ŀ�͸ߣ�������int���ͱ�ʾ

��д˼·2��1. ���Ϊ99�˷�����ӡ�����Ժ�������������Ϊvoid����
2.Ϊ���ܹ�ʹ99�˷����ܹ�����Ӧ�ı任���������ö�Ӧ��δ֪��1���� Ϊ��x*x ��һ����������

*/
class  FunctionTest
{
	public static void main(String[] args) 
	{
		rectangele(3,4);   //Ϊ�˵õ�һ��3*4�ľ���
		ninebynine(6);
		//System.out.println("Hello World!");
	}
	public static void rectangele(int x, int y)
	{
		for(int a=0; a<x; a++)
		{
			for(int b=0; b<y ; b++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// ����һ�����ϼ�ı�ʾ��ʽ���������ǿ��Ըı��жϵ�����
	public static void ninebynine(int x )
	{
		for(int a=1; a<=x; a++)
		{
			for(int b=1; b<=a ; b++ )
			{
				System.out.print(b+"*"+a+"="+(a*b)+"\t");
			}
			System.out.println();
		}
	}
}
