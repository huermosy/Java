/*
����ת����  Collections �еķ���   toArray
Object[] toArray() 
����һ�����飬����������б��е�����Ԫ�����ʵ���˳�򣨴ӵ�һ�������һ��Ԫ�أ���  
<T> T[] toArray(T[] a) 
����һ�����飬����������б��е�����Ԫ�����ʵ���˳�򣨴ӵ�һ�����һ��Ԫ�أ����������������ʱ������ָ�������������ʱ���͡�  

�������е�Ԫ��תΪ�����õ���Collections�������е�toArray������
�������ĳ��ȹ�С���ͻᴴ���µ�����洢;��֮������´���������ĳ��ȹ�����ôʣ��������λ�þͻ���null�����䡣
���ԣ���õķ������Ǵ���һ�����ô�С������ռ����洢��
*/

import java.util.*;

class  CollectionToArray
{
	public static void main(String[] args) 
	{
		List<String> ls = new ArrayList<String>();

		ls.add("datouwa");
		ls.add("gaugnguagn");
		ls.add("xixi");
		ls.add("dd");

		// ��ʼ�������е�Ԫ��תΪ����
		String[] arr = ls.toArray(new String[ls.size()]);
		System.out.println(Arrays.toString(arr));
 	}
}
