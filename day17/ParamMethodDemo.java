/*
集合（可变参数）  创建一个数组，扔进show方法中可以进一步进行操作

JDK1.5后面出现的新特性   可变参数     基本数据类型... 变量名    用三个点来表示     不用new数组传，直接传需要的参数
可变参数和python中的可变参数类似，python中是  *参数名       一般可变参数写在最后面，而必要的参数是写在前面
*/

class  ParamMethodDemo
{
	public static void main(String[] args) 
	{
		/*
		int[] arr1 = {1,2,3};
		show(arr1);
		*/
		show("huermosy",1,2,3);       // 这种的定义方式就相当于普通的定义方式。
 	}

	public static void show(String s,int... arr)
	{
		System.out.println(arr.length);
	}
}
