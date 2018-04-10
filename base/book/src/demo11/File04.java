package demo11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * * A:获取功能
	* public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取路径
	* public String getName():获取名称
	* public long length():获取长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
 */

public class File04 {
	public static void main(String[] args) {
		File dir = new File("F:\\a");
		// 获取文件名
		String[] arr = dir.list();
		for (String st: arr) {
			System.out.println(st);
		}
		
		// 文件对象
		File[] subFiles = dir.listFiles();
		for (File fl: subFiles) {
			System.out.println(fl);
		}
		
		File file01 = new File("F:\\a\\b.txt");
		// 文件最后修改时间
		Date d = new Date(file01.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}
