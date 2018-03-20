package demo08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 缓冲流
 * 	提高程序的执行效率
 * 	写入数据到流中，字节缓冲输入流，BufferedInputStream
 */

public class BufferedInputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		// 创建缓冲流
		// 匿名对象的形式将输入流作为参数传入
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\a\\b.txt"));
		
		// 字节数组形式写入，长度为1024(每次读取1024)
		byte[] b = new byte[1024];
		int len = 0;
		while((len = bis.read(b)) != -1) {
			System.out.println(new String(b, 0, len));
		}
		bis.close();
	}
}
