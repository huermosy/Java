/*  这是一个java的综合练习   自己尝试完成一遍，涉及到的内容可能较多。有点难的   算了，这个例子没有吃透，先放一边。
记住：放在磁盘中的文件对应的都是字节流
需求分析：有5个学生，每个学生有3门课的成绩。
从键盘输入以上的数据（包括姓名，三门课的成绩）
输入的格式：如：张三，30,40,60计算出总成绩。
并且把学生的信息和计算出的总分数高低顺序放在磁盘文件stud.txt中。
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
	private int ma,en,ch;      // 分别是数学，英语和语文三门课
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
			throw new ClassCastException("类型不匹配");
		Student s = (Student)obj;

		return this.name.equals(s.name) && this.sum == s.sum;
	}

	public String toString()
	{
		return "student["+name+","+ma+","+cn+","+en+"]"
	}
}