/* ���Ͽ��:���͵ĸ���
��̵Ĳ��裺1.���Ȱѻ����ĸ�ã����Ǵ����ô����ģ���ӡ�ô�ӡ�ġ���������ArrayList�д�ŵĶ������ַ���,���Ҵ�ӡ�����Ӧ�ĳ���
2.�����б������м���һ���������;ͻᱨ��Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String����������ʱ�ڵĳ���
3.�������ǰ��������϶�Ӧ�ķ��ͣ�����ͻ��Ϊ����ʱ�ڵı���
4.������ĵط���������ɾ����

�ô���1.������ʱ��ClassCastException����ת�Ƶ��˱���ʱ�ڣ������ڳ���Ա������⣬������ʱ�ڵ�������٣����Ӱ�ȫ��
2.������ǿ��ת�����鷳��
*/
import java.util.*;

class  GenericDemo
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
		ArrayList<String> ls = new ArrayList<String>();

		ls.add("huermosy");
		ls.add("zhangzuguang");
		ls.add("qinneng");
		ls.add("nizhao");
//		ls.add(4);

		Iterator<String> it = ls.iterator();  // ����������; ��Ϊ�������еķ��������Ѿ������String���ͣ�����ǿת���԰��ұߵ�String��ʡ��
		while(it.hasNext())
		{
			String s1 = it.next();   //��object��������ת��ΪString����Ϊobjectû��length()������
			System.out.println(s1+"="+s1.length());
		}
	}
}
