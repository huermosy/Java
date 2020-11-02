/*
作者：huermosy
需求分析：根据switch做两个小分析的案例
1.根据数字的不同写不同的输出
2.根据运算符的不同写不同的运算符
注意：switch()里面能跟的数据类型有：byte, short, int, char
*/
class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int x = 2;
		switch(x)
		{
			case 1:
				System.out.println(x+"a");
				break;
			case 2:
				System.out.println(x+"b");
				break;
			case 3:
				System.out.println(x+"a");
				break;
			default:
				System.out.println("非法");
				break;

		}
		int a=4,b=2;
		char ch = '/';
		
		switch(ch)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("输入非法");
			break;

		}

		System.out.println("Hello World!");
	}
}
