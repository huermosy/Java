/*
���ߣ�huermosy
����ѧ���������
*/
class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		// ����Ĳ�����
		// ��ȡ�����е�Ԫ�أ�ͨ�����õ�������
		// System.out.println("Hello World!");
		int[] arr = new int[3];
		int[] arr1 = new int[]{3,4,5,6,7};
		for(int x=0; x<3 ; x++ )
		{
			System.out.println("arr["+x+"]="+arr[x]+";");      // �ñ����ķ��������������е�ÿһ��Ԫ�ء�
		}
		System.out.println(arr1.length);
		for(int x=0; x<arr1.length;x++)     // ����length���Կ���ֱ�ӻ�ȡ������Ԫ�صĸ���
		{
			System.out.println("arr1["+x+"]="+arr1[x]+";");
		}
		printarray(arr1);
		//�����ö���һ�������������ڴ�ӡ�����е�Ԫ�أ������ö��Ÿ���
		/*
		��д˼·��1.����Ǵ�ӡһ�ζ��������Ժ������������Ͷ���Ϊvoid����
		2.��������ı���,ò�Ʋ�̫��Ҫ�� �ðɣ�������Ҫ�������͵ı�����
		*/
 
	}
		public static void printarray(int[] arr1)
		{
			System.out.print("[arr1:");
			for(int x=0; x<arr1.length; x++)
			{
				 
				if (x != arr1.length-1)
				{
					System.out.print(arr1[x]+",");
				}
				else
				{
					System.out.print(arr1[x] + "]");
				}
			}
			return;
		}
}