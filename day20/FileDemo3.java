// IO流（列出目录下所有内容）  递归
/*
这里我们用递归的方法来打印出目录中还有的目录。

递归就是调用函数自身。
1.递归要注意限定条件。
2.递归要注意递归的次数，避免栈溢出。

练习1：1.递归运算：10进制转换成二进制。

练习2：数的1+到n的相加
*/


import java.io.*;

class FileDemo3 
{
	public static void main(String[] args) 
	{
/*		System.out.println("Hello World!");
		File dir = new File("D:\\Learning materials\\java\\java_");
		show(dir);
*/
//		toBin(10);
//		System.out.println(sum(100));
		File dir = new File("D:\\Learning materials\\java\\java_");
		show(dir,0);
	}

//   练习1： 这一个是转化成二进制的程序，如果不懂的话可以画一下结构流图。
	public static void toBin(int number)
	{
		if(number>0)
		{
			toBin(number/2);
			System.out.println(number%2);
 		}
	}

// 练习2： 数字的和，从1加到n
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return sum(n-1)+n;
	}

	public static String getlevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("|--");
		for(int x = 0; x<level; x++)
		{
			sb.insert(0, "|  ");
		}
		return sb.toString();
	}

	public static void show(File dir, int level)
	{
 		File[] arr = dir.listFiles();
		
		level++;
		// 搞一下两种for循环打印出文件名称
		/*
		for(int x=0; x<arr.length; x++)
		{
			System.out.println(arr[x]);
		}
		*/
		for(File name:arr)
		{
			System.out.println(getlevel(level)+name);
			if(name.isDirectory())
				show(name,level);
			else
				System.out.println(getlevel(level)+name);
		}
	}
}
