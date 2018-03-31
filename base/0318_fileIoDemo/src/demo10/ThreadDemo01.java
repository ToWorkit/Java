package demo10;

/*
 * 每个线程都有名称
 */

public class ThreadDemo01 {
	public static void main(String[] args) {
		SubThread01 st = new SubThread01();
		st.start();
		
		// 自定义线程名
		st.setName("自定义线程名");
		
		SubThread01 st1 = new SubThread01();
		st1.start();
		
		SubThread01 st2 = new SubThread01();
		st2.start();
		
		// 获取线程名称的通用方式
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + "==");
	}
}
