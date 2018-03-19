package com.itstar.demo07;
/*
 * 输入线程
 * 对资源（变量）进行赋值
 * 一次赋值 张三 男
 * 一次赋值 翠花 女
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
					r.name = "张三";
					r.sex = "男";
				}else {
					r.name = "cuihua";
					r.sex = "girl";
				}
				//将对方线程唤醒，标记为true
				r.flag = true;
				//r.notify();
			}
			i++;
		}
	}
	
}
