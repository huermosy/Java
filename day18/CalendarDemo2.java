// �趨������    c.set()
/*
�������� Calendar
������һ����ϰ���ò�������Ӧ���·ݣ�����

��������ϰ��
1.��ȡ������Ķ����ж����졣
˼·������ָ���㰴����һ��ʱ�����
c.set(year,2,1)  // ĳһ���3��1��
c.add(Calenar.DAY_OF_MONTH,-1);  //3��1�գ���ǰ��һ�죬����2�����һ�졣

2.��ȡ������������ʱ��
*/
import java.util.*;
import java.text.*;

class CalendarDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Calendar c = Calendar.getInstance();
//		c.set(2012,12,12);
		c.add(Calendar.MONTH,-1);
		PrintDate(c);

	}

	public static void PrintDate(Calendar c) 
	{
		// ��һ�����������ڵ����з�ʽ��һ��
		//getInstance()  ��ȡʹ��Ĭ��ʱ�����������õ���������ʽΪ��xxxx��xx��xx��  ����xxx          ���д���table�б���ǣ��º�����
		String[] mon = {"һ","��","��","��"
						,"��","��","��","��"
						,"��","ʮ","ʮһ","ʮ��"};
		String[] week = {"", "������","����һ","���ڶ�","������","������","������","������"};

//		Calendar c = Calendar.getInstance();
		int index = c.get(Calendar.MONTH);
		int index1 = c.get(Calendar.DAY_OF_WEEK);
		sop(c.get(Calendar.YEAR)+"��");
		sop(index+"��");
		sop(c.get(Calendar.DAY_OF_MONTH)+"��");
		sop(week[index1]);
		 

 	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
