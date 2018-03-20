package com.itstar.demo07;

public class ThreadDemo {
	public static void main(String[] args) {
		Resource r = new Resource();
		
		InputThread in = new InputThread(r);
		OutThread out = new OutThread(r);
		
		Thread tin = new Thread(in);
		Thread tout = new Thread(out);
		
		tin.start();
		tout.start();
	}
}
