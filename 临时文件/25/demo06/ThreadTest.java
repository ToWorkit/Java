package com.itstar.demo06;

public class ThreadTest {
	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		
		Thread t0 = new Thread(d);
		Thread t1 = new Thread(d);
		
		t0.start();
		t1.start();
	}
}
