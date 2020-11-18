/*
object:所有类直接或者间接父类，就是上帝
所有的子类都是Object的直接或者间接子类
*/
class Demo
{
	private int num;
	Demo(int num)     // 构造函数
	{
		this.num = num;
	}

	public boolean equals(Object obj)    // 这是一个多态， Object obj = new Demo();   这是对父类Object的重写。
	{
		if(!(obj instanceof Demo))
			return false;
		Demo d = (Demo) obj;       // 这是一个向下的强转
		return this.num == d.num;
	}

	public String toString()           // 重写在Object类中的toString方法
	{
		return "Demo"+num;
	}
}

class Person
{

}

 

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);                  // d1是object的间接或直接子类
		Demo d2 = new Demo(5);
		/*
		System.out.println(d1.equals(d2));      //  equals 方法是在父类 Object中
		System.out.println(d1==d2);             // 这里判断的是地址值
		System.out.println(d1.equals(d2));     
		*/
		System.out.println(d1.toString());
		//d1.toString();
	}
}
