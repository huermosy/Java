/*
���ߣ�huermosy
���󣺶��������Ϥ��һЩ����
*/
class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[2];
		int[] arr1 = {3,1,2,6,5,4};
		int[] arr2 = new int[]{1,2,3,4,5};
		// ArrayIndexOutOfBoundsException:3.��������ʱ�����ʵ��������в����ڵĽǱ�
		// System.out.println(arr2[10]);
		arr1[1] = null;
		// System.out.println(arr1[1]);
		// NullPointerException:��ָ���쳣��������û���κ�ָ��ֵΪnull������������û������ڲ���ʵ�塣
	}
}

