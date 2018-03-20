package demo06;

import java.io.FileReader;
import java.io.IOException;

/*
 * 字符流读取的超类
 * 	java.io.Reader
 * 	专注读取文本文件三十年
 * int read() 读取一个字节
 * int read(char[] c) 读取字符数组
 * 
 * Reader类属于抽象类，子类对象FileReader
 * 
 * 构造方法：绑定数据源
 * 	参数：
 * 		File 类型对象
 * 		String 文件名
 */

public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\a\\b.txt");
		
/*		int len = 0;
		while((len = fr.read()) != -1) {
			System.out.print((char)len);
		}*/
		
		// 字符数组读取
		char[] ch = new char[1024];
		int len = 0;
		while((len = fr.read(ch)) != -1) {
			// 此时len为字节
//			System.out.println(len);
			// 使用字节的 String 的重载方法 传入 字节数据 进行转字符串处理
			System.out.println(new String(ch, 0, len));
		}
		// 写完之后务必要关闭
		fr.close();
	}
}
