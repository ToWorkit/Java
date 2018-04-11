package demo13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader01 {
	public static void main(String[] args) throws Exception {
/*		FileReader fr = new FileReader("F:\\a\\a.txt");
		int c;
		// 通过默认的字符编码  一次读取一个字符
		while((c = fr.read()) != -1) {
			// 字符编码强转为字符
			System.out.print((char)c);
		}
		fr.close();*/
		
		demo01();
	}
	public static void demo01() throws Exception {
		FileReader fr = new FileReader("F:\\a\\a.txt");
		// 单个字符的字符编码
		int x = fr.read();
		System.out.println(x);
		char c = (char)x;
		System.out.println(c);
	}
}
