package demo12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳�
 * static ExecutorService newFixedThreadPool(int nThreads) 
 * �����̳߳�
 * <T> Future<T> submit(Callable<T> task)  
 * �ύ�߳�����
 */

public class ThreadPoolDemo01 {
	public static void main(String[] args) {
		// ���ù�����ľ�̬����
		// �����̳߳�
		ExecutorService es = Executors.newFixedThreadPool(2);
		// ���򲻻�ִֹͣ�У��̻߳�ص������У��ȴ�ִ��
		es.submit(new ThreadPoolRunnable01());
		es.submit(new ThreadPoolRunnable01());
		es.submit(new ThreadPoolRunnable01());
		es.submit(new ThreadPoolRunnable01());
	}
}
