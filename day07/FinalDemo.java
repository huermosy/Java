/*
����һ�¹ؼ��� final��
1. final ����ؼ����ܹ������ࡢ����������
2. ��final������ʱ����ô��Ϊ����಻������Ϊ���࣬��������̳С�
3. ����final���η�����ʱ�򣬲����������ڽ��и�д�� һ����и�д�Ǿ���������֮��
4. ��final���γ�Ա����ʱ�������Ը�ֵһ�Σ�Ȼ��Ͳ����Խ����޸ġ�
	����������ʱ��һЩ���ݵĳ����ǹ̶��ģ�Ϊ�����ӳ���Ŀ��Ķ��ԣ�һ����һ�����������洢

5. ��������֪�����У��ڲ��ඨ���ھֲ�λ����ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�������
*/
class Demo      //  ��finial��������
{
	int x = 3;
	public static final double PI = 3.1415926;     // ������Ȩ�޵������
	void show()
	{
		System.out.println("Բ����Ϊ��" + PI);
	}

}

class subDemo extends Demo
{	
	void show1()
	{
		super.show();   // ���super��ʹ�ú��������ļ̳�, ����final���θ��෽���󣬻��ǿ��Լ̳и���ķ����ġ�
	}
	void show()     // �ڸ�������final���κ� �����Ը�д
	{
		System.out.println(PI);
	}
}


class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		subDemo s = new subDemo();
		s.show();
	}
}