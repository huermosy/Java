/*
���󣺶�һ��Person��ֻ�гԷ��Ĺ��ܣ������������ǲ����ģ�������������һ��SuperPerson��ǿ���еĹ��ܣ�ͬʱ����Person��

װ�����ģʽ����ԭ�е����еĹ�����Ҫ��ǿ��ʱ�򣬾���Ҫ�õ�װ�����ģʽ��
װ�����ģʽ���Լ�����һ��װ���࣬ͬʱ����Ҫװ�εĶ����뵽װ����֮�У��Ӷ�ʵ�ֹ�����ǿ��Ŀ�ġ�

��װ�εĶ�����Ҫ���뵽 װ�����еĹ��캯��֮�С�
��ϰ���������ģʽ������ȷ��һ����ֻ��һ��ʵ������������Ʒ������ֱ��Ƕ���ʽ������ʽ��

*/

class Person
{
	public void chifan()
	{
		System.out.println("eating");
	}
}

class SuperPerson   // ����һ��װ���࣬��ǿ�˵�һ��Person���еĹ��ܡ�
{
	private Person p;
	SuperPerson(Person p)
	{
		this.p = p;
	}

	public void Superchifan()
	{
		//System.out.println("eating");
		p.chifan();      // ��һ�����Ĺ�����ԭ�е������У�����ֱ�ӵ��ã�˵���˱�װ�εĹ�ϵ��
		System.out.println("drinking");
		System.out.println("sleeping");
		System.out.println("cooking");
	}
}


class  Zhuangshi
{
	public static void main(String[] args) 
	{

		Person p = new Person();
//		p.chifan();
		SuperPerson p1 = new SuperPerson(p);
		p1.Superchifan();
//		System.out.println("Hello World!");
	}
}
