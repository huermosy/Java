/*
IO�������������������͵�������DataStream��
�������ͨ��������ص�API֪�� DataInputStream��DataOutputStream������Ĺ���
����ע���õ�DataInputStream  ��ȡ�ķ�����ʱ��һ��Ҫ����˳���ȡ
*/
import java.io.*;
class DataStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
//		writeData();
//		ReadData();
		WriteUTFData();
		ReadUtfData();
 	}

	public static void ReadData() throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("dataStream.txt"));

		int number = dis.readInt();
		boolean bl = dis.readBoolean();
		double d = dis.readDouble();
		System.out.println("number:"+number);
		System.out.println("boolean:"+bl);
		System.out.println("double:"+d);
		dis.close();
	}

	public static void WriteData() throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataStream.txt"));

		dos.writeInt(222);
		dos.writeBoolean(true);
		dos.writeDouble(12312.4213);

		dos.close();
	}

	public static void WriteUTFData() throws IOException
	{
		DataOutputStream dos1 = new DataOutputStream(new FileOutputStream("UTf.txt"));

		dos1.writeUTF("���!");
		dos1.close();
	}

	public static void ReadUtfData() throws IOException
	{
		DataInputStream dos2 = new DataInputStream(new FileInputStream("UTf.txt"));
		
		String s = dos2.readUTF();
		System.out.println(s);
		dos2.close();
	}
}