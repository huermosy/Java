/*
���ߣ�huermosy
���󣺶���������࣬��������Ӧ�Ŀ�����
֮���Զ����ṩ���ʷ�ʽ��������Ϊ�ڷ��ʷ�ʽ�п��Լ����߼��жϵ���䣬�Է��ʵ����ݽ��в�������ߴ���Ľ�׳�ԡ�
*/
class Person 
{
	 private int age;   // �����������˽�б������壬��ô��ʼĬ��ֵΪ0
	// һ����Ա����һ���������������ֱ�Ϊ���úͻ�ȡ
	 public  void SetAge(int a)        // ���ó�Ա������ֵ��
	{
		if(a >0 && a <120)
		{
			age = a;
		}
		else
			System.out.println("Wrong!");
	}

	 public int GetAge()        // ��ȡ��Ա������ֵ
	{
		return age; 
	}


	 void speak()
	{
		System.out.println("Person's age:"+age); 
	}
}

class PersonDemo
{
	public static void main(String[] args)     // ���������������
	{
	Person p = new Person();
	p.SetAge(28);
	p.speak();
	}
}
