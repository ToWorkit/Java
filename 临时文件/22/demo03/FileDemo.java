package com.itstar.demo03;

import java.io.File;

/*
 * File��Ļ�ȡ���ļ���ȡ������
 * �����ļ�Ŀ¼��ʱ�򣬸�����������ȡ�����������ļ�
 * ����Ŀ¼��listFiles()
 * listFiles(FileFilter filter)�ļ��Ĺ���
 * ������FileFilter�ӿڵ�ʵ����
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("c:\\demo");
		File[] fileArr = file.listFiles(new MyFilter());
		for(File f:fileArr) {
			
			System.out.println(f);
		}
	}
}
