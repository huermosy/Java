class InnerTest  // Object����������ϵۣ� ��������������
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
		//��������������ķ���
		new Object()
		{
			public void function()
			{}
		}.function();
	}
}