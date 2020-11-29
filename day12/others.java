/*
需求：建立一个人的资源，资源的属性包括名字和性别
 要求用一个线程对该资源的属性进行输入
 要求用一个线程对该资源的属性进行打印输出
 以下是优化后的代码
*/
class Res//建立一个资源类
{
 private String name;
 private String sex;
 private boolean b;//用于表示人这个资源中是否有属性，默认为假
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
class InPut implements Runnable//建立输入类实现接口
{
 Res r;//建立一个资源对象的引用
 InPut(Res r)//构造函数初始化
 {
  this.r=r;
 }
 public void run()//实现接口中的run方法
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
    r.set("云云","女");
   }
   x=(x+1)%2;//作用是让x不断在0和1之间交替，从而使if和else在交替执行
  }
 }
}
class OutPut implements Runnable//定义一个输出类实现接口
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