/*
	̽��һ��vector����
*/
import java.util.*;  // ����
class VectorDemo 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
//		sop("ԭv��"+v);
		Enumeration en = v.elements();
		while(en.hasMoreElements())
			sop(en.nextElement());		

	}
}