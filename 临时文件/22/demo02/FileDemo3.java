package com.itstar.demo02;

import java.io.File;

/*
 * file����жϹ���
 */
public class FileDemo3 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * boolean isDirectory() 
                ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼��
                 �жϴ�·���Ƿ���һ���ļ��� ���ļ��з���true ���ļ�����false
	 */
	public static void function_1() {
		File file = new File("d:\\eclipse\\eclipse.exe");
		boolean b = file.isDirectory();
		System.out.println(b);
	}
	
	/*
	 * boolean exists() 
                  ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ� 
                 �ж�file���췽���з�װ��·���Ƿ����
                  ���ڷ���true �����ڷ���false
	 */
	public static void function() {
		File file = new File("d:\\eclipseB");
		boolean b = file.exists();
		System.out.println(b);
	}
}
