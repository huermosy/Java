/*
������BufferedReader���е����з���readLine()ԭ���
�����Զ���һ�����а�����һ�����ܺ�readLineһ�µķ�����
��ģ��һ��BufferedReader
*/
import java.io.*;

class MyBufferedReader extends Reader      // �Լ�����İ�װ���Ǽ̳���Reader�࣬MyBufferedReader��һ��װ���࣬���Խ��й�����ǿ; Read�Ļ����Զ�һ�������װ�Ρ�
{
	private Reader f;   // ˽�л�������һ���ı�����
	MyBufferedReader(Reader f)    // ���캯���ĳ�ʼ���� 
	{
		this.f = f;
	}

	public String MyreadLine() throws IOException
	{
		// ����һ������������ʾ StringBuilder ��һ������
		StringBuilder b = new StringBuilder();
		int num = 0;
		while((num = f.read())!=-1)
		{
			if(num == '\n')
			{
				return b.toString();
			}
			else if(num == '\r')
			{
				continue;
			}
			else
			{
				b.append((char)num);    // ��Ҫ��һ��ǿת
			}
		}
		// ����һ��������������һ�еĶ���û�лس���������
		if(b.length()!=0)
			return b.toString();      // ��ô�Ϳ��Խ��ַ������ء�
		return null;
	}

	public void Myclose() throws IOException
	{
		f.close();
	}

	// ���ǵ�Reader�еĳ��󷽷���
	public void close() throws IOException
	{
		f.close();
	}

	public int read(char[] cbuf, int off, int len)  throws IOException
	{
		return f.read(cbuf, off,len);
	}
}



class  MyBufferedReaderDemo
{
	public static void main(String[] args)  throws IOException
	{
		FileReader f = new FileReader("test.txt");
		MyBufferedReader  b = new MyBufferedReader(f);
		String len = null;
		while((len = b.MyreadLine())!=null)
		{
			System.out.println(len);
		}
		b.Myclose();
 	}
}
