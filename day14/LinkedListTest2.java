/*集合框架(ArrayList)练习2
需求：输出其中不重复的元素，并存在新的列表之中
用到的方法：contians()   hasNext()    next
整体的编程思路：通过迭代观察该元素是否已经包含在新的容器之中了，如果没有包含，则让其加入，如果有的话就继续循环直到循环完成  迭代器Iterator的hasNext()   next()方法

*/
class  LinkedListTest2
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("java01");
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");
		newa1 = SingleList(a1);
		sop("newa1"+newa1);
//		System.out.println("Hello World!");
	}

	public static ArrayList  SingleList(ArrayList a1)
	{
		ArrayList newa1 = new ArrayList();
		Iterator it = a1.iterator();
		while(!it.hasNext())
		{
			Object obj = it.next();   // 将其作为对象存储
			if(!newa1.contains(obj))
			{
				newa1.add(obj);
			}
		}
		return newa1;
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
		
		
	}
}
