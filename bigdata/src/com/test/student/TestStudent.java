package com.test.student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestStudent {
	public static void main(String[] args) throws Exception {
		// ����һ��ѧ�����󣬲��ұ��浽�ļ�
		Student s = new Student();
		s.setStuID(1);
		s.setStuName("Hello");
		
		// ����һ��������������ѧ�����浽�ļ�
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:\\temp\\student.txt"));
		out.writeObject(s);
		
		// �ر������
		out.close();
	}
}
