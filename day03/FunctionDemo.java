/*
���ߣ�huermosy
���󣺶��庯��������ʹ�ú������˽⺯���Ĺ���
���裺1.����һ�� x*3+6 ��һ��ʽ�ӵĽ��
2. �ı�һ�º���������������ͣ���һ�²����Ľ����
*/
class FunctionDemo 
{
	public static void main(String[] args) 
	{
		int sum = result(9);
		System.out.println("result="+sum);
		result1(9);
	}

	public static int result(int num)
	{
		return num *3 + 6;
	}
	// �ڶ���д�����ڹ��ܺ�����ֱ�����Ϊprint����ʱ�����ķ���ֵ����Ϊvoid
	public static void result1(int num)
	{
		System.out.println("result=" + (num *3 + 6));
	//	return;   //�˴���return���Բ�д��ʡ�ԡ�
	}
}