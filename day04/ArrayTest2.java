/*
���ߣ�huermosy
����1.�ɸ���������ʵ��ѡ�����򣬲���֪��ѡ��������ں���
	  2.�ɸ���������ʵ��ð�����򣬲���֪��ð��������ں�
����1��1.����ѡ�����Ĳ��裬��Ϊ��ʵ��һ�������Ŀ�ģ�û��������������ͣ���������������void��
	   2.���Ҫ�õ��ı���Ϊint arr[]���͡�
����2����ʵ�벽��1���ƣ������㷨��ͬ

Ϊ���и߼��ɵķ�װ�����ǿ��ԶԺ����������Ľ��������������ȿ��ԶԽ������ֵĺ�����һ����װ��

�ú����������ӣ�������
*/
import java.util.*;      // ���ⲿ�����ʵ��java�Ĺ��ܡ�


class  ArrayTest2
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{4 ,5, 7 ,2 ,1 ,7 ,8 };
		printarray(arr);
		bubbling(arr);             // �����ֵ˳�����������
		//Arrays.sort(arr);
		printarray(arr);
		 
	}


	public static void selectSort(int arr[])      // ʵ��ѡ�������ܵĺ������Ӵ��С������㷨
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x; y<arr.length ;y++ )
			{
				Swap(arr, x, y);
			}
		}
	}

	public static void bubbling(int[] arr)   // ʵ��ð�������ܵĺ���,�Ӵ�С������㷨����һ��ʵ�ַ�ʽ for(int x=arr.length-1; x>0; x--)
	{
		for(int x=0; x<arr.length; x++)          //  ����ѭ���Ĵ���  ��һ��ʵ�ַ�ʽ for(int y-0; y<x; y++)
		{
			for(int y=0; y<arr.length-x-1; y++)    // ����ð��ȡ���ߵ�λ��
			{
				Swap(arr, y, y+1);
			}
		}
		return;
	}

	// ��Ϊ��������Ӧ���Ǳ�������ʽ�����Ի�Ҫ����һ����������ĺ���
	public static void printarray(int[] arr1)
		{
			System.out.print("[arr1: ");
			for(int x=0; x<arr1.length; x++)
			{
				 
				if (x != arr1.length-1)
				{
					System.out.print(arr1[x]+",");
				}
				else
				{
					System.out.println(arr1[x] + "]");
				}
			}
			return;
		}


	public static void Swap(int[] arr, int x, int y)
		{
			 int temp;
			 if(arr[x]<arr[y])
			 {
				 temp = arr[x];
				 arr[x] = arr[y];
				 arr[y] = temp;
			 }
		}
}
