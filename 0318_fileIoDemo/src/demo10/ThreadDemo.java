package demo10;

public class ThreadDemo {
	public static void main(String[] args) {
		SubThread s = new SubThread();
		// ע�ⲻ��run��Ҫʹ��start�����߳�
		s.start();
		
		for (int i = 0; i < 30; i++) {
			System.out.println("main ->" + i);
		}
	}
}
