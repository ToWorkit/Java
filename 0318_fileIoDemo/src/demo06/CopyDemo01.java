package demo06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

/*
 * ������Դ��c:\\aa.txt
 * ���Ƶ���d:\\aa.txt ����Ŀ��
 * 
 * �ֽ���������������Դ
 * �ֽ��������������Ŀ��
 * 
 * ���룺��ȡһ���ֽ�
 * �����дһ���ֽ�
 * 
 *
 * �ֽ��������ļ�
 * 	�������黺�����Ч��
 *  �ֽ�����
 *  
 *  FileInputStream
 *  FileOutputStream
 */

public class CopyDemo01 {
	public static void main(String[] args) {
		// ��������������
		// ��������������
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// �����쳣
		try {
			// ����Դ Ҫcopy��
			fis = new FileInputStream("F:\\docker.rar");
			// ����Ŀ�� copy����
			fos = new FileOutputStream("F:\\a\\docker.rar");
			// �����ֽ�������Ϊ����
			byte[] bytes = new byte[1024];

			int len = 0;

			while ((len = fis.read(bytes)) != -1) {
				// �ֽ����黺�壬��0��ʼ������ len(����) ��д�� len(����)
				fos.write(bytes, 0, len);
			}
			System.out.println("���");
		} catch (IOException e) {
			System.out.println(e);
			throw new RuntimeException();
		} finally {
			// �����쳣
			try {
				// �����ݴ�����ٹر�
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("�ͷ���Դʧ��");
			} finally {
				try {
					// �����ݴ�����ٹر�
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					throw new RuntimeException("�ر�ʧ��");
				}
			}
		}
	}
}
