/*
作者：huermosy
需求：定义人这个类，并且做相应的开发。
之所以对外提供访问方式，就是因为在访问方式中可以加入逻辑判断等语句，对访问的数据进行操作，提高代码的健壮性。
*/
class Person 
{
	 private int age;   // 如果仅仅是用私有变量定义，那么初始默认值为0
	// 一个成员变量一般有两个方法，分别为设置和获取
	 public  void SetAge(int a)        // 设置成员变量的值；
	{
		if(a >0 && a <120)
		{
			age = a;
		}
		else
			System.out.println("Wrong!");
	}

	 public int GetAge()        // 获取成员变量的值
	{
		return age; 
	}


	 void speak()
	{
		System.out.println("Person's age:"+age); 
	}
}

class PersonDemo
{
	public static void main(String[] args)     // 定义主函数的入口
	{
	Person p = new Person();
	p.SetAge(28);
	p.speak();
	}
}
