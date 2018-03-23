package demo03;

/*
 * 3个线程
 * 售票:
 * 	多线程并发访问同一数据资源(就是票的总数)
 */

public class ThreadDemo01 {
	public static void main(String[] args) {
		// 创建Runnable的实现类对象
		Tickets01 t = new Tickets01();
		// 创建3个线程
		Thread t0 = new Thread(t);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t0.start();
		t1.start();
		t2.start();
	}
}
