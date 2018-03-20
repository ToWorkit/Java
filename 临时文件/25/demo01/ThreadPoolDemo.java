package com.itstar.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 1.5新特性 实现了线程池的程序
 * static ExecutorService newFixedThreadPool(int nThreads) 
 * 创建线程池
 * <T> Future<T> submit(Callable<T> task)  
 * 提交线程任务
 * 
 * 
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//调用工厂类的静态方法
		ExecutorService  es = Executors.newFixedThreadPool(2);
		//程序不会停止 线程会回到池子中 等待执行
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
	}
}
