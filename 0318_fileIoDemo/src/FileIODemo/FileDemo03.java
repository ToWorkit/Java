package FileIODemo;

import java.io.File;
import java.io.IOException;

/*
 * �����ļ�
 */

public class FileDemo03 {
	public static void main(String[] args) throws IOException {
//		fun();
		fun_02();
	}
	
	/*
	 * boolean delete()  
	 * ɾ���ļ������ļ���
	 * ɾ���ɹ�����true ɾ��ʧ�ܷ���false
	 * ���߻���վ ֱ�Ӵ�Ӳ��ɾ��
	 */
	public static void fun() {
		File file = new File("F:\\a\\b.txt");
		boolean b = file.delete();
		System.out.println(b);
	}
	
	/*
	 *  boolean mkdir() �����ļ��й���
	 */
	public static void fun_01() {
		File file = new File("F:\\a\\b.txt");
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	
	/*
	 * boolean createNewFile()  �����ļ��Ĺ��� 
	 */
	public static void fun_02() throws IOException {
		File file = new File("F:\\a\\b.txt");
		// ���ܻᴴ��ʧ�ܣ��׳��쳣
		boolean b = file.createNewFile();
		System.out.println(b);
	}
}
