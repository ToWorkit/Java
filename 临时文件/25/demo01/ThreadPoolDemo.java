package com.itstar.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 1.5������ ʵ�����̳߳صĳ���
 * static ExecutorService newFixedThreadPool(int nThreads) 
 * �����̳߳�
 * <T> Future<T> submit(Callable<T> task)  
 * �ύ�߳�����
 * 
 * 
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//���ù�����ľ�̬����
		ExecutorService  es = Executors.newFixedThreadPool(2);
		//���򲻻�ֹͣ �̻߳�ص������� �ȴ�ִ��
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
	}
}
