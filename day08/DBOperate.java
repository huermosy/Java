/*
ע������һ��˼�룬���ܾ������С�
�������ݿ�Ĳ����� 
�����ǣ��û���Ϣ
1.�������ݿ⡣ JDBC    Hibernate
2. �������ݿ⡣
��ɾ����  c create  r read u update  d delete
3.�ر����ݿ�����
*/

interface UserInfoDao
{
	public void add();
	public void delete();
}

class UserInfoJDBC implements UserInfoDao
{
	public void add(User user)      // �û��� �û�����
	{
		1.�������ݿ⡣ JDBC    Hibernate
		2.ʹ��sql�������������
		  ��ɾ����  c create  r read u update  d delete
		3.�ر�����
	}

	public void delete(User user)
	{
		1.�������ݿ⡣ JDBC    Hibernate
		2.ʹ��sql�������������
		  ��ɾ����  c create  r read u update  d delete
		3.�ر�����
	}
}

class UserInfoHibernate implements UserInfoDao
{
	public void add(User user)      // �û��� �û�����
	{
		1.�������ݿ⡣   Hibernate
		2.ʹ��sql�������������
		  ��ɾ����  c create  r read u update  d delete
		3.�ر�����
	}

	public void delete(User user)
	{
		1.�������ݿ⡣ JDBC    Hibernate
		2.ʹ��sql�������������
		  ��ɾ����  c create  r read u update  d delete
		3.�ر�����
	}
}


class  DBOperate
{
	public static void main(String[] args) 
	{
		UserInfoJDBC ui = new UserInfoJDBC();
		ui.add(user);
		ui.delete(user);
		System.out.println("Hello World!");
	}
}
