package comitstar.demo06;
/*
 *�����ڲ��࣬ʵ�ֶ��̳߳���
 *
 *new ������߽ӿ�(){
 *	��д���󷽷�
 *}
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//�̳еķ�ʽ ��XXX extends Thread{public void run()}
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"����");
			}
		}.start();
		
	
	
	
		//�ӿڵķ�ʽ�� XXX implements Runnable{}
		//ʵ����
	
		Runnable r = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"$$$$$$$");
			}
		};
		new Thread(r).start();
		
	
		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"@@@@@@@@@@@@@@@");
			}
		}).start();
	}
}
