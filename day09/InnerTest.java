class InnerTest  // Object是所有类的上帝， 用匿名对象类做
{
	/*
	static class Inner
	{
		public void function()
		{}
	}
	*/

	public static void main(String[] args)
	{
		//new Inner().function();
		//采用匿名对象类的方法
		new Object()
		{
			public void function()
			{}
		}.function();
	}
}