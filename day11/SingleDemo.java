/*
���߳�-�������ģʽ-����ʽ

ʲô�ǵ������ģʽ�� һ���ౣֻ֤��һ��ʵ��; �����ķ�����Ϊ����ʽ������ʽ��
����ʽ�� �ȰѶ���new����ʵ����;
����ʽ�� �Ѷ���ָΪ�գ�Ȼ�󾭹��ж��Ƿ�Ϊ����new��������ʱ���ص����ԡ�

����ʽ��
class Single
{
private static final Single s = new Single();
private Single(){}
private void getSingle()
{
	return s;
}
}

������дһ������ʽ��
��Ϊ����ʽ�е��鷳�����Ը㿪����ʱ��һ���ö���ʽ�� ����������Ŀ��ʱ��������ʽ�ࡣ
�ʳ��������⣺����ʽ�Ͷ���ʽ��ʲô��ͬ������ʽ����ʲô���⣿����ʽ��ͬ����ʱ��ʹ�õ�������һ����
����ʽ������ʱ���ص����ԡ�����ʽ��˫�ط񶨵ĸ�ʽ���Ч�ʡ� ʹ�õ����Ǹ����������ֽ����ļ�����
*/

class Single
{
	private  Single s = null;
	private Single(){}
	private synchronized void getSingle()    // ���ڿ������һ�����Ĺ�����   �ڶ��ν�����ʱ��Ͳ��ô����µĶ����ˡ�  ˫�ط񶨾����⣬���û�е�һ���񶨵Ļ���ÿ�ζ�Ҫ����
											// synchronize����ؼ������ж��Ƿ��ܽ��������ȽϺķ���Դ��������ǰ���һ��if����ٽ����жϡ�
	{
		if(s==null)        
			synchronized(Single.class)
			{
				if(s==null)
					s = new Single();
				return s;
			}
	}

}

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
