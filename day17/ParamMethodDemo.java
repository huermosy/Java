/*
���ϣ��ɱ������  ����һ�����飬�ӽ�show�����п��Խ�һ�����в���

JDK1.5������ֵ�������   �ɱ����     ������������... ������    ������������ʾ     ����new���鴫��ֱ�Ӵ���Ҫ�Ĳ���
�ɱ������python�еĿɱ�������ƣ�python����  *������       һ��ɱ����д������棬����Ҫ�Ĳ�����д��ǰ��
*/

class  ParamMethodDemo
{
	public static void main(String[] args) 
	{
		/*
		int[] arr1 = {1,2,3};
		show(arr1);
		*/
		show("huermosy",1,2,3);       // ���ֵĶ��巽ʽ���൱����ͨ�Ķ��巽ʽ��
 	}

	public static void show(String s,int... arr)
	{
		System.out.println(arr.length);
	}
}
