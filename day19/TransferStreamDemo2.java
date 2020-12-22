/*
����1��ͨ��InputStreamReader���ֽ���ת�����ַ�����Ȼ�����Ϊ��д��
Դ������¼�롣   Ŀ�ģ�����̨��
����2��������¼������ݴ洢��һ���ļ���
Դ������¼�롣    Ŀ�ģ��ļ�
����3����һ���ļ�����������ڿ���̨��
Դ���ļ�      Ŀ�ģ�����̨

������������ɣ�
��ʹ��ľ����������кܶ࣬��֪�������ĸ�
ͨ��������ȷ����ɡ�
1.��ȷԴ��Ŀ�ġ�����2��ѡ��
Դ���������� InputStream Reader
Ŀ�ģ�������� OutputStream Writer
2.�����������Ƿ�Ϊ���ı���
�ǣ��ַ�����
���ǣ��ֽ�����

3.����ϵ��ȷ������ȷҪʹ���ĸ�����Ķ���
ͨ���豸���������֣�
Դ�豸���ڴ棬Ӳ�̣����̡�
Ŀ���豸���ڴ棬Ӳ�̣�����̨��

1.��һ�������ļ��е����ݴ洢����һ���ļ��У������ļ���
Դ����Ϊ��Դ������ʹ�ö�ȡ����InputStream Reader  ������������ѡ��
�ǲ��ǲ����ı��ļ���
�ǣ���ʱ�Ϳ���ѡ��Reader
������ϵ����ȷ�ˡ�
������Ҫ��ȷҪʹ����ϵ�е��Ǹ����� ��ȷ�豸��Ӳ���ϵ�һ���ļ���
Reader��ϵ�п��Բ����ļ��Ķ����� FileReader
�Ƿ���Ҫ���Ч�ʣ��ǣ� ����Reader��ϵ�л����� BufferedReader��
FileReader fr = new FileReader("a.txt");
BufferedRead sb = new BufferedRead(fr);

Ŀ��: OutputStream Writer     ������������ѡ��
�Ƿ�Ϊ���ı���
�ǣ�Writer��
�豸��Ӳ�̣�һ���ļ���
Writer��ϵ�п��Բ����ļ��Ķ���FileWriter
�Ƿ���Ҫ���Ч�ʣ��ǣ�����Writer��ϵ�еĻ����� BufferedWriter
FIleWriter fw = new FileWriter("a_copy.txt");
BufferedWriter sb1 = new BufferedWriter(fw);

��һ����ϰ
����1����һ��ͼƬ�ļ������ݴ洢����һ���ļ��������ļ���
Դ����Ϊ��Դ����������ѡ��InputStream  ��Read
��Ϊ��ͼƬ ����Ҫ���ֽ�����������InputStream
��Ϊ���ļ���������ȷ����ϵ����FileInputStream
��ϵ��ȷ֮��֪��������Ӳ���е��ļ�

Ŀ�ģ���Ϊ��Ŀ������������ѡ��OutputStream ��Write
��Ϊ�洢����һ����Ӧ����ͼƬ�ļ�
����ȷ����ϵ�к�֪������Ӳ���е��ļ���

����2��������¼������ݱ�����һ���ļ��С�
	���������ߵ�ԭ��
	�����������Դ��Ŀ�Ķ����ڡ�
	��ô�ֱ������
	Դ�� InputStream(�ֽ���) Reader���ַ�����
	�ǲ��Ǵ��ı����ǣ� Reader

	�豸�����̡���Ӧ�Ķ�����System.in.�����Ӧ�����ֽ���
	Ϊ�˲������̸��ӷ��㣬ת���ַ��������ַ�������ʱ���ġ�
	���Լ�Ȼ��ȷ��Reader����ô�ʹ�Reader���������࣬��System.inת����Reader��
	����Reader��ϵ�е�ת������InputStreamReader
	InputStreamReader i = new InputStreamReader(System.in);
	��Ҫ���Ч������Ҫ�� BufferedReader
	BufferedReader bufr = new BufferedReader(i);

	Ŀ�ģ� OutputStream  Writer
	�ǲ��Ǵ��ı��� �ǣ�Writer
	�豸��Ӳ�̣�һ���ļ� ʹ�� FileWriter
	FileWrtier f = new FileWrtier("c.txt");
	��ȻҲ����д��Ϊ��  OutputStreamWriter f1 = new OutputStreamWriter("");
	------------------------------
	��һ������������ϣ���洢���ļ���ʽ�в�ͬ������GBK �� utf-8

*/
import java.io.*;
class  TransferStreamDemo2
{
	public static void main(String[] args) throws IOException
	{

		// ���̵ĳ���д����
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter fw =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d1.txt"),"UTF-8"));  // Ĭ����ʽΪGBK
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
