package demo13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @param args
 * * �ֽ�����ȡ���ĵ�����
		* �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� 
	* �ֽ���д�����ĵ�����
		* �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
		* д���س����� write("\r\n".getBytes());
 * @throws IOException 
 */

public class Chinese01 {
	public static void main(String[] args) throws Exception {
/*		FileOutputStream fos = new FileOutputStream("F:\\a\\a.txt");
		// �ֽڵ���ʽд��
		fos.write("�ţ���֪����".getBytes());
		fos.write("\r\n".getBytes());
		fos.write("��֪����".getBytes());
		fos.close();*/
		demo01();
	}
	
	public static void demo01() throws Exception {
		FileInputStream fis = new FileInputStream("F:\\a\\a.txt");
		byte[] arr = new byte[4];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.print(new String(arr, 0, len));
		}
		fis.close();
	}
}
