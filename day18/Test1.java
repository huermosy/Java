/*
1.��ȡ������Ķ����ж����졣
˼·������ָ���㰴����һ��ʱ�����
c.set(year,2,1)  // ĳһ���3��1��
c.add(Calenar.DAY_OF_MONTH,-1);  //3��1�գ���ǰ��һ�죬����2�����һ�졣

2.��ȡ������������ʱ��

*/

import java.util.*;
import java.text.*;

class Test1 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		c.set(2012,2,1);   // ����3��1��
		print1(c);

		Calendar c1 = Calendar.getInstance();
		print2(c1);

 	}

	public static void print1(Calendar c)      // ��ҵ1
	{
 		c.add(Calendar.DAY_OF_MONTH,-1);  
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

	public static void print2(Calendar c1)
	{
		c1.add(Calendar.DAY_OF_MONTH,-1);
//		c1.add(Calendar.MONTH,1);
		int m1 = c1.get(Calendar.YEAR);
		int m2 = c1.get(Calendar.MONTH);
		int t = c1.get(Calendar.DAY_OF_MONTH);

		int m3 = c1.get(Calendar.HOUR_OF_DAY);
		int m4 = c1.get(Calendar.MINUTE);
		System.out.println("����:"+m1+"��"+m2+"��"+t+"��"+"  "+m3+":"+m4);
	}
}
