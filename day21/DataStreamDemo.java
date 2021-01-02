/*
IO流（操作基本数据类型的流对象DataStream）
编程需求：通过查阅相关的API知道 DataInputStream和DataOutputStream两个类的功能
并且注意用到DataInputStream  读取的方法的时候，一定要按照顺序读取
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

		dos1.writeUTF("你好!");
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
