package FileIODemo;

import java.io.File;

/*
 * File����жϹ���
 */

public class FileDemo05 {
	public static void main(String[] args) {
		fun_01();
	}
	
	/*
	 * boolean isDirectory() 
                ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼��
                 �жϴ�·���Ƿ���һ���ļ��� ���ļ��з���true ���򷵻�false
	 */
	public static void fun() {
		// �ļ�
		File file = new File("F:\\a\\b.txt");
		boolean b = file.isDirectory();
		System.out.println(b);
	}
	
	/*
	 * boolean exists() 
                  ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ� 
                 �ж�file���췽���з�װ��·���Ƿ����
                  ���ڷ���true �����ڷ���false
	 */
	public static void fun_01() {
		File file = new File("F:\\a\\b.txt");
		boolean b = file.exists();
		System.out.println(b);
	}
}
