/*
�Զ����ֽ����Ļ�������read��write���ص㣬    ����һ����������Ĺ��̣���Ҫ���顢��������ָ������Ԫ��ȱһ���ɡ�
��Ϊbyte��8λ�ģ���int��32λ�ģ�ֱ�ӽ�byteתΪintǿת�Ļ������ܻ�ʹǰ���λ����1���Ӷ���������32λ��int���͵�ֵΪ-1��
����Ӧ��&��һ��int���͵�255��������8λ�ı�����

�ܽ�һ��read��write���ص㣺
�����Ķ�һ���ֽڵ�read����Ϊʲô����ֵ���Ͳ���byte������int��
��Ϊ�п��ܻ��������8��������1�������8��������1��Ӧ��ʮ������-1����ô�ͻ����ݻ�û�ж��꣬�ͽ������������Ϊ�����ж϶�ȡ������ͨ����β���-1��ȷ���ġ�
���ԣ�Ϊ�˱�������������������ֽڽ���int���͵����������ڱ���ԭ�ֽ����ݵ����ǰ���˲���24��0�������int���͵���ֵ��

����writeд������ʱ��ֻд��int�������ݵ����8λ��

*/

import java.io.*;

class MyBufferedInputStreamDemo 
{
	private int count=0,pos=0;    // �ֱ��Ǽ�������ָ��
	private byte[] byt = new byte[1024*4];
	private InputStream i;      // �ļ���

	MyBufferedInputStreamDemo(InputStream i)
	{
		this.i = i;
	}

	public int MyReader() throws IOException
	{
		if(count==0)
		{
			count = i.read(byt);      // ���ֽ�����������֮��,���ҷ��ض�ȡ��������ĳ��ȵ�ֵ��
			if(count<0)      // ������ǵ��������е�Ԫ���Ѿ�ȡ���ʱ�򣬾ͻ᷵��һ��-1.
			{
				return -1;
			}
			pos =0;      // ָ������ָ��0���µ����鿪ʼ��ȡ��λ��
			byte b = byt[pos];    // �����ַ������е�Ԫ��ȡ����
			count--;
			pos++;
 
			return b & 0xff;
		}
		
		else if(count>0)
		{
 			byte b = byt[pos];    // �����ַ������е�Ԫ��ȡ����
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
 