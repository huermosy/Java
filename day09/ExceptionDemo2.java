/*
 �쳣������throws     ���쳣����
 try...... catch......catch......catch   ���ֶ�catch�ĸ�ʽ
 ���쳣����ʱһ��Ҫע��
 1. ���Ҫд��������쳣��ʽ��Խ����Խ�ã�
 2. �����ֶ���쳣��ʱ�򣬸�����쳣Ҫд�������棬��ֹ���������쳣������쳣��
 �������쳣д���쳣�������ʱ�򣬾ͻὫ����������쳣�����ǵ�
 3. ���Ժ󿪷���ʱ���ڳ����쳣��ʱ����catch��׽����Ҫ��һ��print�����(����ֻ����Ϊ��ѧ��һ������ʾ��),��ʵ����Ļ���Ҫ����־�ļ�����¼��
*/
class Demo  
{
	int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException     // ��throw�������˿��ܳ��ֵ����⣬�׸�������������     ����������ܻ���ֳ�0�Ĵ���
	{
		 
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}

class ExceptionDemo2
{
	public static void main(String[] args)  //throws Exception   // �׸���������
	{
		Demo d = new Demo();
		try
		{
			int div = d.div(4,0);     // ����һ�ֳ�0�쳣�����Խ��;    �������쳣��ʱ�򣬾��� new ArithmeticException    ����һ����0�쳣���ཨ��
			System.out.println(div);      // ���׸���������ֹͣ���к���Ĵ�����
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("���������쳣��!");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("����Խ���쳣����");
		}
		 
		System.out.println("code run!");
		 
		
		//System.out.println("Hello World!");

		//byte[] arr = new byte[1024*1024*60000];   �����ڴ����
	}
}