package demo05;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 处理异常
 */

public class FileOutPutStreamDemo03 {
	public static void main(String[] args) {
		// 解决作用域问题
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("F:\\a");
			fos.write(97);
		} catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("文件写入失败");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				throw new RuntimeException("关闭资源失败");
			}
		}
	}
}
