/**
作者：huermosy
编写需求：来发现数字在计算机中的4种表达形式 分别为二进制，八进制，十进制，十六进制
编写步骤：1.在计算器中输入数字60分别把它转为二进制，八进制，十六进制
			2.定义主函数，并且输出来观察它们的输出
*/
class VarDemo
{
	public static void main(String[] args) 
	{
		/*
		定义变量的格式：
		数据类型  变量名= 初始化值
		例如：定义一个int类型变量，取值为4
		*/
		int x = 4;
		x = 10;
		System.out.println(x);
		// 演示其他数据类型

		byte b = 2; //-128~127

		// byte b1 = 128 会报错

		short s = 30000;

		long l = 41;

		float f = 2.332321938321f;   // 定义小数的话默认是double类型，除非有后面加一个f来进行说明

		System.out.println(f);

		double d = 34.56;

		char string = '4';    // char类型在内存中占2个8位

		boolean bo1 = true;
		boolean bo2 = false;

		byte d1 = 2;

		d1 = (byte)(d1 + 2);
		System.out.println(d1);
		
		System.out.println('a' + 1); // char类型强制转换成int类型

		System.out.println((char)(98));  // 输出98对应的ASCILL码
		/*
		什么时候定义变量
		当数据不确定时，需要对数据定义变量，
		就定义一个变量来完成存储动作。
		*/




		System.out.println(Integer.toBinaryString(-6));
		System.out.println(60);      // 分别为二进制 八进制 十进制 与十六进制的四种表达形式
		System.out.println(0x3c);
		System.out.println(074);      
		System.out.println(0b00111100);
	}
}
