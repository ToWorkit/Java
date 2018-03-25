package demo08;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 写入数据
 * 	写入数据到流中，字节缓冲输出流，BufferedOutputStream
 */

public class BufferedOutputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		// 创建缓冲流
		// 创建字节输出流(写入数据)，作为参数传入
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\a\\d.txt"));
		
		// 写一个字节
		bos.write(98);
		
		// 写字节数组
		// 转为字节数组
		byte[] bys = "Hello World".getBytes();
		bos.write(bys);
		bos.close();
	}
}
