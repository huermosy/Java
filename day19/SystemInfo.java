/*
IO����ϵͳ��Ϣ��      ��������ʱ����Ϣ
list(PrintWriter out) 
���������б���ӡ��ָ����������С� 
*/
import java.util.*;
import java.io.*;
import java.text.*;

class SystemInfo 
{
	public static void main(String[] args) throws IOException   // ��Ϊ�漰��
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String s = sdf.format(d);
		Properties prop = System.getProperties();
		PrintStream p = new PrintStream("SystemInfo.txt");
		p.println(s);
		System.setOut(p);
		prop.list(System.out);

//		System.out.println("Hello World!");
	}
}