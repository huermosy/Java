/*
作者：huermosy
需求：位运算符的理解
步骤：1. 要获得最低的四位，与上1111。要获得最低的n位，用相同的思想。
2. 三维运算符的运算
*/
class OperateDemo3
{
	public static void main(String[] args) 
	{
		System.out.println((char)(2+'a'));
		System.out.println("Hello World!");
		int num = 60;

		// 获取60的最低4位，通过&上15
		int n1 = num & 15;

		System.out.println(n1>9 ? (char)(n1-10+'a'):n1);

		// 获取下一组4位，将60右移4位
		num = num >>> 4;   // 三个///表示逻辑右移，而2个表示有符号右移。

		int n2 = num & 15;

		System.out.println(n2>9?(char)(n2-10+'A'):n2);

		int x = 1,y;

		y = (x>1)?'a':200;
		System.out.println("y="+y);





	}
}
