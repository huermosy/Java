/*
 �쳣������throws
*/
class Demo  
{
	int div(int a, int b) throws Exception     // ��throw�������˿��ܳ��ֵ����⣬�׸�������������     ����������ܻ���ֳ�0�Ĵ���
	{
		return a/b;
	}
}

class ExceptionDemo1  
{
	public static void main(String[] args)  //throws Exception   // �׸���������
	{
		Demo d = new Demo();
		try
		{
			int div = d.div(4,0);     // ����һ�ֳ�0�쳣�����Խ��;    �������쳣��ʱ�򣬾��� new ArithmeticException    ����һ����0�쳣���ཨ��
			System.out.println(div);      // ���׸���������ֹͣ���к���Ĵ�����
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
			 
		 
		System.out.println("���������쳣��!");
		

		System.out.println("code run!");
		 
		
		//System.out.println("Hello World!");

		//byte[] arr = new byte[1024*1024*60000];   �����ڴ����
	}
}