/*
自定义字节流的缓冲区，read和write的特点，    明白一下这个创建的过程，需要数组、计数器与指针三个元素缺一不可。
因为byte是8位的，而int是32位的，直接将byte转为int强转的化，可能会使前面的位数补1，从而导致整个32位的int类型的值为-1，
所以应该&上一个int类型的255来完成最后8位的保留。

总结一下read和write的特点：
节流的读一个字节的read方法为什么返回值类型不是byte，而是int。
因为有可能会读到连续8个二进制1的情况，8个二进制1对应的十进制是-1；那么就会数据还没有读完，就结束的情况。因为我们判断读取结束是通过结尾标记-1来确定的。
所以，为了避免这种情况将读到的字节进行int类型的提升。并在保留原字节数据的情况前面了补了24个0，变成了int类型的数值。

而在write写入数据时，只写该int类型数据的最低8位。

*/

import java.io.*;

class MyBufferedInputStreamDemo 
{
	private int count=0,pos=0;    // 分别是计数器与指针
	private byte[] byt = new byte[1024*4];
	private InputStream i;      // 文件流

	MyBufferedInputStreamDemo(InputStream i)
	{
		this.i = i;
	}

	public int MyReader() throws IOException
	{
		if(count==0)
		{
			count = i.read(byt);      // 将字节流读到数组之中,并且返回读取到的数组的长度的值。
			if(count<0)      // 这里就是当在数组中的元素已经取完的时候，就会返回一个-1.
			{
				return -1;
			}
			pos =0;      // 指针重新指向0，新的数组开始读取的位置
			byte b = byt[pos];    // 将在字符数组中的元素取出。
			count--;
			pos++;
 
			return b & 0xff;
		}
		
		else if(count>0)
		{
 			byte b = byt[pos];    // 将在字符数组中的元素取出。
			count--;
			pos++;
			 
			return b & 0xff;
		}
		return -1;
	}

	public void Myclose() throws IOException
	{
		i.close();
	}
}
 