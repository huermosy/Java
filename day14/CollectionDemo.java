/*
���Ͽ��(���Է���)�����̣�
1.������
2.����һ������������ʹ��collection�ӿڵ����࣬ArrayList
3.��������һ�����ӡ���ȡ���ͳ��ȣ�ɾ�����жϣ�ȡ�����Ĳ���

�����д�ŵĲ��Ƕ����ʵ�壬���ǵ�ַ(����˵������)��
add�������յ�����������Object���Ա�����������͵����ݶ���

�õ�������ȡ�����е�Ԫ�ء�   Iterator  �Լ���һ��API�ֲ��˽�  

Iterator������Ϊ��һ��ȡ�����޻��ļ��ӡ�
��ͬ������Ȼ���ݽṹ��ͬ�����Ƕ��й�ͬ��ȡ����ʽ�����ｫ���ȡ����ʽ����Ϊһ���ڲ��࣬Ҳ����Iterator�࣬ͨ�����������ԴӲ�ͬ��������ȡ��Ԫ�ء�
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
		ArrayList al = new ArrayList();   // �൱�ڴ���һ��������
		// 1.���ǵ�һ�� ����
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		ArrayList a2 = new ArrayList();   // �൱�ڴ�����һ��������
		// 1.���ǵ�һ�� ����
		a2.add("java09");
		a2.add("java02");
		a2.add("java03");
		a2.add("java06");


		sop("ԭ����al:"+al);
		// 2.���ǵڶ��� ��ȡ����
		sop("length"+al.size());
		// 3.ɾ��Ԫ��
		al.remove("java03");
//		al.clear();
		sop("�ı��ļ���:"+al);
		// 4.�ж�Ԫ���Ƿ��ڼ�����
		sop("Ԫ���Ƿ��ڼ�����:"+al.contains("java03"));
		// 5.�жϽ���
		a2.retainAll(al);
		sop("����Ϊ��"+a2);

	}

	public static void method_basic2()
	{
		ArrayList al = new ArrayList();   // �൱�ڴ���һ��������
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		sop("ԭ����al:"+al);
		// �õ�������ȡԪ��
		/*   ���˵�д��
		Iterator ele = al.iterator();
		
		while(ele.hasNext())
			sop("element:"+ele.next());
		*/
		for(Iterator ele = al.iterator(); ele.hasNext();)   // �����д������Ϊ������Ϊ��ele�������д��forѭ������ӽ�ʡ�ڴ�ռ䣬�Ͼ�for�����Ķ�����ʱ������
		{
			sop("element:"+ele.next());
		}
	}


	public static void main(String[] args) 
	{
		method_basic2();	 
 	}
}