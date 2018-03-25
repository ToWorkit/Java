package demo07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class InputStreamReaderDemo01 {
	public static void main(String[] args) throws IOException {
		readUTF();
		readGBK();
	}
	
	/*
	 * 指定字符编码utf-8
	 */
	public static void readUTF() throws IOException {
		// 创建输入流
		FileInputStream fis = new FileInputStream("F:\\a\\b.txt");
		
		// 创建转换流对象
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		// 字符流读取
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch, 0, len));
		
		// 关闭
		isr.close();
	}
	
	/*
	 * 转换流，指定编码为 GBK, 默认编码
	 */
	public static void readGBK() throws IOException {
		// 创建输入流
		FileInputStream fis = new FileInputStream("F:\\a\\c.txt");
		// 创建转换流
		InputStreamReader isr = new InputStreamReader(fis, "gbk");
		
		char[] ch = new char[1024];
		int len = isr.read(ch);
		
		System.out.println(new String(ch, 0, len));
		
		// 关闭
		isr.close();
	}
}
