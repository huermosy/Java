/*
���һ����ͨ��һ���ʵ������ԣ����ı������������utf-8�ı�����ɵġ�
�۲������ֲ����Ķ���������u8һ��
��������ô򿪵ķ����Ļ���Ӧ����ǰ����������ģ�����򿪵Ļ��ᰴ��u8���б����������Ĵ���
*/


class  EncodeDemo2
{
	public static void main(String[] args) 
	{
		String s = "��ͨ";
		// ��sת�����ֽ�����
		byte[] bt = s.getBytes();
		for(byte b:bt)
		{
			System.out.println(Integer.toBinaryString(b&255));     // �۲������ֲ����Ķ���������u8һ��
		}
 	}
}
