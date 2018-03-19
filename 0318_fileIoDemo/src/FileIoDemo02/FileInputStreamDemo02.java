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
		// 创建字节数组
		byte[] b = new byte[2];
		int len = fis.read(b);

		// 调用字节的String方法
		System.out.println(new String(b));
		System.out.println(len);

		len = fis.read(b);

		// 调用字节的String方法
		System.out.println(new String(b));
		System.out.println(len);

		len = fis.read(b);

		// 调用字节的String方法
		System.out.println(new String(b));
		System.out.println(len);

		len = fis.read(b);

		// 调用字节的String方法
		System.out.println(new String(b));
		System.out.println(len);
		
		len = fis.read(b);

		// 调用字节的String方法
		System.out.println(new String(b));
		System.out.println(len);
		// abcdefg
	}
}
