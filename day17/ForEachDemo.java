/*
����(��ǿforѭ��)
��һ�ָ߼������ķ���     for(��������  ���������������ĵļ���(Collection)��������)
���ָ߼����������ײ���õ��ǵ������ı�������

��һ����ArrayList������
�Լ��Ͻ��б�����
ֻ�ܻ�ȡ����Ԫ�أ����ǲ��ܶԼ��Ͻ��в�����

���������˱����������Խ���remove������Ԫ�صĶ�����
�������ListIterator���������ڱ��������н�����ɾ�Ĳ�Ķ�����

����һ��Hashmap<>   �ֱ���keySet()��entrySet()�ķ�������ȡ��
*/
// ˼·������һ�����飬Ȼ���ø߼������������������

import java.util.*;
class ForEachDemo 
{
	public static void main(String[] args) 
	{
		// 1.��һ��Ҫ������
		ArrayList<String> s = new ArrayList<String>();    // ����һ���б����͵�����

		s.add("xixi");
		s.add("haha");
		s.add("hehe");
		s.add("dada");
		for(String str:s)
		{
			sop(str);
		}
		// 2.�ڶ���Ҫ������,��һ�ַ�����ֱ�Ӽ���ȡ��
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(1,"hu");
		m1.put(2,"er");
		m1.put(3,"mo");

		Set<Integer> keyset = m1.keySet();   // ��ȡ���еļ�,����ֵΪһ��set����
		for(Integer key:keyset)          //   ��set������ȡ������
		{
			sop(key+":"+m1.get(key));
		}

		Set<Map.Entry<Integer, String>> entryset = m1.entrySet();    // ����һ��map��Ӧ��ӳ����ͼ��Ҳ���Ƕ�Ӧ�ļ��ϡ�
		for(Map.Entry<Integer, String> ent: entryset)      // Ҳ�����������һ����Map.Entry<Integer, String> entryset = m1.entrySet())���������е�һ�Գɶ�ȡ�������һ������С���ϲ�����
		{
			sop(ent.getKey()+":"+ent.getValue());
		}


//		System.out.println("Hello World!");
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
