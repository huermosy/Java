/*
���ߣ�huermosy
���󣻶�public static void main(String[] args) ������һЩ̽��  ������һ��������ݣ� ����һ�¾�̬��Ĵ���
*/
class  MainDemo
{
	public static void main(String[] args) 
	{
		String[] arr = {"haha", "xixi", "lala", "muamua"};
		MainTest.main(arr);        // ��̬�������������÷���
	}
}

class  MainTest
{
	public static void main(String[] args) 
	{
		for(int x=0; x<args.length; x++)
		{
			System.out.println(args[x]);
		}
	}
}

