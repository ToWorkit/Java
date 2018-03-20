package com.itstar.demo04;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节输出流，绑定文件
		FileOutputStream fos = new FileOutputStream("c:\\buffer.txt");
		//创建缓冲流
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//写一个字节
		bos.write(88);
		
		//写字节数组
		byte[] bytes = "itstar".getBytes();
		bos.write(bytes);
		bos.close();
		
	}
}
