/*
作者：huermosy
需求：1.了解for这一种循环格式
		2.了解无限循环
*/
class  ForTest
{
	public static void main(String[] args) 
	{
		int x = 1;
		for(System.out.println("a"); x<3; System.out.println("c"),x++)
		{
			System.out.println("b");	
		}
		for(;;)   // 无限循环1
		{
		}
		/*
		while(true)  //无限循环2
		{
		}
		*/
		 
	}
}
