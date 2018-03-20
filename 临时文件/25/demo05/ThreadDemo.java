package com.itstar.demo05;
/*
 * 售票：
 * 	多线程并发访问同一数据资源（票的总数）
 * 3个线程
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//创建Runnable的实现类对象
		Tickets t = new Tickets();
		//创建3个线程
		Thread t0 = new Thread(t);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		
		t1.start();
		t0.start();
		t2.start();
	}
}
