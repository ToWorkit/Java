package demo11;

/*
 * 实现接口的方式创建线程
 */

public class SubRunnable01 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 获取线程名
			System.out.println(Thread.currentThread().getName() + "__run -> " + i);
		}
	}
}
