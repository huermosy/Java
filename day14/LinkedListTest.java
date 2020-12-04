/*
�����Ͻڵ����ݣ�����LinkedList���ṩ�ĸ��ַ�������һ����ϰ��

���Ͽ�ܣ�LinkedList��ϰ��
��LinkedList�������һ�� ��ջ ���� ���ݽṹ�Ķ���

��ջ���Ƚ������
���У��Ƚ��ȳ�   First in First out    (FIFO)

��������У���������װ����  
ΪʲôҪ��װ�أ� ��Ϊ�㿪����ʱ���Լ����巽����Ȼ���Լ�����Ϥ�������������ʲô����˭���ġ�
*/

import java.util.*;

class Queue
{
	//Object obj = new Object();

	private LinkedList li;  // ����һ��˽���ࡣ
	Queue()     // ���캯����ʼ��, ������������ˣ���Ҫ����΢��ϰһ�¡�
	{
		li = new LinkedList();    // ����һ��ʼ���еĶ�����  ���ǽ���Ӧ�Ķ��󴴽���һ��LinkedList  ��Ӧ�����̣�1.����ͨ��Queue list = new Queue(); ���һ��list 2.һ���빹�캯��������Ҫnewһ��LinkedList
	}

	public void hu_add(String s)   // Ҳ������Object obj  �������������ͣ���Ϊ�ַ�����������Ķ����ࡣ
	{
		li.addFirst(s);        // ֱ�����Ӷ�������á�
	}

	public Object hu_remove()        // ����ֵΪ�ַ������͵Ķ���
	{
		return li.removeLast();        // ����Ƕ�ջ�Ļ����� removeFirst()��һ��������
	}

	public boolean is_null()
	{
		return li.isEmpty();
	}

	public static void sop(Object obj)          // Ҳ������String s��������������
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
			list.sop(list.hu_remove()+" ������");
		}

//		System.out.println("Hello World!");
	}
}
