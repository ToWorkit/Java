package com.itstar.demo04;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File dir = new File("c:\\demo");
		getAllDir(dir);
	}
	
	//�㶨ȫ����
	public static void getAllDir(File dir) {
		//��dir����
		File[] filedir = dir.listFiles();
		for(File f:filedir) {
			//�ж�f�ǲ����ļ���
			if(f.isDirectory()) {
				getAllDir(f);
			}else {
				System.out.println(f);
			}
		}
	}
}
