/*
IO�� RandomAccessFile   
���಻������IO��ϵ������
����ֱ�Ӽ̳�Object.


RandomAccessFile(File file, String mode) 
����һ����������ļ�����������д������ File����ָ�����ļ��� 
����mode�м��ַ���������api��һ��mode������  r��rw
r��ֱ�Ӷ�ȡ�����û���ļ����׳��쳣
rwֱ�Ӷ�ȡ�����û���ļ������׳��쳣�����һᴴ�����ļ���

��������IO���еĳ�Ա����Ϊ�߱�����д�Ĺ��ܡ�
������ʵ��֧�ֶ������ȡ�ļ��Ķ���д��һ�������ȡ�ļ�����Ϊ��һ����������ֽڴ洢���ļ�ϵͳ�С�
��һ�ֹ�꣬���������������飬��Ϊ�ļ�ָ�룻���������ȡ�ֽڿ�ʼ���ļ�ָ�룬���ƽ��ļ�ָ���ȥ���ֽڶ���
��������ȡ�ļ��Ǵ����ڶ�/дģʽ����ô�������Ҳ���ã�
�������д�ֽڿ�ʼ���ļ�ָ�룬���ƽ��ļ�ָ���ȥ���ֽ�д�ġ�
д���ȥ����������ĵ�ǰ��������������������鱻��չ��
�ļ�ָ������� getFilePointer������ȡ�����õ�seek������


�����ļ���Ȼ��д���ļ��ĸ�ʽ��Ȼ����ú���   �ǵù���
*/

import java.io.*;

class  RandAccessFileDemo
{
	public static void main(String[] args) throws IOException
	{ 
//		writeFile_1();
		readFile();
 	}

	public static void writeFile() throws IOException
	{
		RandomAccessFile r = new RandomAccessFile("bmw.txt", "rw");

		r.write("����".getBytes());
		r.writeInt(28);
		r.write("����".getBytes());
		r.writeInt(33);

		r.close();
	}

	public static void writeFile_1() throws IOException
	{
		RandomAccessFile r = new RandomAccessFile("bmw.txt", "rw");
		r.seek(8*3);
		r.write("����".getBytes());
		r.writeInt(66);

		r.close();
	}

	public static void readFile() throws IOException
	{
		RandomAccessFile f = new RandomAccessFile("bmw.txt", "r");
		
		f.seek(8);  // ����ָ��ָ�� ����������ָ�����ֽ���   skipBytes()
		// ����һ���ֽ����飬�����ֽ����飬 �½�buf�ַ�������   ��ȡ�����е�����  ����
		byte[] bt = new byte[4];
		f.read(bt);         // ����Ϣ����bt��
		String name = new String(bt);
		int age = f.readInt();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);

		f.close();
	}
}
