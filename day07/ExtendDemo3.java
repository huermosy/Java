/*
�о�һ�¸��ǵ�����
�Ӹ����к������ص�-���ǣ�Ҳ����д��   ��87��
����Ҫע����ص㣺1. �����Ȩ�ޱ�����ڵ��ڸ����Ȩ�ޣ�
2. ֻ�о�̬���ܸ��Ǿ�̬

ע�����غ���д������
1.����ֻ��ͬ�������Ĳ����б�
2.��д���Ӹ����еķ�����Ҫһ���������еķ����������ʵ�����������
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

class Tel
{
	void show()
	{
		System.out.println("age");
	}
}

class NewTel extends Tel
{
	void show()
	{
		super.show();   // �̳и����е�show����
		System.out.println("name");
	}
}


class  ExtendDemo3
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
		NewTel t = new NewTel();
		t.show();
	}
}

