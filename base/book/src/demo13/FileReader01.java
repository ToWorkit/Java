package demo13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader01 {
	public static void main(String[] args) throws Exception {
/*		FileReader fr = new FileReader("F:\\a\\a.txt");
		int c;
		// ͨ��Ĭ�ϵ��ַ�����  һ�ζ�ȡһ���ַ�
		while((c = fr.read()) != -1) {
			// �ַ�����ǿתΪ�ַ�
			System.out.print((char)c);
		}
		fr.close();*/
		
		demo01();
	}
	public static void demo01() throws Exception {
		FileReader fr = new FileReader("F:\\a\\a.txt");
		// �����ַ����ַ�����
		int x = fr.read();
		System.out.println(x);
		char c = (char)x;
		System.out.println(c);
	}
}
