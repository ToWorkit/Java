package com.itstar.demo05;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
	public static void main(String[] args) {
		//提升作用域
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:\\demo.txt");
			fos.write(97);
		}catch(IOException ex) {
			
			System.out.println(ex.getMessage());
			throw new RuntimeException("文件写入失败，请重新尝试");
		}finally {
			
			try {
				if(fos != null)
					fos.close();
			}catch(IOException ex) {
				throw new RuntimeException("关闭资源失败");
			}
		}
	}
}
