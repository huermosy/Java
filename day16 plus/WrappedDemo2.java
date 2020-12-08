// 自动装箱与自动拆箱
class WrappedDemo2 
{
	public static void main(String[] args) 
	{
		// 自动装箱，简化书写  
		Integer i = 44;    // i = new Integer(44);
		// 自动拆箱
		i = i+3;         // i = new Integer(i.valueOf()+3)
//		Integer i1= myadd(i);

		System.out.println(i);
		// 当自动装箱的数据类型是byte范围的数字时，指向同一个对象

		Integer a = new Integer(127);
		Integer b = new Integer(127);

		System.out.println(a == b);
		System.out.println(a.equals(b));

		Integer c = 127;
		Integer d = 127;

		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
}
