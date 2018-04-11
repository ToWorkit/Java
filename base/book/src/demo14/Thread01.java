package demo14;

public class Thread01 {
	public static void main(String[] args) {
		// 4 创建Thread类的子类对象
		MyThread mt = new MyThread();
		// 5 要用start执行，开启线程
		mt.start();
		for(int i = 0; i < 1000; i++) {
			System.out.println("Out");
		}
	}
}

// 1 继承Thread
class MyThread extends Thread {
	// 2 重写run方法
	@Override
	public void run() {
		// 3 业务操作
		for(int i = 0; i < 1000; i++) {
			System.out.println("Test");
		}
	}
}
