// 语句嵌套形式。其实就是语句之中还有语句。
// 循环嵌套。
class ForForDemo 
{
	public static void main(String[] args) 
	{
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				System.out.print("*");
			}
			System.out.println();    // 只有一个功能就是换行
		}
		System.out.println("------------------");
		 
	// 打印需要的图形
	/*  尖尖角是向下的趋势
	*****
	****
	***
	**
	*
	*/
		for(int x=0; x<5 ; x++ )
		{
			for(int y=x; y<5; y++)
			{
				System.out.print("*");
			}
			System.out.println();    // 这个功能就是一个换行
			 
		}
		System.out.println("------------------");
	/*  尖尖角是朝上的趋势
	* 
	** 
	***
	*****
	*****
	*/
		for(int x=0; x<5 ; x++ )
		{
			for(int y=0; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println();    // 这个功能就是一个换行
			 
		}
		System.out.println("------------------");
	/*
	不是规律的规律：
	尖朝上，可以改变条件。让条件随着外循环变化。
	尖朝下，可以改变初始化值，让初始化值随着外循环变化
	*/
	/*
	1
	12
	123
	1234
	12345
	*/
		for(int x=1; x<=5 ; x++ )
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y);
			}
			System.out.println();    // 这个功能就是一个换行
		}
		System.out.println("------------------");
		/*打印9*9乘法表
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
		*/
		for(int x=1; x<=9 ; x++ )
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+ x*y+'\t');
			}
				System.out.println();
		}
	}
}
