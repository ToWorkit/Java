package demo11;

import java.io.File;
import java.io.IOException;

/**
 * * A:��������
		* public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
		* public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
		* public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
	* B:������ʾ
		* File��Ĵ�������
	
		* ע�����
			* ����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
 * @throws IOException 
 */

public class File02 {
	public static void main(String[] args) throws IOException {
/*		// ����Ŀ¼
		File dir01 = new File("F:\\aaa");
		System.out.println(dir01.mkdir());
		
		// �����༶Ŀ¼
		File dir02 = new File("F:\\aa\\cc");
		System.out.println(dir02.mkdirs());*/
		
		demo01();
	}
	
	public static void demo01() throws IOException {
		try {
			File file = new File("F:\\cca\\test.txt");
			System.out.println(file.createNewFile());
		} catch(Exception e) {
			// ��ַ����ʱ -> java.io.IOException: ϵͳ�Ҳ���ָ����·����
			System.out.println(e);
		}
	}
}
