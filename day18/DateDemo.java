// ��������Date)

import java.util.*;
import java.text.*;
class  DateDemo
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);
		// ��ӡ��ʱ�俴������ϣ����Щ��ʽ��
		SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");

		// ��ģʽ��װ��SimpleDateFormat�����С�
		String str = s.format(d);
		// ����format������ģʽ��ʽ��ָ��Date�����С�
		System.out.println("time:"+str);
 	}
}
