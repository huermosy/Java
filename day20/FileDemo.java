/*
IO����  File����
separator ��һ����ƽ̨�ķָ���
File �ೣ���ķ�����
1.������ 
	boolean createNewFile(): ��ָ��λ�ô����ļ���������ļ��Ѿ����ڣ��򲻴���������false��
			���������һ�����������һ���������ļ��������ļ��Ѿ����ڣ��Ḳ�ǡ�
2.ɾ����
	boolean delete():ɾ��ʧ�ܷ���false
	void deleteOnExit():�ڳ����˳���ʱ��ɾ��ָ�����ļ�
3.�ж�
	ѧϰ�˼�������
	boolean exists() �ļ��Ƿ����
	isHidden()   �����ļ��Ƿ����
	isDirectory()
	isFile
	isAbsolute() �Ƿ��Ǿ���·����
	makdir()    ��ס�������ֻ�ܴ���һ���ļ���
4.��ȡ��Ϣ��
	getName():
	getPath():
	getparent():
	getAbsolutePath():
	lastModified():
	length():
	renameTo:�������ļ��ĳ���·�����ǡ� ��ʵ�ֵĹ��ܾ����Ǽ���һ��
*/
import java.io.*;
import java.util.*;
class FileDemo 
{
	public static void main(String[] args) throws IOException
	{
//		method2();
//		method3();
		method5();
	}
	public static void method5()
	{
		File f1 = new File("CopyPic.java");
//		f1.createNewFile();
		File f2 = new File("ff3.txt");
		sop(f1.getName());
		sop(f1.getPath());
		sop(f1.length());
		sop("rename:"+f1.renameTo(f2));
	}
	public static void method4() // throws IOException
	{
		File f = new File("t1.txt");
		//f.createNewFile();
		f.mkdir();
		sop("f1_exist:"+f.exists());
		sop("f1_abs:"+f.isAbsolute());
		
		sop("f1_file:"+f.isFile());
		sop("f1_dictory:"+f.isDirectory());
	}
	//	��Ӧfile�ĸ�����һ����
	public static void method1()
	{
		File f1 = new File("a.txt");

		File f2 = new File("c://abc","b.txt");

		File d = new File("c://abc");

		File f3 = new File(d,"c.txt");

		File f4 = new File("d:"+File.separator+"Learning materials"+File.separator+"java"+File.separator+"java_"+File.separator+"java20");
//		System.out.println("Hello World!");
		sop("f1"+f1);
		sop("f2"+f2);
		sop("f3"+f3);
		sop("f4"+f4);
	}

	// ��ӦIO����file�����ɾ���봴����һ���֣�
	public static void method2() throws IOException
	{
		File f1 = new File("a4.txt");
		sop("File:"+f1.createNewFile());
		sop("File:"+f1.createNewFile());
	}

	public static void method3() throws IOException
	{
		File f2 = new File("a4.txt");
		f2.deleteOnExit();
 
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
