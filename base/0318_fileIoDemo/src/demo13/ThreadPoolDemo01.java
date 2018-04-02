package demo13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ʹ�ö��߳����
 * 	�����߳�
 * 		һ������ 1 - 50
 * 		��һ������1 - 100
 */

public class ThreadPoolDemo01 {
	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		// һ���߳�
		Future<Integer> f1 = es.submit(new GetSumCallable01(50));
		// ��һ���߳�
		Future<Integer> f2 = es.submit(new GetSumCallable01(100));
		
		// ��ȡ���
		System.out.println(f1.get());
		System.out.println(f2.get());
	}
}
