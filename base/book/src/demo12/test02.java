package demo12;

import java.io.File;
import java.io.FilenameFilter;

// �ж�Ŀ¼���Ƿ��к�׺��Ϊ.txt���ļ�������У���������ļ�����

public class test02 {
	public static void main(String[] args) {
		File dir = new File("F:\\a");
		
/*		// ��ȡ���е��ļ����ļ���
		String[] arr = dir.list();
		for (String str: arr) {
			// �� .md ��β
			if (str.endsWith(".md")) {
				System.out.println(str);
			}
		}*/
		
		// ��ȡ���е��ļ����ļ��ж���
/*		File[] subFiles = dir.listFiles();
		for(File subFile: subFiles) {
			if (subFile.isFile() && subFile.getName().endsWith(".md")) {
				System.out.println(subFile);
			}
		}*/
		
		// ����������������ʹ��
		String[] arr = dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				System.out.println(dir);
				System.out.println(name);
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".md");
			}
		});
		
		for(String str: arr) {
			System.out.println(str);
		}
	}
}
