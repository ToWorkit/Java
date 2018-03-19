package FileIoDemo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 字节数组读取文件
 * 提升效率
 */

public class FileInputStreamDemo02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\a\\b.txt");
	}
}
