/*
���Ϲ����ࣺCollections
���󣺶��б��е��ַ���Ԫ����һ����Ȼ�����һ����������

��������Collections-binarySearch��ʹ�ã��Լ�дһ������һ�����ܵķ���
*/

import java.util.*;
class  CollectionsDemo
{
	public static void main(String[] args) 
	{
		maxDemo();
	}

	public static void maxDemo()
	{
		List<String> s = new ArrayList<String>(); 
		s.add("a");
		s.add("huermosy");
		s.add("zwa");
		s.add("a");
		s.add("liuneng");

//		sop(s);
		Collections.sort(s, new StrLenCompare());   // ����Collections����������
		sop(s);
//		Collections.sort(s, new StrLenCompare());   // ����Collections����������,   ��������API���Կ������ǻ�����ͨ���ڶ�����������һ���Ƚ�����ʵ���Զ��������
//		String max = Collections.max(s, new StrLenCompare());      // ����ַ���֮��Ԫ�ص���Ȼ˳�����ֵ�ͳ��ȵ����ֵ��
//		int index = Collections.binarySearch(s,"huermosy");     // ����ָ���Ĳ����λ�á�
//		sop(max);
		int index = HalfSort(s, "bc", new StrLenCompare());
		sop(index);
 	}

	public static void sop(Object obj)    // ��Ϊ�����һ��List�е����ݣ�����String���͵��������ͻᱨ��  ��Object����ϵ���û�д�ģ�ֻ����ȱ���ǲ���ʹ�����еķ��� �����Դ���List<String>����������͡�
	{
		System.out.println(obj);
	} 
	// ����һ���Ƚ��� ʵ��implements   comparator

	// ����һ���۰�����ķ�����Ҳ����binarySearch��ԭ��
	public static int HalfSort(List<String> s2, String key, Comparator<String> cmp)
	{
		int min,mid,max;
		min = 0;
		max = s2.size()-1;        //  List�������õ�size�� �����õ���length
		while(min<=max)      // ���min����max������ѭ����
		{	
			mid = (max + min)>>1;
			String var = s2.get(mid);     // ����������λ�õõ�Ԫ��
			// �ַ������԰�����Ȼ˳��Ƚ�
			int num = cmp.compare(var,key);
			if(num<0)
			{
				min = mid + 1;
			}
			else if(num>0)
			{
				max = mid - 1;
			}	
			else
			{
				return mid;
			}
		}
		return min;      // �������û�гɹ��򷵻���Сֵ������ֵ��
	}
}



class StrLenCompare implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		else if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}