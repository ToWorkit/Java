package FileIODemo;

import java.io.File;

public class FileDemo04 {
	public static void main(String[] args) {
		fun_03();
	}
	
	/*
	 *  String getParent() ����String
	 *  ��ȡ���Ǹ�·��
	 *  File getParentFile ����file����
	 */
	public static void fun() {
		File file = new File("F:\\a\\b.txt");
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
	public static void fun_01() {
		File file = new File("src");
		String str_absolut = file.getAbsolutePath();
		System.out.println(str_absolut);
		
		File file_absolut = file.getAbsoluteFile();
		System.out.println(file_absolut);
	}
	
	/*
	 *  long length() 
                    �����ɴ˳���·������ʾ���ļ��ĳ��ȡ� 
                    ����·���е��ļ����ֽ�����û������ļ�����0
	 */
	public static void fun_02() {
		File file = new File("F:\\a\\b.txt");
		long l = file.length();
		System.out.println(l);
	}
	
	/*
	 * String getName()  
	 * �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�
	 * ��ȡ·����������֣�������û��
	 */
	public static void fun_03() {
		File file = new File("F:\\a\\b.txt");
		String name = file.getName();
		System.out.println(name);
	}
}
