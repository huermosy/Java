/*
��ӡ��
IO����printWriter��
PrintWriter���ַ����� ��OutputStream�е�һ������
������ǿ�Ĺ��ܣ�println�������������ֱ�ӽ���������ԭ����ӡ��ȥ

���캯�����Խ��ܵĲ�������.
1. file����File
2. �ַ���·����String
3. �ֽ��������OutputStream
4. �ַ�������� Writer

���ע�ͣ�
���ֽ�������ʽ�����ļ��������û������ķ�ʽ���Ч�ʡ�
����һ����������õ���OutputStream�����࣬PrintWriter
Ȼ����readLine()�������������ļ�����println(���Բ�һ��API��������)����������ļ�����
�ǵù��������쳣��
*/
import java.io.*;

class  PrintWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter fw = new PrintWriter(new FileWriter("a.txt"),true);
		String line = null;
		while((line = fr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			fw.println(line.toUpperCase());
		}
		fr.close();
		fw.close();
	}
}