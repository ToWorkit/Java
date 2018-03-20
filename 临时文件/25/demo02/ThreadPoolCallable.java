package com.itstar.demo02;

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable<String> {

	public String call() {
		return "aaa";
	}
	
}
