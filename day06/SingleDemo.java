/*
���ģʽ�����ĳһ����������֮��Ч�ķ�����
java��23�����ģʽ��
�������ģʽ�����һ�������ڴ���ֻ����һ������

��Ҫ��֤�����Ψһ�ԡ�
1.Ϊ�˱�������������ཨ����������Ƚ�ֹ�����������������
2. ��Ϊ��������������Է��ʸ������ֻ���ڱ����У��Զ���һ������
3. Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��
 
��������ô�ô������֣�
1. �����캯��˽�л���
2. �����д���һ���������
3. �ڱ����ж���һ�����Է����������ĺ���

�������ģʽ��class���е�Ӧ��
*/

class Single
{
	private int num;

	public void setNum(int num)
	{
		this.num = num;
	}

	public int getnum()
	{
		return num;
	}

	private Single(){}

	private static Single s = new Single();
	public static Single getSingle()        // ��Ϊ�����÷������ã�ֻ�����������ã��� �������ñ����Ǿ�̬�ģ����Ա����static����
	{
		return s;
	}
}


class  SingleDemo
{
	public static void main(String[] args) 
	{
		/*
		//Single s1 = new Single();
		//Single ss = new Single();
		Single s1 = Single.getSingle();
		Single ss = Single.getSingle();
		s1.setNum(10);
		System.out.println(ss.getnum());
		//System.out.println("Hello World!");
		*/
		
		//Student a1 = new Student();
		//Student a2 = new Student();
		Student a1 = Student.getInstance();
		Student a2 = Student.getInstance();
		a1.setAge(30);
		System.out.println(a2.getAge());
	}
}

class Student
{
	private int age = 20;
	// ��ʼӦ�õ�����Ƶ�˼�룺 �����н�����һ������
	private  Student(){}       // �����캯��˽�л�

	private static Student c = new Student();          // �ڱ����д���һ������
	// ����һ�����Է��ʸ���ķ���
	public static Student getInstance()
	{
		return c;
	}

	public  void setAge(int age)
	{
		this.age = age;
	}

	public  int getAge()
	{
		return age;
	}

}

 