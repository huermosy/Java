/*
���ߣ�huermosy
����   ʮ����ת��Ϊ������,    ʮ����ת��Ϊʮ������
����1��   1.ͨ��ȡģ��ȡ�����ֲ��������Ӧ������
2. ����Ϊ����ʾ�������� �� StringBuffer sb = new StringBuffer() ���´���һ��������Ȼ��
��reverse()�����ܹ�ʹ���������������  ����append����������
3. ����Ǵ�ӡһ�ζ��������֣��������������Ϊvoid��
4.�õ����м����������ȥ������ Ϊint����
����2��1.�����ӡʮ�����ƣ�������void����
2.����Ϊ��������֣�������int����
*/
class ArrayTest5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//to_binary(12);
		to_Hex(60);
	
	}

	public static void to_binary(int num)
	{
		StringBuffer sb = new StringBuffer();
		while(num>0)
		{
			sb.append(num%2);
			num = num>>1; 
		}
		System.out.println(sb.reverse());
	}

	public static void to_Hex(int num)
	{
		StringBuffer sb = new StringBuffer();
		for(int x=0; x<8; x++)
		{
			int a = num & 15;
			if(a>9)
			{
				sb.append((char)(a-10+'A'));
				//a = (char)(a-10+'A');  ��������Ļ�ǿת��ò���ǲ��ɹ���
				//System.out.println((char)(a-10+'A'));
			}
			else
			{
				sb.append(a);
				// System.out.println(a);
			}
		 
			num = num >>> 4; // �߼�����
		}
		System.out.println(sb.reverse());
		return ;
	}

}