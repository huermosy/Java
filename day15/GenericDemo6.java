/*
���˼·����ArrayList������������������һ�������洢�Ķ���String��������;��һ�������洢�Ķ���int�������͡�
�õ������������Ϊ������������й��Եķ��������Կ��Խ��ⲿ�ֳ�ȡ������д��һ��������

�޶���
? extends E :����E���ͻ���E�������͡� ����ת�͡�
��super E������E���ͻ���E�ĸ����͡�����ת�͡�
*/

import java.util.*;

class  GenericDemo6
{
	public static void main(String[] args) 
	{
		/*
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("lisi");
		ls.add("guang");
		ls.add("zhangsan");
		ls.add("wanger");
 
		ArrayList<Integer> nu = new ArrayList<Integer>();
		nu.add(4);
		nu.add(2);
		nu.add(1);

		printcoll(ls);
		printcoll(nu);
		*/
		ArrayList<Student> ls = new ArrayList<Student>();       // 		ArrayList<Person> ls = new ArrayList<Student>();    �����ַ�ʽ�治�С���    
		ls.add(new Student("lisi"));
		ls.add(new Student("wanger"));
		ls.add(new Student("zhangsan"));
		ls.add(new Student("xixi"));
		ls.add(new Student("yvfan"));

		printcoll(ls);
	}

	public static void printcoll(ArrayList<? extends Person> t)    // �ʺ���һ��ռλ����Ҳ�����þ���ķ��ţ� �þ���ķ�����һ���ô������ǿ��Խ��в��������ҿ����õ�����ķ�����,�����ַ�����.length()�ȷ�����
	{
		Iterator<? extends Person> it = t.iterator();
		while(it.hasNext())
		{
			System.out.println("���"+"::"+it.next().getName());      // ���е�getNameΪ���еķ��������Բ����ã���һ��ռλ����
		}
	}
}

class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}

class Student extends Person     // ����̳�
{
//	private String name;
	Student(String name)
	{
		super(name);
	}
}


/*     Comparator �����д
class comp implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
}


*/