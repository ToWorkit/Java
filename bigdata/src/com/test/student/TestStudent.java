package com.test.student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestStudent {
	public static void main(String[] args) throws Exception {
		// 创建一个学生对象，并且保存到文件
		Student s = new Student();
		s.setStuID(1);
		s.setStuName("Hello");
		
		// 创建一个输出流，把这个学生保存到文件
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:\\temp\\student.txt"));
		out.writeObject(s);
		
		// 关闭输出流
		out.close();
	}
}
