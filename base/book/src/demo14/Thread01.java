package demo14;

public class Thread01 {
	public static void main(String[] args) {
		// 4 ����Thread����������
		MyThread mt = new MyThread();
		// 5 Ҫ��startִ�У������߳�
		mt.start();
		for(int i = 0; i < 1000; i++) {
			System.out.println("Out");
		}
	}
}

// 1 �̳�Thread
class MyThread extends Thread {
	// 2 ��дrun����
	@Override
	public void run() {
		// 3 ҵ�����
		for(int i = 0; i < 1000; i++) {
			System.out.println("Test");
		}
	}
}
