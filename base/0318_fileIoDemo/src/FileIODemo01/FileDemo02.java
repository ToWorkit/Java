package FileIODemo01;

import java.io.File;

public class FileDemo02 {
	public static void main(String[] args) {
		File dir = new File("F:\\lol");
		getAllDir(dir);
	}
	
	// ����ȫ�ļ�Ŀ¼
	public static void getAllDir(File dir) {
		File[] fileDir = dir.listFiles();
		for (File f: fileDir) {
			// ���ļ������������
			if (f.isDirectory()) {
				getAllDir(f);
			} else {
				System.out.println(f);
			}
		}
	}
}
