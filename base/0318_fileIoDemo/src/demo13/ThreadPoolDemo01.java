package demo13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 使用多线程求和
 * 	两个线程
 * 		一个计算 1 - 50
 * 		另一个计算1 - 100
 */

public class ThreadPoolDemo01 {
	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		// 一个线程
		Future<Integer> f1 = es.submit(new GetSumCallable01(50));
		// 另一个线程
		Future<Integer> f2 = es.submit(new GetSumCallable01(100));
		
		// 获取结果
		System.out.println(f1.get());
		System.out.println(f2.get());
	}
}
