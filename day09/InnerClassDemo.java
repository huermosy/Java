/*
�������� Ƕ�׹���
���ʵĹ���1.�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��;
	������Ϊʡ����һ���ⲿ������ã� ��ʽΪ   �ⲿ����.this

2.�ⲿ����Ҫ�����ڲ����еĳ�Ա�����뽨��һ���ڲ���Ķ��󣻵�Ȼ����ѧ����һ��Ƕ�׷����Ľ���������ʵķ�ʽ

���ʸ�ʽ��
1. �ⲿ������ڲ���ĸ�ʽ  new �ⲿ����.�ڲ���������.��Ӧ�ķ�����();

2.�ڲ����������Ա�����
�磺private     static
���ڲ������о�̬��Ա����ô��������Ǿ�̬��


*/
class Outsider      // ����һ���ⲿ�����ķ���
{
	private static int x=3;

	 class Inner        // ����һ���ڲ����� ;  ��̬�ڲ���
	{
		int x = 6;
		public void function()
		{
			int  x = 4;
			System.out.println("Inner:"+ Outsider.this.x);    //   ����ʡ����һ��Outersider.this
		}
	}

	public  void method()
	{
		Inner n = new Inner();
		n.function();
	}

	public void show()
	{
		System.out.println("Outsider");
	}
}



class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		Outsider o = new Outsider();
		o.method();

		//new Outsider.Inner().function();
		//System.out.println("Hello World!");

		// ����ֱ�ӷ����ڲ���Ա�ĸ�ʽ����Ȼһ�㲻���ã�ͨ�����������������ʽ
		//Outsider.Inner i = new Outsider().new Inner();
		//i.function();
	}
}