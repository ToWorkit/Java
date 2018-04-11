package demo13;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 写数据
 * 没有创建，有则清空,可通过第二个参数(Boolean)改变为续写
 */

public class FileOutputStream01 {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("F:\\a\\b.txt", true);
		FileOutputStream fos = new FileOutputStream("F:\\a\\b.txt");
		// 写数据
		fos.write(29);
		fos.write(99);
		fos.write(101);
		fos.close();
	}
}
