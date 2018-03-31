package FileIODemo;

import java.io.File;
import java.io.IOException;

/*
 * 操作文件
 */

public class FileDemo03 {
	public static void main(String[] args) throws IOException {
//		fun();
		fun_02();
	}
	
	/*
	 * boolean delete()  
	 * 删除文件或者文件夹
	 * 删除成功返回true 删除失败返回false
	 * 不走回收站 直接从硬盘删除
	 */
	public static void fun() {
		File file = new File("F:\\a\\b.txt");
		boolean b = file.delete();
		System.out.println(b);
	}
	
	/*
	 *  boolean mkdir() 创建文件夹功能
	 */
	public static void fun_01() {
		File file = new File("F:\\a\\b.txt");
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	
	/*
	 * boolean createNewFile()  创建文件的功能 
	 */
	public static void fun_02() throws IOException {
		File file = new File("F:\\a\\b.txt");
		// 可能会创建失败，抛出异常
		boolean b = file.createNewFile();
		System.out.println(b);
	}
}
