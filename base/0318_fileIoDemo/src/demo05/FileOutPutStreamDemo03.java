package demo05;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����쳣
 */

public class FileOutPutStreamDemo03 {
	public static void main(String[] args) {
		// �������������
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("F:\\a");
			fos.write(97);
		} catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("�ļ�д��ʧ��");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				throw new RuntimeException("�ر���Դʧ��");
			}
		}
	}
}
