/*IO������������л�����ObjectInputStream��ObjectOutputStream ������
���˼·���ֱ��ò��������ַ�����д��һ���ļ��Ͷ�ȡһ���ļ���
���Ҽǵù�����
*/
import java.io.*;

class  ObjectStreamDemo
{
	public static void main(String[] args) throws Exception
	{
//		writeFile();
		readFile();
 	}
	
	public static void readFile() throws Exception
	{
		ObjectInputStream fr = new ObjectInputStream(new FileInputStream("t11.txt"));
		Person p = (Person)fr.readObject();
		System.out.println(p);
		fr.close();
	}

	public static void writeFile() throws Exception
	{
		ObjectOutputStream fw = new ObjectOutputStream(new FileOutputStream("t11.txt"));
		fw.writeObject(new Person("guangguang",33));
		fw.close();
	}
}