package FileIODemo;

import java.io.File;

public class FileDemo02 {
	public static void main(String[] args) {
		fun();
		fun_01("Bandicam");
		fun_02();
	}
	
	/*
	 * File(File parent, String child)
	 * ����·��������file���͸�·�� �����ַ�����·��
	 */
	public static void fun() {
		// ·��
		File parent = new File("d:");
		File file = new File(parent, "Bandicam");
		System.out.println(file);
	}
	
	/*
	 * File(String parent, String child)
	 * ����·���� �����ַ�����·�� �����ַ�����·��
	 * ����Ը�
	 */
	public static void fun_01(String child) {
		File file = new File("d:", child);
		System.out.println(file);
	}
	
	/*
	 * File(String pathname) 
	 * ���ݵ�·����������д�ļ��� ����дһ���ļ�
	 * c:\\aaa    c:\\aaa\Demo.txt
	 * ��·����װ��File���Ͷ���
	 */
	public static void fun_02() {
		File file = new File("d:\\Bandicam");
		System.out.println(file);
	}
}
