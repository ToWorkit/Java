package demo07;

import java.io.FileOutputStream;
import java.io.IOException;
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
 * 	���췽����OutputStreamWriter(OutputStream out) 
 * 			�ֽ��������FileOutputStream
 * OutputStreamWriter(OutputStream out, String charsetName) 
 *     ���ݱ�������� GBK UTF-8
 *  FileWriter���ࣺ�������������ϵͳ������ʲô����ʲô
 *  
 * OutputStreamWriter����ָ�������
 */

public class OutputStreamWriterDemo01 {
	public static void main(String[] args) throws IOException {
		writeUTF();
	}
	
	/*
	 * ת����д�ı�(utf-8)
	 */
	public static void writeUTF() throws IOException {
		// �����ֽ�������, true ����д
		FileOutputStream fos = new FileOutputStream("F:\\a\\c.txt", true);
		// ����ת��������ָ������
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		
		// ת����д������
		osw.write("�Ҷ���");
		// �ǵùر�
		osw.close();
	}
}
