/*
IO����ByteArrayStream��   ���������
��Ϊ���������󶼲��������飬��û��ʹ��ϵͳ����Դ��
���ԣ����ý���close�ر� ,��������಻���׳�IO�쳣��

������������ʱ�Ľ���ʱ��
Դ�豸��
	���̣�System.in   Ӳ�̣�FileStream    �ڴ棺ArrayStream
Ŀ���豸��
	����̨�� System.out  Ӳ�̣� FileStream  �ڴ�:ArrayStream
�����Ķ�д˼������������
*/

import java.io.*;
class  ByteArrayStreamDemo
{
	public static void main(String[] args) 
	{
		ByteArrayInputStream fi = new ByteArrayInputStream("guagngagn".getBytes());
		ByteArrayOutputStream fo = new ByteArrayOutputStream();

		int by = 0;
		while((by = fi.read())!=-1)
		{
			fo.write(by);
		}
		System.out.println(fo.size());
		System.out.println(fo.toString());
 	}
}