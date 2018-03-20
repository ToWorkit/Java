package com.itstar.demo02;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * File(File parent, String child)
	 * ����·��������file���͸�·�� �����ַ�����·��
	 */
	public static void function_2() {
		File parent = new File("d:");
		File file = new File(parent, "eclipse");
		System.out.println(file);
	}
	
	/*
	 * File(String parent, String child)
	 * ����·���� �����ַ�����·�� �����ַ�����·��
	 * ����Ը�
	 */
	public static void function_1(String child) {
		File file = new File("d:", child);
		System.out.println(file);
	}
	
	/*
	 * File(String pathname) 
	 * ���ݵ�·����������д�ļ��� ����дһ���ļ�
	 * c:\\aaa    c:\\aaa\Demo.txt
	 * ��·����װ��File���Ͷ���
	 */
	
	public static void function() {
		//��Ҫ���file�����
		File file = new File("d:\\eclipseB");
		System.out.println(file);
	}
}
