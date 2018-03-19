package FileIODemo;

import java.io.File;

/*
 * File��Ļ�ȡ����
 * 	list
 *  listFiles
 */

public class FileDemo06 {
	public static void main(String[] args) {
//		fun();
		fun_02();
	}
	
	/*
	 * ��ȡϵͳ�ĸ�Ŀ¼
	 */
	public static void fun() {
		File[] fileArr = File.listRoots();
		for (File f: fileArr) {
			System.out.println(f);
		}
	}
	
	/*
	 *  File[] listFiles()  
	 *  ���ص����ļ���ȫ·������Ŀ¼
	 */
	public static void fun_01() {
		File file = new File("F:\\a");
		File[] fileArr = file.listFiles();
		System.out.println(fileArr.length);
		for(File f: fileArr) {
			System.out.println(f);
		}
	}
	
	/*
	 * file��Ļ�ȡ����
	 * String[] list()
	 * ����һ���ļ���
	 */
	public static void fun_02() {
		File file = new File("F:\\lol");
		String[] strArr = file.list();
		System.out.println(strArr.length);
		for(String s: strArr) {
			System.out.println(s);
		}
	}
}
