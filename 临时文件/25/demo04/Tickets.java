package com.itstar.demo04;

/*
 * synchronizedͬ��
 * ��ʽ��
 * 	synchronized(�������){
 * 		�̲߳����Ĺ�������
 *  }
 */
public class Tickets implements Runnable {
	// �����Ʊ��ƱԴ
	public int tikets = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		while(true) {
			payTickets();
		}
	}
	//ͬ������ ���ڶ����� ������->this
	public  synchronized void payTickets() {
		if(tikets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"���۵�"+tikets--);
		}
	}

	

}
