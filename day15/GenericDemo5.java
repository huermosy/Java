// 泛型定义在接口上
interface Inter<T>
{
	void show(T t);
}

class Interle <T> implements Inter <T>
{
	public void show(T t) // 重写接口的show方法
	{
		System.out.println("show"+t);
	}
}


class GenericDemo5 
{
	public static void main(String[] args) 
	{
		Interle<String> s = new Interle<String>();
		s.show("haha");
//		System.out.println("Hello World!");
	}
}
