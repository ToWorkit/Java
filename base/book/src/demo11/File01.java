package demo11;

import java.io.File;

/**
 * File(String pathname)������һ��·���õ�File����
 * File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 */

public class File01 {
	public static void main(String[] args) {
		File parent = new File("F:\\a");
		String child = "b.txt";
		File file = new File(parent, child);
/*		System.out.println(file.exists());
		System.out.println(parent.exists());*/
		
		demo01();
	}
	public static void demo01() {
		File file = new File("F:\\a\\c.txt");
		System.out.println(file.exists());
	}
}
