package demo13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 字节数组
 */

public class ArrayCopy01 {
	public static void main(String[] args) throws Exception {
		// 读数据
		FileInputStream fis = new FileInputStream("F:\\spark____\\01、第一阶段java基础(27天)\\day20\\day20\\code\\day20\\致青春.mp3");
		// 写数据
		FileOutputStream fos = new FileOutputStream("F:\\a\\致青春01.mp3");
		
		// 字节数组
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1) {
			// 写入
			fos.write(arr, 0, len);
		}
		fis.close();
		fos.close();
	}
}
