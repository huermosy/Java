class OperateDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		short s = 4;
		// += -=   *=  /=    %=   这几个是赋值运算符，把左右两边的和 赋给左边，相当于做了一次强转换。
		// s = s+4  这条编译不会通过，因为强转换和左边的数据类型不匹配。左边为short，右边为int。
		s += 4;    // 这条编译通过，+= 运算符在给s赋值时，自动完成了强转操作。

		System.out.println(3>4);
	}
}
