package demo11;

import java.io.File;
import java.io.IOException;

/**
 * * A:创建功能
		* public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
		* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
		* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
	* B:案例演示
		* File类的创建功能
	
		* 注意事项：
			* 如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
 * @throws IOException 
 */

public class File02 {
	public static void main(String[] args) throws IOException {
/*		// 创建目录
		File dir01 = new File("F:\\aaa");
		System.out.println(dir01.mkdir());
		
		// 创建多级目录
		File dir02 = new File("F:\\aa\\cc");
		System.out.println(dir02.mkdirs());*/
		
		demo01();
	}
	
	public static void demo01() throws IOException {
		try {
			File file = new File("F:\\cca\\test.txt");
			System.out.println(file.createNewFile());
		} catch(Exception e) {
			// 地址有误时 -> java.io.IOException: 系统找不到指定的路径。
			System.out.println(e);
		}
	}
}
