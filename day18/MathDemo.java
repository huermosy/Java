// 留一个练习，给定一个小数，保留该小数的后两位
// 其他对象（Math 与 Random）
/*
ceil返回大于指定数据的最小整数
floor返回小于指定数据的最大整数
round 四舍五入
pow 做乘方运算
random 随机数
Random 类  随机数
*/
import java.util.*;
class  MathDemo
{
	public static void main(String[] args) 
	{
		double d1 = Math.ceil(16.34);
		double d2 = Math.floor(16.34);
		double d3 = Math.round(17.22);
		double d4 = Math.pow(3,4);
		double d5 = Math.random()*10;
		sop("ceil:"+d1);
		sop("floor:"+d2);
		sop("round:"+d3);
		sop("pow:"+d4);
		sop("random:"+d5);
//		System.out.println("Hello World!");
		// 新建一个Random的类做
		Random r = new Random();
		for(int x = 0; x<10; x++)
		{
			int d = r.nextInt(10)+1;      // 下一个随机序列
			sop(d);
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
