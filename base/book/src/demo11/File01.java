package demo11;

import java.io.File;

/**
 * File(String pathname)：根据一个路径得到File对象
 * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
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
