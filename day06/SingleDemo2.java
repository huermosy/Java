/* ������󣬵������ģʽ
java��� ����ʽ������ʽ  �����ǽ��뷽�����ĳ�ʼֵ��һ��
*/
/*      ���Ƕ���ʽ��ֱ�ӳ�ʼ������
class Single
{
	// �������ߣ����캯��˽�л����������Ȼ���Ǵ���һ�������еķ�����
	private Single(){}
	private static Single s = new Single();    // ���һ�¶����ʵ�����͹��캯���йء�
	public static Single getInstance()
	{
		return s;
	}


}
*/
// ��������ʽ���ڹ��췽���г�ʼ������ �����ӳټ��ص����ԣ� ֻ���ڵ��÷�����ʱ�� ��������s�����Ž���ֵַ���� ���ڴ��еı�����
class Single
{
	private Single(){}
	private static Single s = null;
	public static Single getInstance()     // ������ʽ�п��Լ���synchronized�ؼ��� �� ����һ��ͬ���Ĺؼ��֣�ֻ����һ���߳�ִ����Ϻ���һ���߳�ͨ�����ŵķ�ʽ��ѯ�ʵ�ǰ�Ƿ�Ϊ�գ�����ǿյĻ�ִ�С����Ǵ���Ч�ʽϵ͵�����
	{
		if(s==null)
		{
			s = new Student();
		}
		return s;
	}
}

class  SingleDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
