/*
注意这是一个思想，不能具体运行。
需求：数据库的操作。 
数据是：用户信息
1.连接数据库。 JDBC    Hibernate
2. 操作数据库。
增删改添  c create  r read u update  d delete
3.关闭数据库连接
*/

interface UserInfoDao
{
	public void add();
	public void delete();
}

class UserInfoJDBC implements UserInfoDao
{
	public void add(User user)      // 用户类 用户对象
	{
		1.连接数据库。 JDBC    Hibernate
		2.使用sql添加语句添加数据
		  增删改添  c create  r read u update  d delete
		3.关闭连接
	}

	public void delete(User user)
	{
		1.连接数据库。 JDBC    Hibernate
		2.使用sql添加语句添加数据
		  增删改添  c create  r read u update  d delete
		3.关闭连接
	}
}

class UserInfoHibernate implements UserInfoDao
{
	public void add(User user)      // 用户类 用户对象
	{
		1.连接数据库。   Hibernate
		2.使用sql添加语句添加数据
		  增删改添  c create  r read u update  d delete
		3.关闭连接
	}

	public void delete(User user)
	{
		1.连接数据库。 JDBC    Hibernate
		2.使用sql添加语句添加数据
		  增删改添  c create  r read u update  d delete
		3.关闭连接
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
