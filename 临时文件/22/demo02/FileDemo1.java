package com.itstar.demo02;

import java.io.File;
import java.io.IOException;

/*
 * File��Ĵ�����ɾ������
 * 
 */
public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		function_2();
	}
	/*
	 * boolean delete()  
	 * ɾ���ļ������ļ���
	 * ɾ���ɹ�����true ɾ��ʧ�ܷ���false
	 * ���߻���վ ֱ�Ӵ�Ӳ��ɾ��
	 */
	public static void function_2() {
		File file = new File("c:\\bb.txt\\cc.txt");
		boolean b = file.delete();
		System.out.println(b);
	}
	
	/*
	 *  boolean mkdir() �����ļ��й���
	 *  
	 */
	public static void function_1() {
		//�����ļ���
		File file = new File("c:\\bb.txt\\cc.txt");
		//mkdirs�������ļ���
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	
	/*
	 * boolean createNewFile()  �����ļ�!�Ĺ���
	 * 
	 */
	public static void function() throws IOException {
		File file = new File("c:\\�½��ļ���");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
}
