package demo13;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * д����
 * û�д������������,��ͨ���ڶ�������(Boolean)�ı�Ϊ��д
 */

public class FileOutputStream01 {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("F:\\a\\b.txt", true);
		FileOutputStream fos = new FileOutputStream("F:\\a\\b.txt");
		// д����
		fos.write(29);
		fos.write(99);
		fos.write(101);
		fos.close();
	}
}
