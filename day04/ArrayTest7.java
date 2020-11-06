/*
���ߣ�huermosy
�����������ʮ����ת�����ƣ��˽��ƣ�ʮ�����Ƽ��ɣ�����һ���߼��ɶȵķ�װ
���裺1.
*/
class ArrayTest7 
{
	public static void main(String[] args) 
	{
		 
		to_binary(17);
		to_eight(17);
		to_hex(100);
		//System.out.println("Hello World!");
	}
	// ʮ����ת������

	public static void to_binary(int num)
	{
		trans(num,1,1);
		System.out.println(" ");
	}

	// ʮ����ת�˽���
	public static void to_eight(int num)
	{
		trans(num,7,3);
		System.out.println(" ");
	}
	
	// ʮ����תʮ������
	public static void to_hex(int num)
	{
		trans(num,15,4);
		System.out.println(" ");
	}

 
	public static void trans(int num, int base, int offset)    // ���������ֱ���Ҫת���Ĳ��������ϵ�ֵ��ƫ����
	{
		if(num==0)
		{
			System.out.print(0);
			return;
		}
		// ����һ����Ҫ�����ı���
		char[] chs = {'0','1','2','3',
			'4','5','6','7','8','9','A',
			'B','C','D','E','F'};
		// ����һ�����Դ洢���ݵ�����
		char[] arr = new char[32];
		// ����һ��ָ��
		int pos = arr.length;

		while(num!=0)
		{
			int temp = num & base;
			arr[--pos] = chs[temp];
			num = num >>> offset;
		}
//		System.out.println(pos);
		// ��������ʵ�����
		
		for(int x = pos; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}

	}
}