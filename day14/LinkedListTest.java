/*
根据上节的内容，就是LinkedList所提供的各种方法来做一下练习。

集合框架（LinkedList练习）
用LinkedList这个类做一下 堆栈 队列 数据结构的东西

堆栈：先进后出。
队列：先进先出   First in First out    (FIFO)

这个例子中，用类来封装做？  
为什么要封装呢？ 因为搞开发的时候自己定义方法，然后自己较熟悉这个东西到底是什么，是谁做的。
*/

import java.util.*;

class Queue
{
	//Object obj = new Object();

	private LinkedList li;  // 这是一个私有类。
	Queue()     // 构造函数初始化, 这里可能忘记了，需要再稍微补习一下。
	{
		li = new LinkedList();    // 这是一开始就有的东西，  就是将对应的对象创建成一个LinkedList  对应的流程：1.首先通过Queue list = new Queue(); 搞出一个list 2.一进入构造函数，就需要new一个LinkedList
	}

	public void hu_add(String s)   // 也可以是Object obj  这样的数据类型，因为字符串就是特殊的对象类。
	{
		li.addFirst(s);        // 直接增加对象的引用。
	}

	public Object hu_remove()        // 返回值为字符串类型的对象
	{
		return li.removeLast();        // 如果是堆栈的话就是 removeFirst()这一个方法。
	}

	public boolean is_null()
	{
		return li.isEmpty();
	}

	public static void sop(Object obj)          // 也可以是String s这样的数据类型
	{
		System.out.println(obj);
	}
}

class LinkedListTest
{
	public static void main(String[] args) 
	{
		Queue list = new Queue();
		list.hu_add("java01");
		list.hu_add("java02");
		list.hu_add("java03");
		list.hu_add("java04");
		
		while(!list.is_null())
		{
			list.sop(list.hu_remove()+" 出队了");
		}

//		System.out.println("Hello World!");
	}
}
