package demo06;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������
 *  java.io.Writer �����ַ�������ĳ���
 * д�ļ���д�ı��ļ��������ԣ�
 * 
 * д�ķ���Write
 * write(int c) дһ���ַ�
 * write(char[] c)д�ַ�����
 * write(char[] c,int,int) �ַ������һ���� ����ʼ������д����
 * write(String s) д���ַ���
 * 
 * writer��������� FileWriter
 * 		file ���Ͷ���
 * 		String �ļ���
 * 
 * �ַ������д���ݵ�ʱ�򣬱���Ҫ����һ������ ��ˢ�¹���
 * flush
 */

public class WriteDemo01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("F:\\a\\c.txt");
		
		// дһ���ַ� ASCII ��ֵ
		fw.write(100);
		fw.flush();
		
		// д���ַ�����
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		fw.write(arr);
		fw.flush();
		
		// �ַ������һ���֣���ʼλ�ã�д������
		fw.write(arr, 1, 2);
		fw.flush();
		
		// д���ַ�
		fw.write("Hello World");
		fw.flush();
		
		fw.close();
	}
}
