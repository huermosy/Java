/*
�ַ���ȡ��������
�û������ṩ��һ�ζ�ȡһ�еķ���readLine,�������ı����ݵĻ�ȡ��
������ֵΪnullʱ��˵���Ѿ��������ı���ĩβ
*/
import java.io.*;
class BufferedReadDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fw = new FileReader("test.txt");
		BufferedReader buff = new BufferedReader(fw);

		String s = null;
		while((s=buff.readLine())!=null)
		{
			System.out.println(s);	
		}
		buff.close();
//		System.out.println("Hello World!");
	}
}