package demo05;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流：
 * 
 * 	java.io.OutputStream是所有字节输出流的超类
 *  作用：从java程序写出文件
 *  字节：每次操作文件值操作一个字节
 *  写任意文件
 *  
 *  方法都是写入文件的方法：
 *  	write(int b) 写入一个字节 
 *  	write(byte[] b) 写入的字节数组
 *  	write(byte[] b,int,int) 写入字节数组,int开始写入的索引,int写几个
 *  	close() 关闭流对象，释放与流相关的资源
 *  
 *  FileOutputStream
 *  	写入数据文件
 *  
 *  子类的构造方法：
 *  	参数：
 *  		File类型   	封装文件
 *  		String类型	字符串的文件名
 *  
 *  	流对象使用：
 *  		1.创建流子类对象
 *  		2.调用对象的方法write写
 *  		3.close释放资源
 *  
 */

public class FileOutPutStreamDemo01 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("F:\\a\\c.txt");
		// 调用write对象写数据
		fos.write(100);
		fos.write(99);
		fos.write(98);
		fos.write(97);
		
		// 写字节数组
		byte[] bytes = {65, 66, 67, 68, 69};
		fos.write(bytes);
		
		// 写字节数组的一部分
		fos.write(bytes, 1, 3);
		
		// 写入字符
		fos.write("Hello World".getBytes());
		
		// 必须关闭
		fos.close();
	}
}
