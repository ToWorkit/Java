package demo07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 转换流
 * 		java.io.OutputStreamWirter  继承了writer
 * 		就是一个字节输出流，写文本文件
 * 		
 * writer() 字符，字符数组，字符串
 * 
 * 字符转向字节的桥梁，将字符流转换为字节流
 * 
 * OutputStreamWriter使用方式
 * 	构造方法：OutputStreamWriter(OutputStream out) 
 * 			字节输出流：FileOutputStream
 * OutputStreamWriter(OutputStream out, String charsetName) 
 *     传递编码表名字 GBK UTF-8
 *  FileWriter子类：采用理想情况，系统采用是什么就是什么
 *  
 * OutputStreamWriter可以指定编码表
 */

public class OutputStreamWriterDemo01 {
	public static void main(String[] args) throws IOException {
		writeUTF();
	}
	
	/*
	 * 转换流写文本(utf-8)
	 */
	public static void writeUTF() throws IOException {
		// 创建字节流对象, true 可续写
		FileOutputStream fos = new FileOutputStream("F:\\a\\c.txt", true);
		// 创建转换流对象，指定编码
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		
		// 转换流写入数据
		osw.write("我饿了");
		// 记得关闭
		osw.close();
	}
}
