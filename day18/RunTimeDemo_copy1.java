/*
Runtime����
һ��javaӦ�ó������ Runtime������Ӧ�ó����뻷��������Ӧ�ó���ӿڵ�һ��ʵ����
Ŀǰ������ʱ����Դ� getRuntime�����õ��ġ� 
һ��Ӧ�ó����޷�����������Լ���ʵ����˵�������еķ������Ǿ�̬�ġ�
���ָ����л��зǾ�̬������
˵������϶����ṩ������ȡ������󣬶��Ҹ÷����Ǿ�̬�ģ�������ֵ�����Ǳ������͡�

������ص��㿴������ʹ���˵������ģʽ���

�÷�ʽ�� static Runtime getRuntime();
*/
class RuntimeDemo 
{
	public static void main(String[] args) throws Exception
	{
		Runtime s = Runtime.getRuntime();        // ����һ��Runtime��
		Process p1 = s.exec("Notepad SystemDemo.java");

		// ���򿪵�Ӧ�ùر�,ɱ������
		/*
		Thread.sleep(4000);
		p1.destroy();
		*/
 	}
}
