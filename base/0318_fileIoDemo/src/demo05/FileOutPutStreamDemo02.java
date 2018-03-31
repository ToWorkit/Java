package demo05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 文件续写和换行
 */

public class FileOutPutStreamDemo02 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\a\\d.txt");
		// 续写
		FileOutputStream fos = new FileOutputStream(file, true);
		
		fos.write("Hello \r\n".getBytes());
		fos.write("World".getBytes());
		fos.close();
	}
}
