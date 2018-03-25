package demo06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

/*
 * 将数据源：c:\\aa.txt
 * 复制到：d:\\aa.txt 数据目的
 * 
 * 字节输入流：绑定数据源
 * 字节输出流：绑定数据目的
 * 
 * 输入：读取一个字节
 * 输出：写一个字节
 * 
 *
 * 字节流复制文件
 * 	采用数组缓冲提高效率
 *  字节数组
 *  
 *  FileInputStream
 *  FileOutputStream
 */

public class CopyDemo01 {
	public static void main(String[] args) {
		// 定义两个流对象
		// 处理作用域问题
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 处理异常
		try {
			// 数据源 要copy的
			fis = new FileInputStream("F:\\docker.rar");
			// 数据目的 copy到的
			fos = new FileOutputStream("F:\\a\\docker.rar");
			// 定义字节数组作为缓冲
			byte[] bytes = new byte[1024];

			int len = 0;

			while ((len = fis.read(bytes)) != -1) {
				// 字节数组缓冲，从0开始，读了 len(多少) 就写入 len(多少)
				fos.write(bytes, 0, len);
			}
			System.out.println("完成");
		} catch (IOException e) {
			System.out.println(e);
			throw new RuntimeException();
		} finally {
			// 处理异常
			try {
				// 有数据传输过再关闭
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("释放资源失败");
			} finally {
				try {
					// 有数据传输过再关闭
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					throw new RuntimeException("关闭失败");
				}
			}
		}
	}
}
