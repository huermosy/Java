/*
���󣺽���һ���˵���Դ����Դ�����԰������ֺ��Ա�
 Ҫ����һ���̶߳Ը���Դ�����Խ�������
 Ҫ����һ���̶߳Ը���Դ�����Խ��д�ӡ���
 �������Ż���Ĵ���
*/
class Res//����һ����Դ��
{
 private String name;
 private String sex;
 private boolean b;//���ڱ�ʾ�������Դ���Ƿ������ԣ�Ĭ��Ϊ��
 public synchronized void set(String name,String sex)
 {
  if (b)
  {
   try
   {
    this.wait();
   }
   catch (Exception e)
   {
   }
  }
   this.name=name;
   this.sex=sex;
   b=true;
   this.notify();
 }
 public synchronized void method()
 {
  if (!b)
  {
   try
   {
    this.wait();
   }
   catch (Exception e)
   {
   }
  }
   System.out.println(this.name+"---------"+this.sex);
   b=false;
   this.notify();
 }

}
class InPut implements Runnable//����������ʵ�ֽӿ�
{
 Res r;//����һ����Դ���������
 InPut(Res r)//���캯����ʼ��
 {
  this.r=r;
 }
 public void run()//ʵ�ֽӿ��е�run����
 {
  int x=0;
  while (true)
  {
   if (x==0)
   {
    r.set("mike","men");
   }
   else
   {
    r.set("����","Ů");
   }
   x=(x+1)%2;//��������x������0��1֮�佻�棬�Ӷ�ʹif��else�ڽ���ִ��
  }
 }
}
class OutPut implements Runnable//����һ�������ʵ�ֽӿ�
{
 Res r;
 OutPut(Res r)
 {
  this.r=r;
 }
 public void run()
 {
  while (true)
  {
   r.method();
  }
 }
}
class Others
{
 public static void main(String[] args)
 {
  Res r=new Res();
  new Thread(new InPut(r)).start();
  new Thread(new OutPut(r)).start();
 }
}