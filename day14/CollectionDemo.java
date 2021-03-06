/*
集合框架(共性方法)的流程：
1.导包。
2.创建一个集合容器，使用collection接口的子类，ArrayList
3.在这里做一下添加、获取及和长度，删除，判断，取交集的步骤

集合中存放的不是对象的实体，而是地址(或者说是引用)。
add方法接收的数据类型是Object，以便接收任意类型的数据对象。

用迭代器获取集合中的元素。   Iterator  自己查一下API手册了解  

Iterator可以认为是一个取出娃娃机的夹子。
不同容器虽然数据结构不同，但是都有共同的取出方式，这里将这个取出方式定义为一个内部类，也就是Iterator类，通过操作它可以从不同的容器中取出元素。
*/
import java.util.*;

class  CollectionDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void method_basic1()
	{
		ArrayList al = new ArrayList();   // 相当于创建一个容器。
		// 1.这是第一个 添加
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		ArrayList a2 = new ArrayList();   // 相当于创建另一个容器。
		// 1.这是第一个 添加
		a2.add("java09");
		a2.add("java02");
		a2.add("java03");
		a2.add("java06");


		sop("原集合al:"+al);
		// 2.这是第二个 获取长度
		sop("length"+al.size());
		// 3.删除元素
		al.remove("java03");
//		al.clear();
		sop("改变后的集合:"+al);
		// 4.判断元素是否在集合中
		sop("元素是否在集合中:"+al.contains("java03"));
		// 5.判断交集
		a2.retainAll(al);
		sop("交集为："+a2);

	}

	public static void method_basic2()
	{
		ArrayList al = new ArrayList();   // 相当于创建一个容器。
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		sop("原集合al:"+al);
		// 用迭代器获取元素
		/*   国人的写法
		Iterator ele = al.iterator();
		
		while(ele.hasNext())
			sop("element:"+ele.next());
		*/
		for(Iterator ele = al.iterator(); ele.hasNext();)   // 老外的写法，因为他们认为将ele这个对象写在for循环里更加节省内存空间，毕竟for创建的都是临时变量。
		{
			sop("element:"+ele.next());
		}
	}


	public static void main(String[] args) 
	{
		method_basic2();	 
 	}
}
