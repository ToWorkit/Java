package com.itstar.demo04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new 
				BufferedInputStream(new FileInputStream("c:\\Buffer.txt"));
		byte[] b = new byte[1024];
		int len = 0;
		while((len = bis.read(b))!=-1) {
			System.out.println(new String(b,0,len));
		}
		
		bis.close();
	}
}
