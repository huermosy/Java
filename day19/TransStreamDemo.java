/*
IO ������ȡת������
����¼���read���������ֽ���InputStream�ķ�����
�ܷ��ֽ���ת�����ַ�����Ȼ��ʹ���ַ�����readLine�����أ�
ͨ������API  ���ǿ�����һ����InputStreamReader    ͨ�������ܹ���Ч�ؽ��ֽ�ת�����ַ�

����¼�������д��������ʹ��OutputStreamWriter ��һ���࣬ͨ���������Բ���System.out.println������������
���ַ���ת�����ֽ�����


 
*/

import java.io.*;
class  TransStreamDemo
{
	public static void main(String[] args) throws IOException
	{
//		System.out.println("Hello World!");
//		InputStream f = System.in;    // �ȴ�����¼��
		// ���ֽ������ַ�����ת��
//		InputStreamReader fr = new InputStreamReader(f);
		// ��һ����������������ٶ�,BufferedReader����һ��ʹ��Ĭ�ϴ�С�������Ļ����ַ���������
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));   // �������仰ƴ��һ�仰

//		OutputStream fw = System.out; // ����̨���
//		OutputStreamWriter fw1 =new OutputStreamWriter(fw);
		// ����һ�����弼���� �ܹ�ʹ�û����������з���
		BufferedWriter sb1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("new.txt")));   // Ҳ��һ��һ����

		String len = null;
		while((len = sb.readLine())!=null)
		{
			if("over".equals(len))
				break;
//			System.out.println(len.toUpperCase());
			sb1.write(len.toUpperCase());
			sb1.newLine();
			sb1.flush();
		}
	}
}
