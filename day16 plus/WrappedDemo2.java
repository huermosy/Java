// �Զ�װ�����Զ�����
class WrappedDemo2 
{
	public static void main(String[] args) 
	{
		// �Զ�װ�䣬����д  
		Integer i = 44;    // i = new Integer(44);
		// �Զ�����
		i = i+3;         // i = new Integer(i.valueOf()+3)
//		Integer i1= myadd(i);

		System.out.println(i);
		// ���Զ�װ�������������byte��Χ������ʱ��ָ��ͬһ������

		Integer a = new Integer(127);
		Integer b = new Integer(127);

		System.out.println(a == b);
		System.out.println(a.equals(b));

		Integer c = 127;
		Integer d = 127;

		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
}
