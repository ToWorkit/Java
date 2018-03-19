package com.itstar.demo05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 使用jdk1.5之后的Lock接口，替代我们的同步代码块
 * 实现线程的安全
 * Lock的使用方法：
 * 	lock();获取锁
 *  unlock(); 释放锁
 *  
 * 实现类：
 * 	ReentrantLock
 */
public class Tickets implements Runnable {
	// 定义出票的票源
	public int tikets = 100;
	private Object obj = new Object();
	private Lock lock = new ReentrantLock();
	
	
	@Override
	public void run() {
		
		while(true) {
			//调用接口实现类的方法
			lock.lock();
			if(tikets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+"出售了第"+ tikets--);
			}
			lock.unlock();
		}
		
	}
	

	

}
