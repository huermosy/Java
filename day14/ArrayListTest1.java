/*���Ͽ��(ArrayList)��ϰ2
����������в��ظ���Ԫ�أ��������µ��б�֮��
�õ��ķ�����contians()   hasNext()    next
����ı��˼·��ͨ�������۲��Ԫ���Ƿ��Ѿ��������µ�����֮���ˣ����û�а�������������룬����еĻ��ͼ���ѭ��ֱ��ѭ�����  ������Iterator��hasNext()   next()����


����⻹�кܴ������Լ�����˶���������
*/
import java.util.*;      
class  ArrayListTest1
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("java01");
		a.add("java02");
		a.add("java03");
		a.add("java04");
		a.add("java03");
		a.add("java03");
		sop(a);
		ArrayList newal = singleElement(a);
		sop("newa1"+newal);
//		System.out.println("Hello World!");
	}

	public static ArrayList singleElement(ArrayList a)
	{
		ArrayList newal = new ArrayList();
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();   // ������Ϊ����洢
			if(!newal.contains(obj))
			{
				newal.add(obj);
			}
		}
		return newal;
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
		
		
	}
}