/*
���ߣ�huermosy
���������1.����һ������ʵ����������ӡ�
2.�����������������ɸ��ḻ�Ĺ���
��д˼·��1.���Ϊ���Σ�������int��������
2.һ��Ҫ�õ�2�����������Զ�������int���͵ı���
3.��һ������Ϊ��ߴ��븴���ԣ�����ֱ�����Ѿ�����õĺ�������
*/
class FunctionOverload 
{
	public static void main(String[] args) 
	{
		System.out.println(add(1,2,3));
		ninebynine();
		//System.out.println("Hello World!");
	}

	public static int add(int x, int y)
	{
		return x+y;
	}
//�����Ǻ�������
	public static int add(int x, int y, int z)
	{
		return	add(x,y) + z;
	
	}
	public static void ninebynine(int num)
	{
		for(int x=1; x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+(y*x)+"\t");
			}
			System.out.println();
		}
	}
	public static void ninebynine()
	{
		ninebynine(9);
	}

}