package demo08;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * д������
 * 	д�����ݵ����У��ֽڻ����������BufferedOutputStream
 */

public class BufferedOutputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		// ����������
		// �����ֽ������(д������)����Ϊ��������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\a\\d.txt"));
		
		// дһ���ֽ�
		bos.write(98);
		
		// д�ֽ�����
		// תΪ�ֽ�����
		byte[] bys = "Hello World".getBytes();
		bos.write(bys);
		bos.close();
	}
}
