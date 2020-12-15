// 其他对象（Date)

import java.util.*;
import java.text.*;
class  DateDemo
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);
		// 打印的时间看不懂，希望有些格式。
		SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");

		// 将模式封装到SimpleDateFormat对象中。
		String str = s.format(d);
		// 调用format方法让模式格式化指定Date对象中。
		System.out.println("time:"+str);
 	}
}
