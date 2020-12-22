/*
����(Arrays)
�������õķ����� asList
asList(T... a) 
������ָ������֧�ֵ�һ���̶���С���б��� 

toString(int[] a)     ֱ���þͲ��ö���һ������Ȼ��ת����ô�鷳�Ĳ�����
����ָ����������ݵ��ַ�����ʾ��ʽ�� 

��������List������ʲô�ô��� �������ü��ϵ�˼���뷽�����������飬
����ע��һ�㣺���ܶԼ����е�Ԫ����ɾ����Ϊ����ĳ����ǹ̶��ġ�����ᷢ����Exception in thread "main" java.lang.UnsupportedOperationException ��һ�������ķ�ʽ�� 
����:contains, get ,indexOf, subList();

��������е�Ԫ�ض��Ƕ�����ô��ɼ��ϵ�ʱ�򣬸������е�Ԫ�ؾ�ֱ�ӱ���˼����е�Ԫ�ء�
��������е�Ԫ�ض��ǻ����������ͣ���ô��ɼ��ϵ�ʱ�򣬸����鱾���ͻ��ɼ����е�Ԫ��
*/

import java.util.*;

class ArraysDemo 
{


	public static void main(String[] args) 
	{
		String[] str = {"a","bf","ed","fa"};
		List<String> s1 = Arrays.asList(str);
		sop(s1);
//		s1.add("guangguagn");
		sop("bf:"+s1.subList(1,3));
		int[] arr1 = {1,4,9,2};
		Integer[] arr1 = {1,4,9,2};     // �����������ͷ�װ���װ�ɶ���
		sop(arr1);
		List<Integer> list1 = Arrays.asList(arr1);
		sop(list1);
//		System.out.println("Hello World!");

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}