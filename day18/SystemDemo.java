/*
System:���еķ��������Զ��Ǿ�̬�ġ�
out����׼�����Ĭ���ǿ���̨
in����׼���룬Ĭ���Ǽ���

����ϵͳһЩ��Ϣ��
��ȡϵͳ������Ϣ��Properties getProperties();
*/

import java.util.*;
class  SystemDemo
{
	public static void main(String[] args) 
	{
		Properties pro = System.getProperties();
		// ��ΪProperties��Hashtable�����࣬Ҳ����Map���ϵ�һ���������
		// ��ô����ͨ��map�ķ���ȡ���ü����е�Ԫ�ء�
		// �ü����д洢�Ķ����ַ���û�з��Ͷ���
		
 
		
		// �����ϵͳ���Զ�һЩ���е���Ϣ�أ�
		System.setProperty("hu","chenxi");
		// ��ȡָ��������Ϣ
		String s1 = System.getProperty("user.home");
		System.out.println(s1);

		// �ܷ���jvm������ʱ�򣬶�̬����һЩ������Ϣ
		String s2 = System.getProperty("zhang");
		System.out.println(s2);
 
		//��ȡ����������Ϣ
		/*
		for(Object obj:pro.keySet())          // ʹ����ǿ��forȡ��
		{
			String value = (String)pro.get(obj);          // ����һ��ǿת
			System.out.println(obj+"::"+value);
		}
		*/
	}
}
