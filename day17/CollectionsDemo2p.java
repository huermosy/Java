/*
Collections  reverseOrder ��һ��������
��treeset������ݽṹ����
Collections-SynList  ������ѧ������Collections�������API �ֱ���swap��shuffle
*/
import java.util.*;

class StrLencompartor implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		else if(s1.length()<s2.length())
			return -1;
		else
			return s1.compareTo(s2);
	}
}

class  CollectionsDemo2p
{
	public static void main(String[] args) 
	{
		OrderDemo();
 	}

	public static void OrderDemo()
	{
		TreeSet<String> s = new TreeSet<String>(Collections.reverseOrder()); 
		s.add("a");
		s.add("huermosy");
		s.add("zwa");
		s.add("a");
		s.add("liuneng");
		sop(s);
 		Iterator it = s.iterator();    // �õ�����ȡ��
		while(it.hasNext())
		{
			String st = (String)it.next();     // һ������ת�ͣ���Ϊsop�д������String����
			sop(st);
		}
	}

	public static void sop(Object str)    // ��Ϊ�����һ��List�е����ݣ�����String���͵��������ͻᱨ����  ��Object����ϵ���û�д��ģ�ֻ����ȱ���ǲ���ʹ�����еķ��� �����Դ���List<String>����������͡�
	{
		System.out.println(str);
	} 
}