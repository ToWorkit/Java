package com.itstar.demo01;

import java.io.File;

/*
 * java.io.File
 * 	������ϵͳ�е��ļ���Ŀ¼��·����װ����file����
 *  �ṩ�˷��� ����ϵͳ�е�����
 *  
 *  �ļ���file
 *  Ŀ¼��diretory
 *  ·����path
 */
public class FileDemo {
	public static void main(String[] args) {
		//File�ྲ̬��Ա����
		//static String pathSeparator  ��ϵͳ�йصķָ���
		String s = File.pathSeparator;//linux��:
		System.out.println(s);
		
		String s1 = File.separator;
		System.out.println(s1);//windows "\" linux /
	}
}
