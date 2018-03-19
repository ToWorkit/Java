package com.itstar.demo05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ʹ��jdk1.5֮���Lock�ӿڣ�������ǵ�ͬ�������
 * ʵ���̵߳İ�ȫ
 * Lock��ʹ�÷�����
 * 	lock();��ȡ��
 *  unlock(); �ͷ���
 *  
 * ʵ���ࣺ
 * 	ReentrantLock
 */
public class Tickets implements Runnable {
	// �����Ʊ��ƱԴ
	public int tikets = 100;
	private Object obj = new Object();
	private Lock lock = new ReentrantLock();
	
	
	@Override
	public void run() {
		
		while(true) {
			//���ýӿ�ʵ����ķ���
			lock.lock();
			if(tikets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+"�����˵�"+ tikets--);
			}
			lock.unlock();
		}
		
	}
	

	

}
