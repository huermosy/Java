/*
object:������ֱ�ӻ��߼�Ӹ��࣬�����ϵ�
���е����඼��Object��ֱ�ӻ��߼������
*/
class Demo
{
	private int num;
	Demo(int num)     // ���캯��
	{
		this.num = num;
	}

	public boolean equals(Object obj)    // ����һ����̬�� Object obj = new Demo();   ���ǶԸ���Object����д��
	{
		if(!(obj instanceof Demo))
			return false;
		Demo d = (Demo) obj;       // ����һ�����µ�ǿת
		return this.num == d.num;
	}

	public String toString()           // ��д��Object���е�toString����
	{
		return "Demo"+num;
	}
}

class Person
{

}

 

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);                  // d1��object�ļ�ӻ�ֱ������
		Demo d2 = new Demo(5);
		/*
		System.out.println(d1.equals(d2));      //  equals �������ڸ��� Object��
		System.out.println(d1==d2);             // �����жϵ��ǵ�ֵַ
		System.out.println(d1.equals(d2));     
		*/
		System.out.println(d1.toString());
		//d1.toString();
	}
}