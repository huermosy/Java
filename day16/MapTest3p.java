/*
��ϰ��      ��ȡ���ַ����и�����ĸ���ֵĴ�����
ϣ����ӡ�Ľ��Ϊ��   a(4) b(2) c(5)....    �Դ�����

ͨ��������Է���ÿ����ĸ����һ����Ӧ�Ĵ�����
˵����ĸ�����֮�������һһ��Ӧ��ӳ���ϵ��

������ǿ���ʹ��map���ϡ�
Ϊʲôʹ��map���ϣ�
������֮�������ӳ���ϵʱ���Ϳ���ʹ��map���ϡ�

˼·��
1.���ַ���ת��Ϊ�ַ����飬��ΪҪ��ÿһ����ĸ���в�����   toCharArray()  �����ַ���ת��Ϊһ���µ��ַ����顣 

2.����һ��map���ϣ���Ϊ��ӡ�������ĸ��������ʹ��treemap����

3.�������顣   �൱��py�е��Ǹ�˼·
	��get���������мӼ��õ���Ӧ��ֵ���������ֵΪ�յĻ����Խ��в�����
4.��map���ݱ��ָ�����ַ�����ӡ��������ȴ�ӡһ��map���ϼ��ɡ�

���Ƕ�Ӧ����ĸ��ֵʱ���ֵĴ���

 


*/
import java.util.*;

class  MapTest3p
{
	public static void main(String[] args) 
	{
		System.out.println(toArray("dfefagduoahuermosy"));
//		toArray("dfefagduoahuermosy");
	}

	public static String toArray(String str)
	{
		char[] chs = str.toCharArray();          // ��һ���ַ���ת��Ϊ����to
		TreeMap<Character, Integer> t1 = new TreeMap<Character, Integer>();  
		// �������涨��Ķ��ǻ����������͵������������ͣ�����Ӧ���ҵ������������͵İ�װ��
		int count = 0;
		for(int x = 0; x<chs.length; x++ )
		{
			// ��������һ���Ľ���ֻͳ����ĸ
			if(!(chs[x]>'a'&&chs[x]<='z')||(chs[x]>'A'&&chs[x]<='Z'))
				continue;
			Integer values = t1.get(chs[x]);  // �õ���Ӧ��ֵ
			if(values!=null)
				count = values;
			count++;
			t1.put(chs[x],count);
			count = 0;
			// ��Ϊ������put�Ƚ��ظ���������һ���Ƿ���Ը���һ��
			/*
			if(values==null)
			{
				t1.put(chs[x],1);
			}
			else
			{
				values++;
				t1.put(chs[x],values);
			}
			*/
		}
//		System.out.println(t1);
//		return null;

		StringBuilder sb = new StringBuilder();

		Set<Map.Entry<Character, Integer>> entryset = t1.entrySet(); 

		Iterator<Map.Entry<Character, Integer>> m1 = entryset.iterator();
		while(m1.hasNext())
		{
			Map.Entry<Character, Integer> it = m1.next();
			Character key = it.getKey();
			Integer values = it.getValue();
			sb.append(key+"("+values+")");
		}
		// ��һ���������洢��ʽ�����ĸ�ʽ
		return sb.toString();
 	}
}