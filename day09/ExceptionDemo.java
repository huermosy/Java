/*
�쳣�����ǳ���������ʱ���ֵĲ������������
java�����������Ҳ�ǻᱻ��װ���������

java���쳣�������������ʽ�� 1.error����һ���쳣�ǽ�Ϊ���أ�һ�㲻�ܹ������
2.Exception:��һ���쳣�Ƚ��ᣬһ����˵�ܹ���������Եķ��������


java��Ϊ�����ӿ��Ķ��ԣ���ĳЩ����ĺ�׺������������棬����һ�۾��ܿ�����˭�����ࡣ
*/
class Demo throw Exception     // ��throw�������˿��ܳ��ֵ�����
{
	int div(int a, int b)
	{
		return a/b;
	}
}

class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int div = d.div(4,0);     // ����һ�ֳ�0�쳣�����Խ��;    �������쳣��ʱ�򣬾��� new ArithmeticException    ����һ����0�쳣���ཨ��
			System.out.println(div);
		}
		catch(Exception e)
		{
			System.out.println("���������쳣��!");
		

		System.out.println("code run!");
		System.out.println(e.toString()); // by zero
		System.out.println(e.getMessage());   // �쳣���ƣ��쳣��Ϣ
		e.printStackTrace();   // �쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ�á�
		}
		//System.out.println("Hello World!");

		//byte[] arr = new byte[1024*1024*60000];   �����ڴ����
	}
}
