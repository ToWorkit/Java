package com.itstar.demo03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * ת����
 * 		java.io.OutputStreamWirter  �̳���writer
 * 		����һ���ֽ��������д�ı��ļ�
 * 		
 * writer() �ַ����ַ����飬�ַ���
 * 
 * �ַ�ת���ֽڵ����������ַ���ת��Ϊ�ֽ���
 * 
 * OutputStreamWriterʹ�÷�ʽ
 * 	���췽����OutputStreamWriter(OutputStream out)  �������е��ֽ������
 * 			ѧ�����ֽ��������FileOutputStream
 * OutputStreamWriter(OutputStream out, String charsetName) 
 *     ���ݱ�������� GBK UTF-8
 *  FileWriter���ࣺ�������������ϵͳ������ʲô����ʲô
 *  
 * OutputStreamWriter����ָ�������
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//writeGBK();
		writeUTF();
	}
	
	
	/*
	 * ת����д�ı�
	 * ����utf-8д
	 */
	public static void writeUTF() throws IOException {
		//�����ֽ�������
		FileOutputStream fos = new FileOutputStream("c:\\UTF.txt");
		//����ת��������
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		
		//ת����д����
		osw.write("���ڸ���");
		//�ر���Դ
		osw.close();
	}
	
	/*
	 * ת��������OutputStreamWriterд�ı�
	 * ����GBKд��
	 */
	public static void writeGBK() throws IOException {
		//�����ֽ�������
		FileOutputStream fos = new FileOutputStream("c:\\GBK.txt");
		//����ת��������
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		//ת����д����
		osw.write("���ڸ���");
		osw.close();
	}
}
