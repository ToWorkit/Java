package demo13;

/*
 * ��Ʊ
 * 		���̲߳�������ͬһ������Դ(Ʊ������)
 */

public class ThreadDemo {
	public static void main(String[] args) {
		// ����Runnable��ʵ�������
		Tickets t = new Tickets();
		//����3���߳�
		Thread t0 = new Thread(t);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		
		t1.start();
		t0.start();
		t2.start();
	}
}