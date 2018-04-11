package demo13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy01 {
	public static void main(String[] args) throws Exception {
		demo02();
	}
	
	public static void demo02() throws Exception {
		// 创建输入流对象(读数据)
		FileInputStream fis = new FileInputStream("F:\\spark____\\01、第一阶段java基础(27天)\\day20\\day20\\code\\day20\\致青春.mp3");
		// 创建输出流对象(写数据)
		FileOutputStream fos = new FileOutputStream("F:\\a\\致青春.mp3");
		
		// 文件大小
		int len = fis.available();
		System.out.println(len);
		
		// 这种操作有可能会导致内存溢出
		// 创建与文件一样大小的字节数组 
		byte[] arr = new byte[fis.available()];
		// 将文件上的字节读取到内存中
		fis.read(arr);
		// 将字节数组中的字节数据写到文件上
		fos.write(arr);
		fis.close();
		fos.close();
	}
	
	public static void demo01() throws Exception {
		// 创建输入流对象(读数据)
		FileInputStream fis = new FileInputStream("F:\\spark____\\01、第一阶段java基础(27天)\\day20\\day20\\code\\day20\\双元.jpg");
		// 创建输出流对象(写数据)
		FileOutputStream fos = new FileOutputStream("F:\\a\\双元.jpg");
		
		int b;
		// 不断的读取每一个字节
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}
}
