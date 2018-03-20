package comitstar.demo03;
/*
 * 每个线程都有自己的名字
 * 
 */
public class ThreadDemo {
	public static void main(String[] args) {
		
		//System.out.println(0/0);
		
		SubThread st = new SubThread();
		st.start();
		
		//可以自定义线程名称
		//st.setName("我是自定义线程");
		
		SubThread st1 = new SubThread();
		st1.start();
		
		SubThread st2 = new SubThread();
		st2.start();
		
		
		//获取线程名称的通用方式
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
	}
}
