package FileIoDemo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * �ֽ������ȡ�ļ�
 * ����Ч��
 */

public class FileInputStreamDemo02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\a\\b.txt");
		// �����ֽ�����
		byte[] b = new byte[2];
		int len = fis.read(b);

		// �����ֽڵ�String����
		System.out.println(new String(b));
		System.out.println(len);

		len = fis.read(b);

		// �����ֽڵ�String����
		System.out.println(new String(b));
		System.out.println(len);

		len = fis.read(b);

		// �����ֽڵ�String����
		System.out.println(new String(b));
		System.out.println(len);

		len = fis.read(b);

		// �����ֽڵ�String����
		System.out.println(new String(b));
		System.out.println(len);
		
		len = fis.read(b);

		// �����ֽڵ�String����
		System.out.println(new String(b));
		System.out.println(len);
		// abcdefg
	}
}
