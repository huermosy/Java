/*
���ߣ�huermosy
����1.��ȡ1~10�ĺͣ����Ҵ�ӡ
2. 1~100֮�䣬 7�ı����ĸ��������Ҵ�ӡ
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