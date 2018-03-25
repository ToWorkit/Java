package demo12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 实现线程的第三种方式：实现了Callable的接口
 * 实现步骤：
 * 	工厂类Executors 静态方法newFixedThreadPool ,创建线程池对象
 *  线程池对象ExecutorService接口实现类 ，调用方法submit提交线程任务
 *  submit(Callable c)
 */

public class ThreadPoolDemo02 {
	public static void main(String[] args) throws Exception {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<String> f = ex.submit(new ThreadPoolCallable01());
		String s = f.get();
		// 线程获取返回值的方式
		System.out.println(s);
		// 程序不会停止
	}
}
