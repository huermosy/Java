/*
作者：huermosy
需求1：判断2个数是否相同。
思路1：1.输出结果是print打印一段东西，所以返回值是void。
2. 功能内是否有内容参与运算，有两个整数，所以可以定义两个未知变量并且数据类型可以是int。
需求2：对两个数进行比较，获取较大的数
思路2:1.输出结果：用print打印出较大的数，返回值为int类型
2. 功能内的内容有两个数参与运算，所以未知变量的数据类型可以是int。
*/
class  FunctionDemo2
{
	public static void main(String[] args) 
	{
		equal(2,2);
		int z = compare(3,1);
	
		System.out.println("两个数中较大的数为："+z);
	}
	public static void equal(int x, int y)    // 尽量不要用这一种void的方法，因为获得不了相应的结果，再进一步做操作的局限性比较小！
	{
		if(x==y)
			System.out.println("两个数相同");
		else
			System.out.println("两个数不相同");
	}
	public static int compare(int x, int y)
	{
		if(x>=y)
			return x;
		else
			return y;
	}
}
