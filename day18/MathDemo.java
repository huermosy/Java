// ��һ����ϰ������һ��С����������С���ĺ���λ
// ��������Math �� Random��
/*
ceil���ش���ָ�����ݵ���С����
floor����С��ָ�����ݵ��������
round ��������
pow ���˷�����
random �����
Random ��  �����
*/
import java.util.*;
class  MathDemo
{
	public static void main(String[] args) 
	{
		double d1 = Math.ceil(16.34);
		double d2 = Math.floor(16.34);
		double d3 = Math.round(17.22);
		double d4 = Math.pow(3,4);
		double d5 = Math.random()*10;
		sop("ceil:"+d1);
		sop("floor:"+d2);
		sop("round:"+d3);
		sop("pow:"+d4);
		sop("random:"+d5);
//		System.out.println("Hello World!");
		// �½�һ��Random������
		Random r = new Random();
		for(int x = 0; x<10; x++)
		{
			int d = r.nextInt(10)+1;      // ��һ���������
			sop(d);
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
