/*
���ߣ�huermosy
����1���ж�2�����Ƿ���ͬ��
˼·1��1.��������print��ӡһ�ζ��������Է���ֵ��void��
2. �������Ƿ������ݲ������㣬���������������Կ��Զ�������δ֪���������������Ϳ�����int��
����2�������������бȽϣ���ȡ�ϴ����
˼·2:1.����������print��ӡ���ϴ����������ֵΪint����
2. �����ڵ��������������������㣬����δ֪�������������Ϳ�����int��
*/
class  FunctionDemo2
{
	public static void main(String[] args) 
	{
		equal(2,2);
		int z = compare(3,1);
	
		System.out.println("�������нϴ����Ϊ��"+z);
	}
	public static void equal(int x, int y)    // ������Ҫ����һ��void�ķ�������Ϊ��ò�����Ӧ�Ľ�����ٽ�һ���������ľ����ԱȽ�С��
	{
		if(x==y)
			System.out.println("��������ͬ");
		else
			System.out.println("����������ͬ");
	}
	public static int compare(int x, int y)
	{
		if(x>=y)
			return x;
		else
			return y;
	}
}