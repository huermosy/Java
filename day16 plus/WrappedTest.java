/*
��ϰ����һ���ַ����е���ֵ���д�С���������
��20 78 9 -7 88 36 29��

��д��˼·��
1.���ַ���ͨ��split�����ָ���ַ�������;
2.���ַ�������ת��int���͵�����;
3.��int���͵���������;
4.������������ת���ַ���������������
*/

import java.util.Arrays;      // ������������ܹ��ܿ������

class  WrappedTest
{
	public static void main(String[] args) 
	{
		String s = "20 78 9 -7 88 36 29";    // ����һ���µ��ַ���
		System.out.println("����ǰ�������"+s);
		String s1 = Stringsort(s);
		System.out.println("�����������"+s1);
//		System.out.println("Hello World!");
	}
	
	public static String Stringsort(String s1)
	{
		// 1.���ַ���ͨ��split�����ָ���ַ�������;
		String[] arr_str =  Stringsplit(s1);

		// 2.���ַ�������ת��int���͵�����;
		int[] arr_int = StringInt(arr_str);

		// 3.��int���͵���������;
		ArraySort(arr_int);

		// 4.������������ת���ַ������������
		String str1 = ArraytoString(arr_int);
		return str1;
		
	}
	
	public static String[] Stringsplit(String s1)
	{
		String[] st = s1.split(" ");       // ͨ�����ո�ָ���Եõ�ÿ��Ԫ��Ϊ�ַ���������ṹ��
		return st;
	}

	public static int[] StringInt(String[] arr_str)
	{
		int[] arr_int = new int[arr_str.length];       // ��������ռ�
		for(int x = 0; x<arr_str.length; x++)
		{
			arr_int[x] = Integer.parseInt(arr_str[x]);        // ���ַ�������Ϊint���͵ı�����
		}
		return arr_int;
	}
	 
	public static void ArraySort(int[] arr_int)
	{
		Arrays.sort(arr_int);
	}

	public static String ArraytoString(int[] arr_int)
	{
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<arr_int.length ;x++ )
		{
			if(x!=arr_int.length-1)
				sb.append(arr_int[x]+" ");    // ����������Ԫ�ء�
			else
				sb.append(arr_int[x]);
		}
		return sb.toString();
	}

}