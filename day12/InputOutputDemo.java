/*

线程操作其实就是多个线程在操作一个资源，只是操作的动作不同。

将这个事例想象成运煤，共有output与input就是运进来与运进去两个类。

可以发现的问题是出现名字与性别不匹配，
原因：input与output顺序的不协调

一旦出现了安全问题那么解决方法就是同步。
这个例子的类名不能用Object和this，因为object要写在两个地方，并且this会指向input和output两个类。
所以可以用到其他四个字节码文件。  其中用r最简单，因为它指向Res这个类的资源

观察一下输出，为什么会有练着一大片打印的这种情况呢？
因为cpu还未来得及切换，就有很多output输出，造成有一大堆重名的数据


卧槽，为啥wait这个东西不管用啊。。。 因为自己没有给它一个类名对象的调用，就相当于开关同样一个锁。如果不加锁，就不知道是哪个类的线程。



为什么这些操作线程的方法要定义在object类中呢？ 

因为这些方法在操作同步线程时，都必须要表示他们所操作线程的只有锁。
只有同一个锁上的被等待线程，可以被同一个锁上的notify唤醒。
不可以对不同所中的线程进行唤醒。

也就是说，等待和唤醒必须是同一个锁。

而锁可以是任意对象，所以可以被任意对象调用的方法定义在object类中。

做一个代码优化  ， 将方法封装到Res类中，这样不必像外界暴露   这个代码的优化还可以练一下。。。

总结一个编程技巧：类似于数学中的分配率：a(b+c) = ab+ac
if(条件a)
{
	if(条件b1)

	else

}

等价于
if(条件b1)
{
	if(条件a)
}

else
{
	if(条件a)
}

*/
class Res   // 将资源放在类中
{
	  private String name;
	  private String sex;
	  private boolean flag = false;  // 标志位默认为假

	  public synchronized void set(String name, String sex)
	  {
		   if(this.flag)
		   {
				try{this.wait();} catch(Exception e){}  // 必须用r来标识唤醒的是哪个类中的进程。
		   }
		   this.name = name;
		   this.sex = sex;
		   this.flag = true;  // 说明数据符合等待状态了，
		   this.notify();    // 唤醒第一个等待的线程，这里是output
	  }

	public synchronized void out()
	{
		if(!this.flag)
		{
			try{this.wait();} catch(Exception e){}
		}
		System.out.println(this.name+"-----...."+this.sex);
		this.flag = false;    // 说明数据已经被取了
		this.notify();  // 唤醒input
	}
}

class Input implements Runnable
{
	private Res r;    // 建立一个资源对象的引用。
//	Res p = new Res();    如果创建对象的话，用单例的设计模式，保证对象是唯一的。
	Input(Res r)
	{
		this.r = r;
	}
	
	public void run()
	{
		int x = 0;    // 这一个flag不能写在while里面否则一直会是flag=0.
		while(true)
		{
			synchronized(r)
			{
				 
				if(x==0)    // x是Input的局部变量不好封装。
				{
					 r.set("Mike","man");
				}
				else
				{
					 r.set("丽丽","女");
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
			r.out();   // 直接用函数调用的方法
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
