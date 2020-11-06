/*
作者：huermosy
需求：对数组的熟悉的一些操作
*/
class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[2];
		int[] arr1 = {3,1,2,6,5,4};
		int[] arr2 = new int[]{1,2,3,4,5};
		// ArrayIndexOutOfBoundsException:3.操作数组时，访问到了数组中不存在的角标
		// System.out.println(arr2[10]);
		arr1[1] = null;
		// System.out.println(arr1[1]);
		// NullPointerException:空指针异常：当引用没有任何指向值为null的情况，该引用还在用于操作实体。
	}
}

