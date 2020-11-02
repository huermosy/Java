class  OperateDemo
{
	public static void main(String[] args) 
	{	/*
		\n:换行
		\b:退格，相当于backspace
		\r：相当于按下回车符
		\t：制表符，相当于按下table
		*/
		System.out.println("Hello\nWorld!");
		System.out.println("\"Hello World!\"");  //输出一个带双引号的Hello World,其中\代表的是转义符
		System.out.println("\\Hello World!\\");
		int a = 3,b;

		b = a++;     // a++相当于a=a+1 这里涉及运算的先后顺序，先计算b=a 再计算  a= a+1
		System.out.println("a="+a+","+"b="+b);     // 为了用户更好的体验
 
		// 字符串数据和任何数据用+相连，最终都会变成字符串
		System.out.println("5+5="+(5+5));  // 结果为 5+5=55

		char st = '好';
		System.out.println(st);

	}
}
