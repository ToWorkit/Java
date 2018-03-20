package com.itstar.demo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 使用多线程技术
 * 求和：
 * 	两个线程，1个线程计算1+...+50 另外一个线程1+....+100
 * 
 */
public class ThreadPoolDemo {
	public static void main(String[] args) throws Exception{
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = es.submit(new GetSumCallable(50));
		Future<Integer> f2 = es.submit(new GetSumCallable(100));
		
		System.out.println(f1.get());
		System.out.println(f2.get());
	}
}
