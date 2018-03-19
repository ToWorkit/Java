package FileIoDemo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 读取文件
 * 	参数：
 * 		file类型对象
 * 		String对象
 * 
 * 输入流的使用：
 * 	1创建字节输入流的子类对象
 *  2调用读取方法
 *  3关闭资源
 */

public class FileInputStreamDemo01 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\a\\b.txt");
		// 每次只读一个字节
		// 字符自动转为ASCII码值
/*		int i = fis.read();
		System.out.println(i);*/
		
		int len = 0;
		// 读取不到返回-1
		while((len = fis.read()) != -1) {
			// 读取到的是ASCII强转为字符
			// 打印不换行
			System.out.print((char)len);
		}
	}
}
