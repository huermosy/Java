/*
作者：huermosy
需求：
打印
----*
---* *
--* * *
-* * * *
* * * * *
*/
class  ForForTest3
{
	public static void main(String[] args) 
	{
		for(int x=0; x<5; x++ )
		{
			for(int y=x; y<4; y++)
			{
				System.out.print("-");
			}
			for(int z=0; z<=x; z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
