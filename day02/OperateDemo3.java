/*
���ߣ�huermosy
����λ�����������
���裺1. Ҫ�����͵���λ������1111��Ҫ�����͵�nλ������ͬ��˼�롣
2. ��ά�����������
*/
class OperateDemo3
{
	public static void main(String[] args) 
	{
		System.out.println((char)(2+'a'));
		System.out.println("Hello World!");
		int num = 60;

		// ��ȡ60�����4λ��ͨ��&��15
		int n1 = num & 15;

		System.out.println(n1>9 ? (char)(n1-10+'a'):n1);

		// ��ȡ��һ��4λ����60����4λ
		num = num >>> 4;   // ����///��ʾ�߼����ƣ���2����ʾ�з������ơ�

		int n2 = num & 15;

		System.out.println(n2>9?(char)(n2-10+'A'):n2);

		int x = 1,y;

		y = (x>1)?'a':200;
		System.out.println("y="+y);





	}
}