package com.itstar.demo07;
/*
 * 输出线程
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
				//判断标记 false等待
//				if(!r.flag) {
//					try {
//						r.wait();
//					} catch (InterruptedException e) {
//						
//						e.printStackTrace();
//					}
//				}
				System.out.println(r.name+"..."+r.sex);
				
				//标记为false唤醒对方线程
				r.flag = false;
				//r.notify();
			}
		}
	}
	
}
