package demo11;

/*
 * 实现接口的方式创建线程
 */

public class ThreadDemo01 {
	public static void main(String[] args) {
		SubRunnable01 sr = new SubRunnable01();
		Thread t = new Thread(sr);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main -> " + i);
		}
	}
}
