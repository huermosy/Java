/*
�������ĳ�����Ϊ��̧�����Ĳ���Ч�ʶ����ֵ�
�����ڴ���������֮ǰ������Ҫ����������
�û������ṩ��һ����ƽ̨�Ļ��з�

�ѻ�������������Ϊһ��ƿ�ӣ� ���û��ƿ�ӣ����Ǻ�ˮ��Ч�ʻ���������������൱�ڸ��������Ч��ʹ�õĶ���

˼·������һ�������� Ȼ���ٴ���һ���������󣬽�������װ����������֮�С� Ȼ��ʹ�������ķ�������һЩ������д�룬ˢ�º͹ر�
*/

import java.io.*;
class  BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter fw1 = new BufferedWriter(fw);   // ��������װ������֮�С�

		for(int x = 0; x<8; x++)
		{
			fw1.write("abc"+x);
			fw1.newLine();
			fw1.flush();
		}
		fw1.close();
//		System.out.println("Hello World!");
	}
}
