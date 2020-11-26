/*
多线程-单例设计模式-懒汉式

什么是单例设计模式： 一个类保证只有一个实例; 创建的方法分为饿汉式与懒汉式。
饿汉式： 先把对象new出来实例化;
懒汉式： 把对象指为空，然后经过判断是否为空来new，具有延时加载的特性。

饿汉式：
class Single
{
private static final Single s = new Single();
private Single(){}
private void getSingle()
{
	return s;
}
}

下面我写一个懒汉式：
因为懒汉式有点麻烦，所以搞开发的时候一般用饿汉式， 但是面试题目的时候还是懒汉式多。
问出来的问题：懒汉式和饿汉式有什么不同？懒汉式存在什么问题？懒汉式加同步的时候使用的锁是哪一个？
懒汉式具有延时加载的特性。懒汉式用双重否定的格式提高效率。 使用的锁是该类所属的字节码文件对象。
*/

class Single
{
	private  Single s = null;
	private Single(){}
	private synchronized void getSingle()    // 现在可以理解一下锁的功能了   第二次进来的时候就不用创建新的对象了。  双重否定句的理解，如果没有第一个否定的话，每次都要经过
											// synchronize这个关键字来判断是否能进入锁，比较耗费资源，所以在前面加一个if语句再进行判断。
	{
		if(s==null)        
			synchronized(Single.class)
			{
				if(s==null)
					s = new Single();
				return s;
			}
	}

}

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
