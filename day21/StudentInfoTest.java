/*  ����һ��java���ۺ���ϰ   �Լ��������һ�飬�漰�������ݿ��ܽ϶ࡣ�е��ѵ�   ���ˣ��������û�г�͸���ȷ�һ�ߡ�
��ס�����ڴ����е��ļ���Ӧ�Ķ����ֽ���
�����������5��ѧ����ÿ��ѧ����3�ſεĳɼ���
�Ӽ����������ϵ����ݣ��������������ſεĳɼ���
����ĸ�ʽ���磺������30,40,60������ܳɼ���
���Ұ�ѧ������Ϣ�ͼ�������ܷ����ߵ�˳����ڴ����ļ�stud.txt�С�
*/
class  StudentInfoTest
{
	public static void main(String[] args) 
	{
 	}
}


class Student
{
	private String name;
	private int ma,en,ch;      // �ֱ�����ѧ��Ӣ����������ſ�
	private int sum;
	
	Student(String name, int ma, int ch, int en)
	{
		this.name = name;
		this.ma = ma;
		this.ch = ch;
		this.en = en;
		sum = ma + ch + en;
	}

	public String getName()
	{
		return this.name;
	}

	public int getSum()
	{
		return this.sum;
	}

	public int hashCode()
	{
		return name.hashCode() + sum*66;
	}
	
	public int compareTo(Student s)
	{
		int num = new Integer(this.sum).compareTo(new Integer(s.sum));
		if(num==0)
		{
			return this.name.compareTo(s.name);
		}
		return num;
	}

	public boolean equals(Object obj)
	{
		if(!obj instanceof Student)
			throw new ClassCastException("���Ͳ�ƥ��");
		Student s = (Student)obj;

		return this.name.equals(s.name) && this.sum == s.sum;
	}

	public String toString()
	{
		return "student["+name+","+ma+","+cn+","+en+"]"
	}
}