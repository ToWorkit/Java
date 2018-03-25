package demo12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池
 * static ExecutorService newFixedThreadPool(int nThreads) 
 * 创建线程池
 * <T> Future<T> submit(Callable<T> task)  
 * 提交线程任务
 */

public class ThreadPoolDemo01 {
	public static void main(String[] args) {
		// 调用工厂类的静态方法
		// 创建线程池
		ExecutorService es = Executors.newFixedThreadPool(2);
		// 程序不会停止执行，线程会回到池子中，等待执行
		es.submit(new ThreadPoolRunnable01());
		es.submit(new ThreadPoolRunnable01());
		es.submit(new ThreadPoolRunnable01());
		es.submit(new ThreadPoolRunnable01());
	}
}
