// ���ö���API�������������Ͱ�װ��-������
/*
�������������ͷ�װ�ɶ���ĺô����ǿ��Ը���Ĳ������ݣ�
���õķ����ǻ�øö�������ȡֵ���������ڻ����������ͺ��ַ���֮��ܿ��ת����
8�ֻ����������Ͱ�װ�༰���Ӧ��

�ֱ��Ӧ1���ֽ� 2�ֽ�  4�ֽ�   8�ֽ�  һ���ֽ���8λ
������������		��װ�� 
byte				Byte
short				Short
int					Integer
long				Long
float				Float
double				Double
char				Character
boolean				Boolean

�����������ͺ��ַ����Ļ���ת����
������������---->�ַ�����
1. ������������ + ����
2. ��String�ľ�̬����valueOf()
3. ��

�ַ���--->������������
1. ��parse     xxx  parsexxx("��Ӧ�Ļ�����������")      ֻ��Characterû��parse����
Boolean.parseBoolean("true")
2. ����ַ�����Integer���ж����װ��
	����ʹ����һ���Ǿ�̬������intValue();��һ��Integer����ת�ɻ�����������ֵ��
3.
*/
class  WrappedDemo
{
	public static void main(String[] args) 
	{
		int num = 0;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-4));
		String s = String.valueOf(num);      //  String���е�valueOf()������
		System.out.println(s);

		int t = Integer.parseInt("3");
		System.out.println(t);
		System.out.println(Float.parseFloat("2"));
		/*
		�����߱���ͬ���Ƶ����֡�
		ʮ���� --> ��������
		�������� --> ʮ����
		API- to��������String()
				toString(��ֵ,����)
		*/
		// ʮ����-->��������
		System.out.println(Integer.toHexString(12));
		System.out.println(Integer.toOctalString(12));
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toString(12,16));
		// ��������-->ʮ����
		System.out.println(Integer.parseInt("3c",16));


		Integer x = new Integer("33");
		Integer i = new Integer(33);

		System.out.println(x==i);
		System.out.println(x.equals(i));
		System.out.println(x.compareTo(i));        // ��API������ֵ��



  	}
}
