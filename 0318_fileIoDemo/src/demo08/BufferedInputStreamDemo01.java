package demo08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * ������
 * 	��߳����ִ��Ч��
 * 	д�����ݵ����У��ֽڻ�����������BufferedInputStream
 */

public class BufferedInputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		// ����������
		// �����������ʽ����������Ϊ��������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\a\\b.txt"));
		
		// �ֽ�������ʽд�룬����Ϊ1024(ÿ�ζ�ȡ1024)
		byte[] b = new byte[1024];
		int len = 0;
		while((len = bis.read(b)) != -1) {
			System.out.println(new String(b, 0, len));
		}
		bis.close();
	}
}
