/*
���ߣ�huermosy
������������ҵ��㷨
��ͨ�Ĳ��Ҳ��裺1.���ΪС�꣬������int����
2.�м������Ҫ�����ֵΪ����arr��������Ҫ���ҵ���

�۰���ҵĲ��裺1.   2.        ����ȱ�ݣ������������ģ�

���˺ܶ����Ƶ��Ҫ�ú����һ��
��ϰ�� ��һ����������飬��Ҫ��һ��Ԫ�ز��뵽�������У���Ҫ��֤������������ġ�
*/
class  ArrayTest4
{

	public static void main(String[] args) 
	{
		int[] x = new int[]{1,2,3,4,6,7,8,9,10};  // Ҳ����д��Ϊ int[] x = {}
		System.out.println("Index:"+halfIndex_2(x, 5));
	}
// ���幦�ܣ����key�������е�һ�γ��ֵ�λ�õ��±꣬���û�г��֣��򷵻�-1
	public static int getIndex(int[] arr, int key)
	{
		for(int x=0; x<arr.length; x++)      // ����ı���
		{
			if(arr[x] == key)
			{
				return x;
			}  
		}
		return -1;     // ��ʾû���ҵ���������-1����ʾ��
	}


	public static int halfIndex(int[] arr, int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length -1;
		mid = (max - min)/2;
		while(arr[mid] != key)
		{
			if(key > arr[mid])
			{
				min = mid + 1;
			}
			else if(key < arr[mid])
			{
				max = mid - 1;
			}
			if(min > max)        // ��������Сֵ�������ֵ ��ô����Խ��       ����һ��Ҫע�ⲻ����else if ����Ͳ���һ����䣬������ִ��
			{
				return -1;
			}
			mid = (max + min) >> 1;     // ����1λ�� ���൱��/2
		}
		return mid;               // �����ruturn���ֵ��Ϊmin ���µ�Ԫ��ΪҪ�����λ��
	}

	// �۰�ĵڶ��ַ�ʽ
	public static int halfIndex_2(int[] arr, int key)
	{
		int min = 0, max = arr.length-1, mid;
		while(min<=max)
		{
			mid = (min + max)/2;
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return min;            // �����ruturn�����ֵ��Ϊmin  ��ΪҪ�����λ��
	}
}
