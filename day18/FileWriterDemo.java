/*
��ѧϰһ���ַ������ص㣺
��ȻIO�����ڲ������� ����ô���ݵ����������ʽΪ���ļ���
���Բ����ļ�������Ҫ����ʾ��

������Ӳ���ϣ�����һ���ļ���д��һЩ�ļ�����

�ҵ�ת�����ڲ����Ƚ���Writer�������FileWriter  ��׺��Ϊ���࣬ǰ׺��Ϊ��Ӧ�Ĺ���

*/

import java.io.*;    // ��io���е�FileWriter�ർ��

class  FileWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		// ����һ��FileWriter����
		FileWriter f = new FileWriter("demo.txt");    // ����һ���࣬�й��췽���Ϳ��Դ�����
		// ����write���������ַ���д�뵽����
		f.write("zhenggege");
		// ˢ�¶����л����е�����
		f.flush();

		f.write("���һ��close��������Ƿ���ˢ�µ����á�");
		// close�����ر�����Դ�������ڹر�����Դ֮ǰ���ǻ�ˢ��һ�»���������flush�������ǣ�flushˢ��֮������Դ�����ܼ���ʹ�ã���closeˢ��֮��Ͳ��ܹ�ʹ�á�
		f.close();
//		f.write("haha");
//		System.out.println("Hello World!");
	}
}
