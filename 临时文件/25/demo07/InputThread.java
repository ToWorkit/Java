package com.itstar.demo07;
/*
 * �����߳�
 * ����Դ�����������и�ֵ
 * һ�θ�ֵ ���� ��
 * һ�θ�ֵ �仨 Ů
 */
public class InputThread implements Runnable{
	
	private Resource r;
	public InputThread(Resource r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			synchronized (r) {
				if(r.flag) {
//					try {
//						r.wait();
//					} catch (InterruptedException e) {
//						
//						e.printStackTrace();
//					}
				}
				
				if(i%2 == 0) {
					r.name = "����";
					r.sex = "��";
				}else {
					r.name = "cuihua";
					r.sex = "girl";
				}
				//���Է��̻߳��ѣ����Ϊtrue
				r.flag = true;
				//r.notify();
			}
			i++;
		}
	}
	
}
