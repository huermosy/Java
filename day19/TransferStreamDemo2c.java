/*
   I/O�����ı��׼��������豸��
   �õ���System.setIn  ��System.setOut   ����������
*/
import java.io.*;
class  TransferStreamDemo2c
{
	public static void main(String[] args) throws IOException
	{
		System.setIn(new FileInputStream("ReadIn.java"));
		System.setOut(new PrintStream("xixi.txt"));
		// ���̵ĳ���д����
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter fw =new BufferedWriter(new OutputStreamWriter(System.out));  // Ĭ����ʽΪGBK
		String line = null;
		while((line = fr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			fw.write(line);
			fw.newLine();
			fw.flush();
		}
		fr.close();
		fw.close();
  	}
}
