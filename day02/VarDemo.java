/**
���ߣ�huermosy
��д���������������ڼ�����е�4�ֱ�����ʽ �ֱ�Ϊ�����ƣ��˽��ƣ�ʮ���ƣ�ʮ������
��д���裺1.�ڼ���������������60�ֱ����תΪ�����ƣ��˽��ƣ�ʮ������
			2.����������������������۲����ǵ����
*/
class VarDemo
{
	public static void main(String[] args) 
	{
		/*
		��������ĸ�ʽ��
		��������  ������= ��ʼ��ֵ
		���磺����һ��int���ͱ�����ȡֵΪ4
		*/
		int x = 4;
		x = 10;
		System.out.println(x);
		// ��ʾ������������

		byte b = 2; //-128~127

		// byte b1 = 128 �ᱨ��

		short s = 30000;

		long l = 41;

		float f = 2.332321938321f;   // ����С���Ļ�Ĭ����double���ͣ������к����һ��f������˵��

		System.out.println(f);

		double d = 34.56;

		char string = '4';    // char�������ڴ���ռ2��8λ

		boolean bo1 = true;
		boolean bo2 = false;

		byte d1 = 2;

		d1 = (byte)(d1 + 2);
		System.out.println(d1);
		
		System.out.println('a' + 1); // char����ǿ��ת����int����

		System.out.println((char)(98));  // ���98��Ӧ��ASCILL��
		/*
		ʲôʱ�������
		�����ݲ�ȷ��ʱ����Ҫ�����ݶ��������
		�Ͷ���һ����������ɴ洢������
		*/




		System.out.println(Integer.toBinaryString(-6));
		System.out.println(60);      // �ֱ�Ϊ������ �˽��� ʮ���� ��ʮ�����Ƶ����ֱ�����ʽ
		System.out.println(0x3c);
		System.out.println(074);      
		System.out.println(0b00111100);
	}
}