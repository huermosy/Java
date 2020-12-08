// 常用对象API（基本数据类型包装类-概述）
/*
将基本数据类型封装成对象的好处：是可以更多的操作数据，
常用的方法是获得该对象的最大取值，并且能在基本数据类型和字符串之间很快的转换。
8种基本数据类型包装类及其对应：

分别对应1个字节 2字节  4字节   8字节  一个字节是8位
基本数据类型		包装类 
byte				Byte
short				Short
int					Integer
long				Long
float				Float
double				Double
char				Character
boolean				Boolean

基本数据类型和字符串的互相转换：
基本数据类型---->字符串：
1. 基本数据类型 + “”
2. 用String的静态方法valueOf()
3. 用

字符串--->基本数据类型
1. 用parse     xxx  parsexxx("对应的基本数据类型")      只有Character没有parse方法
Boolean.parseBoolean("true")
2. 如果字符串被Integer进行对象封装。
	可以使用另一个非静态方法，intValue();讲一个Integer对象转成基本数据类型值。
3.
*/
class  WrappedDemo
{
	public static void main(String[] args) 
	{
		int num = 0;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-4));
		String s = String.valueOf(num);      //  String类中的valueOf()方法。
		System.out.println(s);

		int t = Integer.parseInt("3");
		System.out.println(t);
		System.out.println(Float.parseFloat("2"));
		/*
		整数具备不同进制的体现。
		十进制 --> 其他进制
		其他进制 --> 十进制
		API- to进制类型String()
				toString(数值,进制)
		*/
		// 十进制-->其他进制
		System.out.println(Integer.toHexString(12));
		System.out.println(Integer.toOctalString(12));
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toString(12,16));
		// 其他进制-->十进制
		System.out.println(Integer.parseInt("3c",16));


		Integer x = new Integer("33");
		Integer i = new Integer(33);

		System.out.println(x==i);
		System.out.println(x.equals(i));
		System.out.println(x.compareTo(i));        // 查API看返回值。



  	}
}
