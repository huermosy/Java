/*
其他对象 Calendar
这里做一个练习，用查表法来查对应的月份，星期

留两个练习：
1.获取任意年的二月有多少天。
思路：根据指定你按设置一个时间就是
c.set(year,2,1)  // 某一年的3月1日
c.add(Calenar.DAY_OF_MONTH,-1);  //3月1日，往前推一天，就是2月最后一天。

2.获取昨天的现在这个时刻
*/
import java.util.*;
import java.text.*;

class  CalendarDemo
{
	public static void main(String[] args) 
	{
		// 做一个表，其中星期的排列方式不一样
		//getInstance()  获取使用默认时区和区域设置的日历，格式为：xxxx年xx月xx日  星期xxx          其中创建table列表的是：月和星期
		String[] mon = {"一","二","三","四"
						,"五","六","七","八"
						,"九","十","十一","十二"};
		String[] week = {"", "星期日","星期一","星期二","星期三","星期四","星期五","星期六"};

		Calendar c = Calendar.getInstance();
		int index = c.get(Calendar.MONTH);
		int index1 = c.get(Calendar.DAY_OF_WEEK);
		sop(c.get(Calendar.YEAR)+"年");
		sop(index+"月");
		sop(c.get(Calendar.DAY_OF_MONTH)+"日");
		sop(week[index1]);
		 

 	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
