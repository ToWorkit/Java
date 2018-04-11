package demo13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @param args
 * * 字节流读取中文的问题
		* 字节流在读中文的时候有可能会读到半个中文,造成乱码 
	* 字节流写出中文的问题
		* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
		* 写出回车换行 write("\r\n".getBytes());
 * @throws IOException 
 */

public class Chinese01 {
	public static void main(String[] args) throws Exception {
/*		FileOutputStream fos = new FileOutputStream("F:\\a\\a.txt");
		// 字节的形式写入
		fos.write("嗯，我知道了".getBytes());
		fos.write("\r\n".getBytes());
		fos.write("我知道了".getBytes());
		fos.close();*/
		demo01();
	}
	
	public static void demo01() throws Exception {
		FileInputStream fis = new FileInputStream("F:\\a\\a.txt");
		byte[] arr = new byte[4];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.print(new String(arr, 0, len));
		}
		fis.close();
	}
}
