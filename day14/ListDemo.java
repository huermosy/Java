/*
���Ͽ��(List���Ϲ��Է���)
Collection
	|--List: Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü���������
		|--ArrayList  �ײ����ݽṹ������ṹ���ص㣺��ѯ�ٶȽϿ죬��ɾ�ٶȽ������̲߳�ͬ��
		|--LinkList		�ײ����ݽṹ���������ݽṹ�� �ص㣺��ѯ�ٶȽ�������ɾ�ٶȽϿ졣
		|--Vector		   �ײ����ݽṹ���������ݽṹ�� �ص㣺ʲô�������� �߳�ͬ��
	|--Set��Ԫ��������ģ�Ԫ�ز������ظ���
List��
	���з��������ǿ��Բ����Ǳ�ķ������Ǹ��б������з�����
��
	add(index,element)
	add(index,Collection)
ɾ
	remove(index)
��
	set(index,element)
��
	get(index);
	subList(begin,end)
	ListIterator();    ������

indexOf 
subList

��Iterator��ListIterator(��Iterator���ӽӿ�)�������ݵĲ���
���У������Iterator���в����ᷢ����������Ϊ�ڵ���ʱ������ͨ���������϶�������������
�����ı�������Ϊ��Exception in thread "main" java.util.ConcurrentModificationException
������ԭ�򣺵��������õ�����ʱ��ͬʱ���õ����ϵĹ���������Ԫ�صĻ����ܻ���ڰ�ȫ������


ֻ�õ������ķ������������ķ������٣���������һ��ListIterator�ӿ�����չ���ܡ�


���������ListIterator�����ͨ���������϶������Լ��Ͻ��в���
*/
import java.util.*;
class  ListDemo
{
	public static void method_2()
	{
		ArrayList al = new ArrayList();
		// ��   �����ַ�������
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		sop(al);
/*
		for(Iterator t1 = al.iterator(); t1.hasNext();)
		{
			Object obj = t1.next();
			if(obj.equals("java03"))
			{
				al.add("java04");      // �����ᱨ��,��Ϊ�Լ��Ϻ͵���һ�����
			}
			sop("obj:"+obj);
		}
		sop("al:"+al);
 
 */
//		sop("al:"+al);     
		ListIterator t1 = al.listIterator(); 
		while(t1.hasNext())
		{
			Object obj = t1.next();
			if(obj.equals("java03"))
				t1.add("java04");     // ����Ҫ�Զ������ý��в���
			//sop("obj:"+obj);
		}
		sop("al:"+al);
	}
 

	public static void method_1()
	{
		ArrayList al = new ArrayList();
		// ��   �����ַ�������
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		sop("ԭ����Ϊ��"+al);
		// ��2  ��ָ��λ�������ַ�������
		al.add(2,"java007");
		sop("�����ڶ������Ӻ�ļ��ϣ�"+al);

		// ɾ  ָ��λ�õ�ɾ��
		al.remove(2); 

		// ��  ͨ��������Ԫ��
		al.set(3,"java_end");

		// �� ͨ��get  ��ListIterator��ȡԪ�أ�ǰ���ǵ����������ǿ��Զ��
		sop(al.get(0));
		// �������д����һ��
		for(ListIterator t1 = al.listIterator(); t1.hasNext(); )
		{
			sop(t1.next());
		}
		// ��ȡ�ַ�����Ӧ������λ��
		sop("��Ԫ�ض�Ӧ������λ��Ϊ��"+al.indexOf("java_end"));
		// ��ȡ�Ӵ�
		List s1 = al.subList(1,4);
		sop("�Ӵ�s1Ϊ��"+s1);
	}


	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		method_2();
	}

}