/*
�滻��תAPI����ϰ
����һ�¼����е�fill��replaceAll��reverse��ЩAPI��
Collections reverseOrder
Collections-SynList  ������ѧ������Collections�������API �ֱ���swap��shuffle

*/

import java.util.*;
class  CollectionsDemo2
{
	public static void main(String[] args) 
	{
		reDemo();
	}
// ��ϰ����fill���ܴӻ������е�Ԫ�ر�Ϊ��Ϊָ��λ�õ�Ԫ�ء�
	public static void fillDemo()
	{
		List<String> s = new ArrayList<String>(); 
		s.add("a");
		s.add("huermosy");
		s.add("zwa");
		s.add("a");
		s.add("liuneng");

		sop(s);
		Collections.fill(s,"go_out");
		
		sop(s);
 	}
	public static void reDemo()
	{
		List<String> s = new ArrayList<String>(); 
		s.add("a");
		s.add("huermosy");
		s.add("zwa");
		s.add("a");
		s.add("liuneng");

		sop(s);
//		Collections.replaceAll(s,"a","xixi");
//		Collections.reverse(s);
//		Collections.swap(s,1,2);
		Collections.shuffle(s);
		sop(s);
 	}


	public static void sop(Object obj)    // ��Ϊ�����һ��List�е����ݣ�����String���͵��������ͻᱨ����  ��Object����ϵ���û�д��ģ�ֻ����ȱ���ǲ���ʹ�����еķ��� �����Դ���List<String>����������͡�
	{
		System.out.println(obj);
	} 
}