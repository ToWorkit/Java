package demo03;

/*
 * 3���߳�
 * ��Ʊ:
 * 	���̲߳�������ͬһ������Դ(����Ʊ������)
 */

public class ThreadDemo01 {
	public static void main(String[] args) {
		// ����Runnable��ʵ�������
		Tickets01 t = new Tickets01();
		// ����3���߳�
		Thread t0 = new Thread(t);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t0.start();
		t1.start();
		t2.start();
	}
}
