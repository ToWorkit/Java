package com.itstar.demo07;
/*
 * ����߳�
 */
public class OutThread implements Runnable{
	private Resource r;
	
	public OutThread(Resource r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (r) {
				//�жϱ�� false�ȴ�
//				if(!r.flag) {
//					try {
//						r.wait();
//					} catch (InterruptedException e) {
//						
//						e.printStackTrace();
//					}
//				}
				System.out.println(r.name+"..."+r.sex);
				
				//���Ϊfalse���ѶԷ��߳�
				r.flag = false;
				//r.notify();
			}
		}
	}
	
}
