/*
Set<Map.Entry<k,v>> EntrySet
���˼·���ڵ�һ����
	ת��ΪEntry�������ƻ���ļ���
�ڶ������������еĶ������б仯


*/
import java.util.*;

class MapDemo2 
{
	public static void main(String[] args) 
	{
		Map<String,String> m1 = new HashMap<String,String>();
		m1.put("06","zhangsan06");
		m1.put("01","zhangsan01");
		m1.put("03","zhangsan03");
		m1.put("04","zhangsan04");
		// ��һ����������entrySet() ����תΪ��Ӧ����Entry�������ƻ���һ��ļ��ϡ�
		Set<Map.Entry<String,String>> entryset = m1.entrySet();
		// �ڶ���������set���ϾͿ����õ�����������ȡ����
		Iterator<Map.Entry<String,String>> doubleset = entryset.iterator();
		
		// �����������˻�ȡ���ĵ��������Ϳ���ͨ��map��get�������Ѽ���Ӧ��ֵ��map��ȡ������
		while(doubleset.hasNext())
		{
			Map.Entry<String,String> m2 = doubleset.next();
			String key= m2.getKey();
			String value= m2.getValue();
			System.out.println("key:"+key+","+"value:"+value);
		}
	}
}