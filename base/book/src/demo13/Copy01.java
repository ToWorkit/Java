package demo13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy01 {
	public static void main(String[] args) throws Exception {
		demo02();
	}
	
	public static void demo02() throws Exception {
		// ��������������(������)
		FileInputStream fis = new FileInputStream("F:\\spark____\\01����һ�׶�java����(27��)\\day20\\day20\\code\\day20\\���ഺ.mp3");
		// �������������(д����)
		FileOutputStream fos = new FileOutputStream("F:\\a\\���ഺ.mp3");
		
		// �ļ���С
		int len = fis.available();
		System.out.println(len);
		
		// ���ֲ����п��ܻᵼ���ڴ����
		// �������ļ�һ����С���ֽ����� 
		byte[] arr = new byte[fis.available()];
		// ���ļ��ϵ��ֽڶ�ȡ���ڴ���
		fis.read(arr);
		// ���ֽ������е��ֽ�����д���ļ���
		fos.write(arr);
		fis.close();
		fos.close();
	}
	
	public static void demo01() throws Exception {
		// ��������������(������)
		FileInputStream fis = new FileInputStream("F:\\spark____\\01����һ�׶�java����(27��)\\day20\\day20\\code\\day20\\˫Ԫ.jpg");
		// �������������(д����)
		FileOutputStream fos = new FileOutputStream("F:\\a\\˫Ԫ.jpg");
		
		int b;
		// ���ϵĶ�ȡÿһ���ֽ�
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}
}
