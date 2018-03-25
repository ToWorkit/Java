package demo03;

/*
 * ʹ�� Lock �ӿڣ����ͬ���Ĵ����ʵ���̵߳İ�ȫ
 * Lock��ʹ�÷���:
 * 		lock(); ��ȡ��
 * 		unlock(); �ͷ���
 * ʵ����:
 * 		ReentrantLock
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets01 implements Runnable {
	// �����Ʊ��ƱԴ
	public int tikets = 100;
	private Lock lock = new ReentrantLock(); 
	
	// ��д �̳��� Runnable �� ����
	@Override
	public void run() {
		while(true) {
			lock.lock();
			if(tikets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "�����˵�" + tikets--);
			}
			lock.unlock();
		}
	}
	
}
