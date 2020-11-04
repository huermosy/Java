/*
作者：huermosy
需求：1.了解一下for循环的标号
2.了解一下continue与break两个关键字的用法
*/
class  OtherDemo
{
	public static void main(String[] args) 
	{
		w:for(int x=0; x<3; x++)
		{
			q:for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break w;
			}
		}
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				// continue; 放在这就不会有什么输出。并且continue智能作用于循环结构，继续循环。
				System.out.println("x="+x);
				continue;
			}
		}
	}
}
