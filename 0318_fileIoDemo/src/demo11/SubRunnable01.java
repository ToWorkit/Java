package demo11;

/*
 * ʵ�ֽӿڵķ�ʽ�����߳�
 */

public class SubRunnable01 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			// ��ȡ�߳���
			System.out.println(Thread.currentThread().getName() + "__run -> " + i);
		}
	}
}
