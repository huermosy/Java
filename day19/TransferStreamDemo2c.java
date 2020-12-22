/*
   I/O流（改变标准输入输出设备）
   用到了System.setIn  和System.setOut   这两个方法
*/
import java.io.*;
class  TransferStreamDemo2c
{
	public static void main(String[] args) throws IOException
	{
		System.setIn(new FileInputStream("ReadIn.java"));
		System.setOut(new PrintStream("xixi.txt"));
		// 键盘的常见写法：
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter fw =new BufferedWriter(new OutputStreamWriter(System.out));  // 默认形式为GBK
		String line = null;
		while((line = fr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			fw.write(line);
			fw.newLine();
			fw.flush();
		}
		fr.close();
		fw.close();
  	}
}
