/*
���ߣ�huermosy
������ʶ��ά���飬����ѧ���ά����ı������
*/
class  ArrayDemo4
{
	public static void main(String[] args) 
	{
		// System.out.println("Hello World!");
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		System.out.println(arr.length);     // ��ӡ���������ά����ĳ���
		System.out.println(arr[0].length);  // ��ӡ���������ά�����е�һ��С����ĳ���

		// �ö��徲̬�����ķ��������ά�������
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0; x<=arr1.length-1; x++)
		{
			for(int y=0; y<=arr1[x].length-1; y++)
			{
				System.out.print(arr1[x][y]);
			}
		}
	}


}
