package FileIODemo01;

import java.io.File;

/*
 * File��Ļ�ȡ���ļ���ȡ������
 * �����ļ�Ŀ¼��ʱ�򣬸�����������ȡ�����������ļ�
 * ����Ŀ¼��listFiles()
 * listFiles(FileFilter filter)�ļ��Ĺ���
 * ������FileFilter�ӿڵ�ʵ����
 */

public class FIleDemo {
	public static void main(String[] args) {
		File file = new File("F:\\a");
		// ��ȡ��ʱ����ļ����й���
		File[] fileArr = file.listFiles(new MyFilter());
		for (File f: fileArr) {
			System.out.println(f);
		}
	}
}
