package demo11;

import java.io.File;

/**
 *  * A:重命名和删除功能
		* public boolean renameTo(File dest):把文件重命名为指定的文件路径
		* public boolean delete():删除文件或者文件夹
	* B:重命名注意事项
		* 如果路径名相同，就是改名。
		* 如果路径名不同，就是改名并剪切。
	* C:删除注意事项：
		* Java中的删除不走回收站。
		* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
	* d:判断功能
		* public boolean isDirectory():判断是否是目录
		* public boolean isFile():判断是否是文件
		* public boolean exists():判断是否存在
		* public boolean canRead():判断是否可读
		* public boolean canWrite():判断是否可写
		* public boolean isHidden():判断是否隐藏
 */

public class File03 {
	public static void main(String[] args) {
/*		// 直接删除，不走回收站
		File file01 = new File("F:\\a\\c.txt");
		System.out.println(file01.delete());
		
		File file02 = new File("F:\\aaa");
		// 删除文件夹必须是空的
		System.out.println(file02.delete());*/
//		demo01();
		demo02();
	}
	
	public static void demo01() {
		File file01 = new File("F:\\a\\d.txt");
		File file02 = new File("F:\\a\\ddd.txt");
		
		System.out.println(file01.renameTo(file02));
	}
	
	public static void demo02() {
		File dir03 = new File("F:\\a");
		System.out.println(dir03.isDirectory());
	}
}
