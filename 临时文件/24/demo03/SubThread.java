package comitstar.demo03;

public class SubThread extends Thread{
	//使用构造器来改线程名字
//	public SubThread() {
//		super("我是另外一个进程");
//	}
	
	//通过thread类中的getName方法获取线程名称
	public void run() {
		
		System.out.println(super.getName());
		//System.out.println(0/0);
	}
}
