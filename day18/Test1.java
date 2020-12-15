/*
1.获取任意年的二月有多少天。
思路：根据指定你按设置一个时间就是
c.set(year,2,1)  // 某一年的3月1日
c.add(Calenar.DAY_OF_MONTH,-1);  //3月1日，往前推一天，就是2月最后一天。

2.获取昨天的现在这个时刻

*/

import java.util.*;
import java.text.*;

class Test1 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		c.set(2012,2,1);   // 这是3月1日
		print1(c);

		Calendar c1 = Calendar.getInstance();
		print2(c1);

 	}

	public static void print1(Calendar c)      // 作业1
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
		System.out.println("日期:"+m1+"年"+m2+"月"+t+"日"+"  "+m3+":"+m4);
	}
}
