/*
��ϰ�������ַ����ĳ��Ƚ�������

compartTo()   �������ַ������ã������ַ�������Ȼ˳������
*/
import java.util.*;

class  TreeSetTest
{
	public static void main(String[] args) 
	{   
		/*
		// ��һ�������������ķ���
		TreeSet s1 = new TreeSet(new  Comparator()
		{
			public int compare(Object o1, Object o2)      //   ע�⣺compare����Ĳ���������Object  �����������
			{
		// ��һ��ǿת
		String s1 = (String)o1;
		String s2 = (String)o2;
		//return (s1.length() - s2.length());
		
		if(s1.length() > s2.length())
			return 1;
		if(s1.length() == s2.length())
			return s1.compareTo(s2);            // ������Ȼ˳������
		return -1;
			}
			});        
			*/
		TreeSet s1 = new TreeSet(new  StrlenComparator());

		s1.add("huermosy");
		s1.add("liuneng");
		s1.add("datouwa");
		s1.add("ahao");
		s1.add("yangxiaopang");

		Iterator t1 = s1.iterator();
		while(t1.hasNext())     // ������������Ҫ�����
		{
			
			System.out.println(t1.next());
		}
		//System.out.println("Hello World!");
	}
}


class StrlenComparator implements Comparator
{
	public int compare(Object o1, Object o2)      //   ע�⣺compare����Ĳ���������Object  �����������
	{
		// ��һ��ǿת
		String s1 = (String)o1;
		String s2 = (String)o2;
		//return (s1.length() - s2.length());
		
		if(s1.length() > s2.length())
			return 1;
		if(s1.length() == s2.length())
			return s1.compareTo(s2);            // ������Ȼ˳������
		return -1;
		

	}
}
