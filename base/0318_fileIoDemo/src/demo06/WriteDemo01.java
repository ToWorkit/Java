package demo06;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流
 *  java.io.Writer 所有字符输出流的超类
 * 写文件，写文本文件（局限性）
 * 
 * 写的方法Write
 * write(int c) 写一个字符
 * write(char[] c)写字符数组
 * write(char[] c,int,int) 字符数组的一部分 ，开始索引，写几个
 * write(String s) 写入字符串
 * 
 * writer的子类对象 FileWriter
 * 		file 类型对象
 * 		String 文件名
 * 
 * 字符输出流写数据的时候，必须要运行一个功能 ，刷新功能
 * flush
 */

public class WriteDemo01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("F:\\a\\c.txt");
		
		// 写一个字符 ASCII 码值
		fw.write(100);
		fw.flush();
		
		// 写入字符数组
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		fw.write(arr);
		fw.flush();
		
		// 字符数组的一部分，开始位置，写的数量
		fw.write(arr, 1, 2);
		fw.flush();
		
		// 写入字符
		fw.write("Hello World");
		fw.flush();
		
		fw.close();
	}
}
