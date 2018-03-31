package demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * ͨ�������ļ��ķ�ʽ��
 * 	���������ͷ��������Լ�ֵ�Ե���ʽ�洢���ļ���
 *  �����Ǹ��࣬��ȡ���Ӧ�������ļ��Ϳ�����
 *  
 * ʵ�ֲ��裺
 * 	1.׼�������ļ� -> ��ֵ��
 *  2.IO����ȡ�����ļ� -> Reader
 *  3.�ļ��м�ֵ�Դ洢������ Properties
 *    	���ϱ���ļ�ֵ��  ����->������
 *  4.�����ȡָ����class�ļ�����
 *  5.class�ļ����󣬻�ȡ����
 *  6.���з���
 */

public class Test {
	public static void main(String[] args) throws Exception {
		// ��ȡ�����ļ�
		FileReader r = new FileReader("config.properties");
		
		// �洢�����ļ��еļ�ֵ��
		Properties pro = new Properties();
		// ���������ļ�
		pro.load(r);
		
		// ��ȡ��ֵ
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		// ���������ļ��е�className��ȡ��Ӧ�� .class �ļ�
		Class c = Class.forName(className);
		Object obj = c.newInstance();
/*		Student s = (Student)obj;
		s.study();*/
		// ���������ļ��е�methodName��ȡ��Ӧ�� ����
		Method method = c.getMethod(methodName);
//		Object obj = c.newInstance();
		method.invoke(c.newInstance());
	}
}
