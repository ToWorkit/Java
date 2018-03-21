package demo10;

public class SubThread01 extends Thread{
	// 使用构造函数改线程名
	public SubThread01() {
		super("另一个线程");
	}
	
	// 通过 Thread 类中的getName方法获取线程的名称
	@Override
	public void run() {
		System.out.println(super.getName());
	}
}
