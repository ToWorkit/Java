package com.itstar.demo03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

/*
 * 转换流：
 * 		java.io.InputStreamReader 继承Reader
 * 	字节流向字符流的桥梁，将字节流转换为字符流
 * 
 *  读取的方法：
 *  	read() 读取一个字节，读取字符数组
 *  
 *  技巧：
 *  	OutputStreamWriter 写了文件
 *  	InputStreamReader 读文件
 *  
 *  	OutputStreamWriter(OutputStream out)所有字节输出流
 *      InputStreamReader(InputStream in) 接收所有的字节输入流
 *      
 *      	可以传递的字节输入流：FileInputStream
 *      InputStreamReader(InputStream in, String charsetName) 
 *      传递编码表
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//readGBK();
		readUTF();
	}
	/*
	 * 指定字符编码utf-8
	 */
	public static void readUTF() throws IOException {
		//创建输入流
		FileInputStream fis = new FileInputStream("c:\\UTF.txt");
		
		//创建转换流对象
		InputStreamReader isr =  new InputStreamReader(fis,"UTF-8");
		
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch,0,len));
		isr.close();
	}
	
	/*
	 * 转换流，InputStreamReader
	 * 指定字符编码 GBK
	 * 默认的GBK
	 */
	
	public static void readGBK() throws IOException {
		//创建输入流
		FileInputStream fis = new FileInputStream("c:\\UTF.txt");
		
		//创建转换流对象
		InputStreamReader isr =  new InputStreamReader(fis);
		
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch,0,len));
		isr.close();
	}
}
