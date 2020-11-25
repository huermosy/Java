/*
�����ĵĻ�����һ�飺����Exception����д���ϵ�Object�еģ�����һ��A�쳣��̳�Exception��һ��B�쳣��̳���A�쳣������һ��C�쳣�̳�Exception��
����һ�����࣬�����쳣�е�show�����׳���A�쳣����;����һ�����࣬�������̳�������࣬��д���е�show�������������ܹ��̳�˭��

�ó��Ľ��ۣ�1.�������ķ����׳��쳣����ô��������̳и���ķ���Ҳ�׳��쳣��ʱ��ֻ���׳����쳣�ĸ��������Ӧ������
2. ��������׳����Ƕ��쳣����ô���า����������ʱ��ֻ���׳����������Ӽ�
3. ���������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ��Ƿ���ʱ��Ҳ�������׳��쳣��
	������෢�����쳣���������׳�������Ӧ����try catch�����
*/


/*
�����쳣�Ĳ㼶��ϵΪ��
Exception-->
			AException-->
						BException->>
			CException-->
*/
class AException extends Exception
{
}

class BException extends AException
{
}

class CException
{
}

// ����һ��Test�� Ȼ����ø�����һ��
class Test
{
	void function(Fu f)
	{
		try
		{
			f.show();
		}
		catch (AException a)
		{
		}
	}
}

class Fu 
{
	void show() throws AException // �׳�A�쳣
	{
		System.out.println("�������У�");
	}
}

class Zi extends Fu
{
	void show()    //throws CException  // �����׳�һ��BException,    ��������Լ�������һ��c�쳣���������Լ�����
	{
		try
		{
		System.out.println("��������!");
		}
		catch(Exception e)     // ע�����е�������ʽ��
		{
		}
	}
}


class ExceptionDemo7 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Test t = new Test();
		t.function(new Zi());         // Ҳ�����ö�̬�ķ��� new Zi();  �൱��  Fu f = new Zi();
	}
}