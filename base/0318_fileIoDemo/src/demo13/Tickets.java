package demo13;

/*
 * ��Ʊ
 * synchronized ͬ��
 * ��ʽ��
 * 	synchronized(�������){
 * 		�̲߳����Ĺ�������
 *  }
 */

public class Tickets implements Runnable{
	// �����Ʊ��ƱԴ
	public int tikets = 10;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			payTickets();
		}
	}
	
	// ͬ�����������ڶ����� -> this
	public synchronized void payTickets() {
		if (tikets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(Thread.currentThread().getName() + "���۵�" + tikets--);
		}
	}
	
}