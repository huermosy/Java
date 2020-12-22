// ͨ������������һ��java�ļ�

// 
import java.io.*;

class  CopyText2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader fr = null;
		BufferedWriter fw = null;         // ������������
 		try
		{
			fr = new BufferedReader(new FileReader("BufferedReadDemo.java"));
			fw = new BufferedWriter(new FileWriter("BufferedCopy.txt"));
			String len = null;
			while((len = fr.readLine())!=null)
			{
				fw.write(len);
				fw.newLine();         // ����
				fw.flush();      // ˢ��
			}
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		// װ����������
		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}

			try
			{
				if(fr!=null)
				{
					fr.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
 	}
}
