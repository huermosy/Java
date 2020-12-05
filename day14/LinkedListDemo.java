/*
��API����һ�¡�����
���� 
LinkedList: ���з���
����
addFirst(E e) 
�ڴ��б��Ŀ�ʼ������ָ����Ԫ�ء� 
addLast(E e) 
��ָ����Ԫ���б��Ľ����� 

��ȡ
getFirst() 
���ش��б��еĵ�һ��Ԫ�ء� 
getLast() 
���ش��б��е����һ��Ԫ�ء� 

�Ƴ�
 removeFirst() 
�Ƴ������ش��б��еĵ�һ��Ԫ�ء� 
 removeLast() 
�Ƴ������ش��б��е����һ��Ԫ�ء� 

��JDK1.6�г��������������

����
offerFirst(E e) 
���б���ǰ�����ָ����Ԫ�ء�  
offerLast(E e) 
���б��Ľ�β����ָ����Ԫ�ء� 

��ȡ
peekFirst() 
����������ɾ�����б��ĵ�һ��Ԫ�أ��򷵻� null�������б��ǿյġ� 
 
E peekLast() 
����������ɾ�����б������һ��Ԫ�أ��򷵻� null�������б��ǿյġ�  


�Ƴ�
pollFirst() 
�������Ƴ����б��ĵ�һ��Ԫ�أ��򷵻� null�������б��ǿյġ� 
 
E pollLast() 
�������Ƴ����б������һ��Ԫ�أ��򷵻� null�������б��ǿյġ�  

*/
import java.util.*;

class  LinkedListDemo
{

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		// 1.����
		ls.offerFirst("java01");
		ls.offerFirst("java02");
		ls.offerFirst("java03");
		ls.offerFirst("java04");
		// 2.��ȡԪ�أ�����Ԫ�ز���ɾ��
 
		sop(ls.peekFirst());   // ÿ�ζ��ǵ�һ��Ԫ��
//			sop(ls.peekLast());
		//3.��ȡԪ�ص���Ԫ�ر�ɾ����
//		for(int x=0; x<ls.size(); x++)
//			sop(ls.pollFirst());
		while(!ls.isEmpty())
			sop("ɾ��Ԫ�أ�"+ls.pollLast());    
		sop("���飺"+ls);
		
		
	}


}