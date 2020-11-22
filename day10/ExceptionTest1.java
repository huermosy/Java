/*
��һ�������κ�Բ�Ρ� �����Ի�ȡ������������������ַǷ���ֵ����Ϊ�ǻ�ȡ����������⡣
����ͨ���쳣����ʾ��   ���ڶ����������л�����ơ�
���˼·������һ����ȡ����Ľӿڣ� ����һ��������ʵ������ӿ��࣬ ���������ж�Ӧ��˽�в��������캯���Լ���Ӧ�ĺ�����
*/

class NoValueException extends RuntimeException   // ����һ��������ࣨ�̳еĶ�����������Ҫ��try	catch��׽�����ǻ�ֱ��ֹͣ�������û���������ڵڼ���
{
	NoValueException(String msg) // ��Ӧ�Ĺ��캯��
	{
		super(msg);     // �̳���Exception����������еĶ���
	}
}

interface Shape
{
	void getArea();
}

class Rect implements Shape
{
	private int width, height;  // ���Ǿ��εĿ�͸ߣ��Ǿ���˽�е�����

	Rect(int width, int height)//throws NoValueException // ���εĹ��캯��
	{
		
		if(width<0 || height<0) 
		{
			throw new NoValueException("��Ⱥͳ���֮����һ��ֵ�����˸�����");  // ���ַǷ�ֵ����ʼ������ע���߼�����������ڲ������׵Ķ���������Ҫ�ں�����Ҳ��һ���׵Ķ�����
			//System.out.println("�������");
		}
		//else  ..  ��Ϊ����Ҫд������ʡ����
		
		this.width = width; 
		this.height = height;
	
	}

	public void getArea()
	{
		System.out.println("Area:"+(height*width));
	}

}

// Ȼ�����ǿ��԰������˼·дһ��Բ�ε��쳣�뱨��
class Circle implements Shape
{
	public final static double pi = 3.14; // Ȩ�޵������static����ȥ��ʾ���ݿ��Թ���
	private double radius;   // ����Բ�εİ뾶
	Circle(double radius)
	{
		if(radius<0)    // ������һ�����ܳ��ֵĴ���
		{
			throw new NoValueException("����뾶�Ƿ�");   // ���Ǻ����ڲ���һ����
		}
		this.radius = radius;
	}

	public void getArea()   // ע��Ҫ���ǳ���ӿ��еķ�����
	{
		System.out.println("circle's Area:"+(pi*radius*radius));
	}

}






class ExceptionTest1 
{
	public static void main(String[] args) 
	{
			Rect s = new Rect(3,5);     // ����new�Ժ�Ķ�����Ҫ�����캯�����洫�Ķ��� ��
		/*����������һ���쳣��������Rect()�д��������������쳣�ˡ�����ķ���:
		1. �ڹ��캯���мӶ�Ӧ�������жϣ����ַ�������ǰѧ�ģ��е��ʱ�ˣ������д���������Ϊ0���������if̫��Ļ��������Ƚ϶࣬�ܷ���
		2.��try catch ���д��� ��ֻҪ���ִ������ֱ�������쳣����
		*/
			s.getArea();    // ���ε������

			Circle s1 = new Circle(3);

			s1.getArea();   // Բ�����
		 
		//	System.out.println("�д���");
	 
		 
			System.out.println("over!");
	}
}
