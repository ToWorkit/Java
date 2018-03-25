package demo03;

/*
 * 使用 Lock 接口，替代同步的代码块实现线程的安全
 * Lock的使用方法:
 * 		lock(); 获取锁
 * 		unlock(); 释放锁
 * 实现类:
 * 		ReentrantLock
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets01 implements Runnable {
	// 定义出票的票源
	public int tikets = 100;
	private Lock lock = new ReentrantLock(); 
	
	// 重写 继承类 Runnable 的 方法
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
				System.out.println(Thread.currentThread().getName() + "出售了第" + tikets--);
			}
			lock.unlock();
		}
	}
	
}
