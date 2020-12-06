/*
Map��չ֪ʶ
map���ϱ�ʹ������Ϊ�߱���չ��ϵ

"yureban"   "01"  "zhangsan"
"yureban"  "02"  "lisi"

�����ı�Ϊѧ������ ��������û�ж�Ӧ��ӳ���ϵ
"yureban"  Student("01"  "zhangsan");
"yureban"  Student("02"  "lisi");

��ʱ�õ�Ӧ����List�б����ͻ���Set���͡�   ��Χ��һ��ӳ�䣬С��Χ��һ��list

"jiuyeban"  "01"   "wangwu"
"jiuyeban"  "02"   "zhaoliu"
*/

import java.util.*;

class Student
{
	private String age;
	private String name;
	Student(String name, String age)
	{
		this.age = age;
		this.name = name;
	}
/*
	public String getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}
*/
	public String toString()
	{
		return name+":"+age;
	}
}

class MapDemo3 
{
	public static void main(String[] args) 
	{
		// ���������Ӽ��ϣ���Ӧ����������������;���String���ͣ�Ȼ���ٴ���һ���󼯺ϣ��������ͷֱ���String���Ӽ���
		/*
		HashMap<String,String> yure = new HashMap<String,String>();
		HashMap<String,String> jiuye = new HashMap<String,String>();
		*/
		List<Student> yure = new ArrayList<Student>();
		List<Student> jiuye = new ArrayList<Student>();

		yure.add(new Student("zhangsan", "11"));
		yure.add(new Student("Lisi", "21"));
		jiuye.add(new Student("Wanger", "13"));
		jiuye.add(new Student("zhaoliu", "41"));

/*
		yure.put("zhangsan", "01");
		yure.put("lisi", "02");
		jiuye.put("wangwu","01");
		jiuye.put("zhaoliu", "02");
*/
		HashMap<String, List<Student>> czbk = new HashMap<String, List<Student>>();
		
		// ��Ӧ��Map��ֵ
		czbk.put("yure", yure);
		czbk.put("jiuye", jiuye);
		//Key_value_show(yure);
		//Key_value_show(jiuye);
		// ����czbk���ϣ���ȡ���еĽ��ң����Ҵ�ӡ���е�ѧ������,������������ڴ�Ȧ��СȦ
		
		Iterator<String> k1 = czbk.keySet().iterator();
		while(k1.hasNext())
		{
			String id = k1.next();
			List<Student> out = czbk.get(id);
			System.out.println(id);
			ListShow(out);
			//Key_value_show(out);

		}
		

 	}

	// ����һ����������ʾ�б��еĸ���Ԫ��

	public static void ListShow(List<Student> s)
	{
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Student s1 = (Student)it.next();
			System.out.println(s1);
		}
	}


	// ����һ����������ʾ�Ӽ����еļ�ֵ���õ���������
	public static void Key_value_show(HashMap<String,String> has)
	{
		
	
		// ����set���ϲſ����õ�����ȡ��
		// ��ȡ���е�keySet�������õ�����ȡ��
 		Iterator<String> keys = has.keySet().iterator();
		while(keys.hasNext())
		{
			String id = keys.next();
			String values = has.get(id); 
			System.out.println(id +":"+ values );
		}
	}
}