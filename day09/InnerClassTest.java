/*
Inner

��������ڲ������ϰ���Ĳ�̫�ã������ٳ���
*/

interface Inter   // ����һ��������
{
	void method();
}

class Test
{
	// ��һ�ַ��������������ķ�����ֱ���õ����ڲ���
	/*
	static class Inner implements Inter
	{
		public void method()     // ���������ж��巽����Ȩ��Ҫ���ڸ���
		{
			System.out.print("method run");
		}
	}
	*/
	static Inter function()
	{
	/*
	{
		return new Inner();
	}
	*/
		//�ڶ��ַ���  ������룬ͨ�������ڲ��ࡣ
	 
		return new Inter()
		{
			public void method()
			{
				System.out.print("method run");
			}
		};
	}
 
}

class  InnerClassTest
{
	public static void main(String[] args) 
	{
		Test.function().method();      // ֻ��Inter����ܵ���method����  �����ﲻ̫�� ���һ��

		/*
		Inter in = Test.function;
		in.method();
		*/
	}
}
