package comitstar.demo05;
/*
 * 实现接口的方式创建线程
 */
public class ThreadDemo {
	public static void main(String[] args) {
		SubRunnable sr = new SubRunnable();
		Thread t = new Thread(sr);
		t.start();
		
		for(int i=0;i<50;i++) {
			System.out.println("main..."+i);
		}
	}
}
