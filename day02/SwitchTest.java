/*
���ߣ�huermosy
�������������ָ�����·ݣ���ӡ���·������ļ��ڣ�
����3,4,5Ϊ������6,7,8Ϊ�ļ���9,10,11Ϊ�＾��12,1,2Ϊ����
*/
class SwitchTest 
{
	public static void main(String[] args) 
	{
		int x = 4;
		switch(x)
		{
		case 3:
		case 4:
		case 5:
			System.out.println(x+":����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(x+":�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(x+":�＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(x+":����");
			break;
		default:
			System.out.println("�����ʽ����");
		}
		System.out.println("Hello World!");
	}
}
