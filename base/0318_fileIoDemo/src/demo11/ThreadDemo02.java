package demo11;

/*
 * �����ڲ��࣬ʵ�ֶ��̳߳���
 * 
 * new ������߽ӿ�() {
 * 		��д���󷽷�
 * }
 */

public class ThreadDemo02 {
	public static void main(String[] args) {
		// �̳еķ�ʽ -> xxx extends Thread { public void run() }
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "__����");
			}
			// start��ʼ�߳�
		}.start();
		
		// �ӿڵķ�ʽ -> xxx implements Runnable {}
		// ʵ����
		Runnable r = new Runnable() {
			// ��д�ӿڵķ���
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "__�ӿ�");
			}
		};
		new Thread(r).start();
		
		// ������
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "__���");
			}
		}).start();
	}
}
