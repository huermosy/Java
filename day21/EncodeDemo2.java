/*
理解一下联通这一个词的特殊性，它的编码规律是满足utf-8的编码规律的。
观察结果发现产生的二进制数与u8一致
所以如果用打开的方法的话，应该在前面加其他中文，否则打开的话会按照u8进行编码产生编码的错误
*/


class  EncodeDemo2
{
	public static void main(String[] args) 
	{
		String s = "联通";
		// 将s转换成字节数组
		byte[] bt = s.getBytes();
		for(byte b:bt)
		{
			System.out.println(Integer.toBinaryString(b&255));     // 观察结果发现产生的二进制数与u8一致
		}
 	}
}
