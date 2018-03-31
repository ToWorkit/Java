package demo12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ʵ���̵߳ĵ����ַ�ʽ��ʵ����Callable�Ľӿ�
 * ʵ�ֲ��裺
 * 	������Executors ��̬����newFixedThreadPool ,�����̳߳ض���
 *  �̳߳ض���ExecutorService�ӿ�ʵ���� �����÷���submit�ύ�߳�����
 *  submit(Callable c)
 */

public class ThreadPoolDemo02 {
	public static void main(String[] args) throws Exception {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<String> f = ex.submit(new ThreadPoolCallable01());
		String s = f.get();
		// �̻߳�ȡ����ֵ�ķ�ʽ
		System.out.println(s);
		// ���򲻻�ֹͣ
	}
}
