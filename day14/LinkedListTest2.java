/*���Ͽ��(ArrayList)��ϰ2
����������в��ظ���Ԫ�أ��������µ��б�֮��
�õ��ķ�����contians()   hasNext()    next
����ı��˼·��ͨ�������۲��Ԫ���Ƿ��Ѿ��������µ�����֮���ˣ����û�а�������������룬����еĻ��ͼ���ѭ��ֱ��ѭ�����  ������Iterator��hasNext()   next()����

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
			Object obj = it.next();   // ������Ϊ����洢
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
