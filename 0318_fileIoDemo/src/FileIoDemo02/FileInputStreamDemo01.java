package FileIoDemo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * ��ȡ�ļ�
 * 	������
 * 		file���Ͷ���
 * 		String����
 * 
 * ��������ʹ�ã�
 * 	1�����ֽ����������������
 *  2���ö�ȡ����
 *  3�ر���Դ
 */

public class FileInputStreamDemo01 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\a\\b.txt");
		// ÿ��ֻ��һ���ֽ�
		// �ַ��Զ�תΪASCII��ֵ
/*		int i = fis.read();
		System.out.println(i);*/
		
		int len = 0;
		// ��ȡ��������-1
		while((len = fis.read()) != -1) {
			// ��ȡ������ASCIIǿתΪ�ַ�
			// ��ӡ������
			System.out.print((char)len);
		}
	}
}
