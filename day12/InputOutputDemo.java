/*

�̲߳�����ʵ���Ƕ���߳��ڲ���һ����Դ��ֻ�ǲ����Ķ�����ͬ��

����������������ú������output��input�����˽������˽�ȥ�����ࡣ

���Է��ֵ������ǳ����������Ա�ƥ�䣬
ԭ��input��output˳��Ĳ�Э��

һ�������˰�ȫ������ô�����������ͬ����
������ӵ�����������Object��this����ΪobjectҪд�������ط�������this��ָ��input��output�����ࡣ
���Կ����õ������ĸ��ֽ����ļ���  ������r��򵥣���Ϊ��ָ��Res��������Դ

�۲�һ�������Ϊʲô��������һ��Ƭ��ӡ����������أ�
��Ϊcpu��δ���ü��л������кܶ�output����������һ�������������


�Բۣ�Ϊɶwait������������ð������� ��Ϊ�Լ�û�и���һ����������ĵ��ã����൱�ڿ���ͬ��һ������������������Ͳ�֪�����ĸ�����̡߳�



Ϊʲô��Щ�����̵߳ķ���Ҫ������object�����أ� 

��Ϊ��Щ�����ڲ���ͬ���߳�ʱ��������Ҫ��ʾ�����������̵߳�ֻ������
ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ�����ϵ�notify���ѡ�
�����ԶԲ�ͬ���е��߳̽��л��ѡ�

Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������

��������������������Կ��Ա����������õķ���������object���С�

��һ�������Ż�  �� ��������װ��Res���У�������������籩¶   ���������Ż���������һ�¡�����

�ܽ�һ����̼��ɣ���������ѧ�еķ����ʣ�a(b+c) = ab+ac
if(����a)
{
	if(����b1)

	else

}

�ȼ���
if(����b1)
{
	if(����a)
}

else
{
	if(����a)
}

*/
class Res   // ����Դ��������
{
	  private String name;
	  private String sex;
	  private boolean flag = false;  // ��־λĬ��Ϊ��

	  public synchronized void set(String name, String sex)
	  {
		   if(this.flag)
		   {
				try{this.wait();} catch(Exception e){}  // ������r����ʶ���ѵ����ĸ����еĽ��̡�
		   }
		   this.name = name;
		   this.sex = sex;
		   this.flag = true;  // ˵�����ݷ��ϵȴ�״̬�ˣ�
		   this.notify();    // ���ѵ�һ���ȴ����̣߳�������output
	  }

	public synchronized void out()
	{
		if(!this.flag)
		{
			try{this.wait();} catch(Exception e){}
		}
		System.out.println(this.name+"-----...."+this.sex);
		this.flag = false;    // ˵�������Ѿ���ȡ��
		this.notify();  // ����input
	}
}

class Input implements Runnable
{
	private Res r;    // ����һ����Դ��������á�
//	Res p = new Res();    �����������Ļ����õ��������ģʽ����֤������Ψһ�ġ�
	Input(Res r)
	{
		this.r = r;
	}
	
	public void run()
	{
		int x = 0;    // ��һ��flag����д��while�������һֱ����flag=0.
		while(true)
		{
			synchronized(r)
			{
				 
				if(x==0)    // x��Input�ľֲ��������÷�װ��
				{
					 r.set("Mike","man");
				}
				else
				{
					 r.set("����","Ů");
				}
				x = (x+1)%2;
			}
		}
	}

}

class Output implements Runnable
{
	private Res r;
	Output(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();   // ֱ���ú������õķ���
		}
	}
}

class  InputOutputDemo
{
	public static void main(String[] args) 
	{
		Res r = new Res();

		Input in = new Input(r);
		Output out = new Output(r);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
		//System.out.println("Hello World!");
	}
}