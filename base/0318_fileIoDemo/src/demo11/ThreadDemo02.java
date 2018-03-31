package demo11;

/*
 * 匿名内部类，实现多线程程序
 * 
 * new 父类或者接口() {
 * 		重写抽象方法
 * }
 */

public class ThreadDemo02 {
	public static void main(String[] args) {
		// 继承的方式 -> xxx extends Thread { public void run() }
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "__匿名");
			}
			// start开始线程
		}.start();
		
		// 接口的方式 -> xxx implements Runnable {}
		// 实现类
		Runnable r = new Runnable() {
			// 重写接口的方法
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "__接口");
			}
		};
		new Thread(r).start();
		
		// 混起来
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "__混合");
			}
		}).start();
	}
}
