package demo11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * * A:��ȡ����
	* public String getAbsolutePath()����ȡ����·��
	* public String getPath():��ȡ·��
	* public String getName():��ȡ����
	* public long length():��ȡ���ȡ��ֽ���
	* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
 */

public class File04 {
	public static void main(String[] args) {
		File dir = new File("F:\\a");
		// ��ȡ�ļ���
		String[] arr = dir.list();
		for (String st: arr) {
			System.out.println(st);
		}
		
		// �ļ�����
		File[] subFiles = dir.listFiles();
		for (File fl: subFiles) {
			System.out.println(fl);
		}
		
		File file01 = new File("F:\\a\\b.txt");
		// �ļ�����޸�ʱ��
		Date d = new Date(file01.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��mm��dd�� HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}
