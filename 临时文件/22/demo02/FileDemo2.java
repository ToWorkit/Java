package com.itstar.demo02;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 *  String getParent() ����String
	 *  ��ȡ���Ǹ�·��
	 *  File getParentFile ����file����
	 */
	public static void function_3() {
		File file = new File("d:\\eclipse\\eclipse.exe");
		File parent = file.getParentFile();
		System.out.println(parent);
	}
	
	/*
	 *  String getAbsolutePath() 
                     ���ش˳���·�����ľ���·�����ַ�����
                     ��ȡ����·��  ����String����
         File getAbsoluteFile()
                     ��ȡ����·��     ����file����         
                     ���дһ�����·�������ظ�λ�õĹ��̵ĸ�Ŀ¼             
	 */
	public static void function_2() {
		File file = new File("src");
//		String absolute = file.getAbsolutePath();
//		System.out.println(absolute);
		File absolute = file.getAbsoluteFile();
		System.out.println(absolute);
	}
	
	/*
	 *  long length() 
                    �����ɴ˳���·������ʾ���ļ��ĳ��ȡ� 
                    ����·���е��ļ����ֽ�����û������ļ�����0
	 */
	public static void function_1() {
		//�õ��ļ�
		File file = new File("d:\\eclipse\\eclipse.exe");
		long l = file.length();
		System.out.println(l);
	}
	
	/*
	 * String getName()  
	 * �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�
	 * ��ȡ·����������֣���û�в���
	 */
	
	public static void function() {
		//�õ��ļ�
		File file = new File("d:\\eclipse\\eclipseB.exe");
		String name = file.getName();
		System.out.println(name);
	}
}
