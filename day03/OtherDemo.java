/*
���ߣ�huermosy
����1.�˽�һ��forѭ���ı��
2.�˽�һ��continue��break�����ؼ��ֵ��÷�
*/
class  OtherDemo
{
	public static void main(String[] args) 
	{
		w:for(int x=0; x<3; x++)
		{
			q:for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break w;
			}
		}
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				// continue; ������Ͳ�����ʲô���������continue����������ѭ���ṹ������ѭ����
				System.out.println("x="+x);
				continue;
			}
		}
	}
}
