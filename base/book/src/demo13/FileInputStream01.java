package demo13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {
	public static void main(String[] args) throws IOException {
		// ����������
		FileInputStream fis = new FileInputStream("F:\\a\\b.txt");
		int b;
		while((b = fis.read()) != -1) {
			// read()������ȡ����һ���ֽ�, ASCII��
/*			97
			98
			99
			100
			101
			102
			103*/
			System.out.println(b);
		}
		fis.close();
	}
}
