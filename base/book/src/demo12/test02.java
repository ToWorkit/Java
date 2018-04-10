package demo12;

import java.io.File;
import java.io.FilenameFilter;

// 判断目录下是否有后缀名为.txt的文件，如果有，就输出该文件名称

public class test02 {
	public static void main(String[] args) {
		File dir = new File("F:\\a");
		
/*		// 获取所有的文件或文件夹
		String[] arr = dir.list();
		for (String str: arr) {
			// 以 .md 结尾
			if (str.endsWith(".md")) {
				System.out.println(str);
			}
		}*/
		
		// 获取所有的文件和文件夹对象
/*		File[] subFiles = dir.listFiles();
		for(File subFile: subFiles) {
			if (subFile.isFile() && subFile.getName().endsWith(".md")) {
				System.out.println(subFile);
			}
		}*/
		
		// 匿名函数做过滤器使用
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
