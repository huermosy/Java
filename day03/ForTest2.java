/*
作者：huermosy
需求：1.获取1~10的和，并且打印
2. 1~100之间， 7的倍数的个数，并且打印
*/
class ForTest2 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int count = 0;
		for(int x=1; x<11; x++)
		{
			sum += x;
		}
		System.out.println(sum);
 
		for(int x=1; x<101; x++)
		{
			if(x%7 == 0)
			{
				count ++;
			}
		}
		
		System.out.println(count);
		System.out.println("Hello World!");
	}
}
