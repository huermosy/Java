/*
IO流（管道流）

PipedOutputStream
PipedInputStream
编程思路： 
创建两个类：一个是Read类，一个是Write类，分别实现Runnable
Reader类
私有化输入管道流，Read 构造方法初始化，
重写run方法，不能用throws抛出的方式，只能用try...catch的方式创建读入的文件，并且记得关流。

Write类
私有化输出管道流，Write 构造方法初始化
重写run方法，并且用write的方法写入对应的字节流   记得关流

主函数
创建两个in和out类，然后用in连接out   .connect()方法 连接的方法一共有两种：一种是connect方法，另一种是直接扔进构造函数
两个类名的实例化
分别启动两个线程 new Thread(实例化的类名).start()
*/

import java.io.*;

 

class Read implements Runnable
{
	private PipedInputStream r;
	Read(PipedInputStream r)
	{
		this.r = r;
	}
	public void run()
	{
		try
		{
			 
			byte[] bt = new byte[1024];
			System.out.println("准备读数据，阻塞状态准备进入。");
 			int len = r.read(bt);
			System.out.println("读到数据，阻塞结束");
			String s = new String(bt,0,len);
			System.out.println(s);
			r.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("管道流输入失败");
		}
		 
	}
}



class Write implements Runnable
{
	private PipedOutputStream w;
	Write(PipedOutputStream w)
	{
		this.w = w;
	}
	public void run()
	{
		try
		{
			System.out.println("开始写入数据，等待6s后");
			Thread.sleep(6000);
			w.write("good luck to you".getBytes());
			w.close();
		}
		catch(Exception e)
		{
			throw new RuntimeException("管道流输出失败");
		}
	}
}
class  PipedStreamDemo 
	{
		public static void main(String[] args) throws IOException
		{
			PipedInputStream ri = new PipedInputStream();
			PipedOutputStream wi = new PipedOutputStream();
			ri.connect(wi);
			Read r1 = new Read(ri);
			Write w1 = new Write(wi);
			new Thread(r1).start();
			new Thread(w1).start();
		}
	}


