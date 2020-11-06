/*
作者：huermosy
需求：   十进制转换为二进制,    十进制转换为十六进制
步骤1：   1.通过取模和取余两种操作获得相应的数字
2. 这里为了显示方便我们 用 StringBuffer sb = new StringBuffer() 重新创建一个容器，然后
用reverse()方法能够使二进制正向输出。  还有append方法的理解
3. 输出是打印一段二进制数字，所以输出的类型为void；
4.用到的中间变量：传进去的数字 为int类型
步骤2：1.输出打印十六进制，所以是void类型
2.输入为传入的数字，所以是int类型
*/
class ArrayTest5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//to_binary(12);
		to_Hex(60);
	
	}

	public static void to_binary(int num)
	{
		StringBuffer sb = new StringBuffer();
		while(num>0)
		{
			sb.append(num%2);
			num = num>>1; 
		}
		System.out.println(sb.reverse());
	}

	public static void to_Hex(int num)
	{
		StringBuffer sb = new StringBuffer();
		for(int x=0; x<8; x++)
		{
			int a = num & 15;
			if(a>9)
			{
				sb.append((char)(a-10+'A'));
				//a = (char)(a-10+'A');  如果这样的话强转换貌似是不成功的
				//System.out.println((char)(a-10+'A'));
			}
			else
			{
				sb.append(a);
				// System.out.println(a);
			}
		 
			num = num >>> 4; // 逻辑右移
		}
		System.out.println(sb.reverse());
		return ;
	}

}
