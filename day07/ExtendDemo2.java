/*
子父类中变量的特点 第86讲
了解super 这个用父类的变量名的方法  还有this
如这个例子，一般的话，如果成员变量不是私有的话，this指的是对本类成员变量的引用；
如果要对父类成员变量的引用的话，那么要将num改为 super.num 这样的话指的是用父类的变量。
*/
class Fu
{
	int num = 3;
}

class Zi extends Fu
{
	private int num = 4;
	void show()
	{
		System.out.println(num);   // 现在这个num是this.num
	}
}


class  ExtendDemo2
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
	}
}
