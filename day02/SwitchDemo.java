/*
���ߣ�huermosy
�������������switch������С�����İ���
1.�������ֵĲ�ͬд��ͬ�����
2.����������Ĳ�ͬд��ͬ�������
ע�⣺switch()�����ܸ������������У�byte, short, int, char
*/
class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int x = 2;
		switch(x)
		{
			case 1:
				System.out.println(x+"a");
				break;
			case 2:
				System.out.println(x+"b");
				break;
			case 3:
				System.out.println(x+"a");
				break;
			default:
				System.out.println("�Ƿ�");
				break;

		}
		int a=4,b=2;
		char ch = '/';
		
		switch(ch)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("����Ƿ�");
			break;

		}

		System.out.println("Hello World!");
	}
}
