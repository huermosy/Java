/*
���ߣ�huermosy
���󣺸���һ�����飬��ȡ�����е����ֵ����Сֵ
˼·��1.��ȡ��ֵ��Ҫ���бȽϣ�ÿһ�αȽ϶�����һ���ϴ��ֵ����Ϊ��ֵ��ȷ����ͨ��һ�����������ٴ�
2. �������е�ÿһ��Ԫ�ض�����������е�ֵ���бȽϡ���������˱����е�ֵ�����øñ�����¼�ϴ�ֵ
3. �����е�Ԫ�ض��Ƚ���ɣ���ô�ñ����д洢�ľ��������е����ֵ��
���裺
1.�����������ʼ�������е�����һ��Ԫ�ؼ��ɡ�
2. ͨ��ѭ������������б�����
3. �ڱ����������ж������������������Ԫ�رȱ����е�Ԫ�ش󣬾͸�ֵ������
*/
class ArrayTest 
{
	public static void main(String[] args) 
	{
		double[] arr = new double[]{2.0,3.0,4.0,5.0,6.0,7.0,8.0};
		System.out.println("maxֵΪ:"+Arraymax(arr));
		// System.out.println("minֵΪ:"+Arraymin(arr));
	}

	public static int Arraymax(int[] arr)    // �������ֵ�ĺ���
	{
		int temp = 0;
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]>0)
				temp = arr[x];
			 
		}
		return temp;
	}

	public static int Arraymin(int[] arr)    // ������Сֵ�ĺ���
	{
		int temp = 10;
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]<0)
				temp = arr[x];
			 
		}
		return temp;
	}
 
	public static double Arraymax(double[] arr)    // ��������ʽ���������ֵ��
	{
		double temp = 0.0;
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]>0)
				temp = arr[x];
		}
		return temp;
	}
}
