/*
���󷽷�����ϰ��
����Ա����������������ͨԱ����Ա������3�����ԣ��ֱ������䣬нˮ���Ӧ��id�� Ա���ж�Ӧ�ķ�������work��������Ϊ�������չ��Ĺ�������ͬ��������Ƕ���һ�������෽�����ɡ�
��ͨԱ���Ĺ���
�����Ĺ������������bonus������һ������

*/
abstract class Workers
{ 
	// ��Ӧ��������
	private int age;
	private int pay;
	private int id;
 
	Workers(int age, int pay, int id)     // ���캯��
	{
		this.age = age;
		this.pay = pay;
		this.id = id;
	}

	public abstract void work();    // ������󷽷�

}

class Normal extends Workers    // �չ�
{
	private int bonus;
	Normal(int age, int pay, int id)
	{
		super(age,pay,id);
	}

	public void work()      // ����ķ���Ȩ��Ӧ�ô��ڸ���
	{
		System.out.println("�չ�������");
	}
}

class Managers extends Workers    // ����
{
	private int bonus;
	Managers(int age, int pay, int id, int bonus)
	{
		super(age, pay,id);
		this.bonus = bonus;
	}

	public void work()
	{
		System.out.println("����������");
	}
}



class  AbstractTest
{
	public static void main(String[] args) 
	{
		Managers w = new Managers(30,40000,5222,10000);
		w.work();
		//System.out.println("Hello World!");
	}
}