package demo13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * �ֽ�����
 */

public class ArrayCopy01 {
	public static void main(String[] args) throws Exception {
		// ������
		FileInputStream fis = new FileInputStream("F:\\spark____\\01����һ�׶�java����(27��)\\day20\\day20\\code\\day20\\���ഺ.mp3");
		// д����
		FileOutputStream fos = new FileOutputStream("F:\\a\\���ഺ01.mp3");
		
		// �ֽ�����
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1) {
			// д��
			fos.write(arr, 0, len);
		}
		fis.close();
		fos.close();
	}
}
