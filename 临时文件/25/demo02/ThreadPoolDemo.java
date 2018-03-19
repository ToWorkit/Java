package com.itstar.demo02;

import java.util.concurrent.ExecutionException;
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
public class ThreadPoolDemo {
	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		Future<String> f = es.submit(new ThreadPoolCallable());
		
		String s = f.get();
		//�̻߳�ȡ����ֵ�ķ�ʽ
		System.out.println(s);
	}
}
