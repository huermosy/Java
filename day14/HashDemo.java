/*
��һ�¹�ϣ���ϣ�
�ص㣺1.����    2.Ԫ�ز����ظ���
*/

import java.util.*;

class  HashDemo
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
		HashSet s1 = new HashSet();
		s1.add("java01");
		s1.add("java02");
		s1.add("java03");
		s1.add("java04");
		s1.add("java01");
		// ��һ�������һ�ν����Ԫ�ص������ֵ�͵ڶ��ν����Ԫ�ص������ֵ�����������һ��boolean���͵�
		sop(s1.add("java01"));
		sop(s1.add("java05"));

		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			sop("��ϣ���е�����Ϊ��"+it.next());
		}
	}

	public static void sop(Object obj) 
	{
		System.out.println(obj);
	}
}
