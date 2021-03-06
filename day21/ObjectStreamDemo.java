/*IO流（对象的序列化），ObjectInputStream与ObjectOutputStream 两个类
编程思路：分别用操作对象字符流来写入一个文件和读取一个文件。
并且记得关流。
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
