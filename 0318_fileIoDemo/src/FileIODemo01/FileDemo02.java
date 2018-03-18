package FileIODemo01;

import java.io.File;

public class FileDemo02 {
	public static void main(String[] args) {
		File dir = new File("F:\\lol");
		getAllDir(dir);
	}
	
	// 遍历全文件目录
	public static void getAllDir(File dir) {
		File[] fileDir = dir.listFiles();
		for (File f: fileDir) {
			// 是文件夹则继续遍历
			if (f.isDirectory()) {
				getAllDir(f);
			} else {
				System.out.println(f);
			}
		}
	}
}
