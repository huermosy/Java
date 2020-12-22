// IO����LineNumberReader������BUfferedReader�е����࣬���ܸ�ǿ  ����APIȻ�����������кŵ��������ȡ��  
// ��һ��С��ϰ�� ģ��һ�����кŵĻ���������
/*
int getLineNumber() 
��ȡ��ǰ��������  

void setLineNumber(int lineNumber) 
���õ�ǰ������  

int getLineNumber() 
��ȡ��ǰ��������  
*/
import java.io.*;
class  LineNumberReaderDemo
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		try
		{
			LineNumberReader lin = new LineNumberReader(new FileReader("CopyText.java"));
			String num = null;
			lin.setLineNumber(100);    // ����ʼλ������Ϊ��100�п�ʼ��
			while((num = lin.readLine())!=null)
			{

 				System.out.println(lin.getLineNumber()+"::"+num);
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

		finally
		{
			try
			{
				fr.close();	
			}
			catch (IOException e1)
			{
				System.out.println(e1.toString());
			}
		}
//		System.out.println("Hello World!");
	}
}