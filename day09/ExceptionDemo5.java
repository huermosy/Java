/*
Exception����һ������������쳣RuntimeException ����ʱ�쳣��
����ٺ��������׳����쳣���������Բ�������������һ��ͨ����
����ں����������˸��쳣�������߿��Բ��ô�������һ��ͨ����


���û�����꣬��Ϊ�о��е��¡���
�����쳣�����֣�
1.����ʱ�������쳣��  2.����ʱ���������쳣(����ʱ�쳣��RunTimeException);
*/

class Demo  
{
	int div(int a , int b) throws RuntimeException
	{
		return a/b;
	}
}

class  ExceptionDemo5
{
	public static void main(String[] args) 
	{
		// ���������ҵ���
		Demo d = new Demo();
		int num = d.div(4,-9); 
		System.out.println("num:"+num);
		System.out.println("Code over!");
	}
}
