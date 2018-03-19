package com.itstar.demo01;

public class ThreadPoolRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(new Thread().getName()+"...线程正在工作");
	}

}
