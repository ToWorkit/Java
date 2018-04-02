package demo10;

public class ThreadDemo {
	public static void main(String[] args) {
		SubThread s = new SubThread();
		// 注意不是run，要使用start开启线程
		s.start();
		
		for (int i = 0; i < 30; i++) {
			System.out.println("main ->" + i);
		}
	}
}
