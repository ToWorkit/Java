package demo06;

import java.io.FileReader;
import java.io.IOException;

/*
 * �ַ�����ȡ�ĳ���
 * 	java.io.Reader
 * 	רע��ȡ�ı��ļ���ʮ��
 * int read() ��ȡһ���ֽ�
 * int read(char[] c) ��ȡ�ַ�����
 * 
 * Reader�����ڳ����࣬�������FileReader
 * 
 * ���췽����������Դ
 * 	������
 * 		File ���Ͷ���
 * 		String �ļ���
 */

public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\a\\b.txt");
		
/*		int len = 0;
		while((len = fr.read()) != -1) {
			System.out.print((char)len);
		}*/
		
		// �ַ������ȡ
		char[] ch = new char[1024];
		int len = 0;
		while((len = fr.read(ch)) != -1) {
			// ��ʱlenΪ�ֽ�
//			System.out.println(len);
			// ʹ���ֽڵ� String �����ط��� ���� �ֽ����� ����ת�ַ�������
			System.out.println(new String(ch, 0, len));
		}
		// д��֮�����Ҫ�ر�
		fr.close();
	}
}
