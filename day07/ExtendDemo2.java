/*
�Ӹ����б������ص� ��86��
�˽�super ����ø���ı������ķ���  ����this
��������ӣ�һ��Ļ��������Ա��������˽�еĻ���thisָ���ǶԱ����Ա���������ã�
���Ҫ�Ը����Ա���������õĻ�����ôҪ��num��Ϊ super.num �����Ļ�ָ�����ø���ı�����
*/
class Fu
{
	int num = 3;
}

class Zi extends Fu
{
	private int num = 4;
	void show()
	{
		System.out.println(num);   // �������num��this.num
	}
}


class  ExtendDemo2
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
	}
}
