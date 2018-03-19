package com.itstar.demo03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * ͨ�������ļ��ķ�ʽ��
 * 	���������ͷ��������Լ�ֵ�Ե���ʽ�洢���ļ���
 *  �����Ǹ��ۣ���ȡ��������ļ��Ϳ�����
 *  
 * ʵ�ֲ��裺
 * 	1.׼�������ļ� ��ֵ��
 *  2.IO����ȡ�����ļ� Reader
 *  3.�ļ��м�ֵ�Դ洢������ Properties
 *    ���ϱ���ļ�ֵ��  ����->������
 *  4.�����ȡָ����class�ļ�����
 *  5.class�ļ����󣬻�ȡ����
 *  6.���з���
 */
public class Test {
	public static void main(String[] args) throws Exception {
		//io����ȡ�����ļ�
		FileReader r = new FileReader("config.properties");
		
		//�洢������ ��ֵ��
		// String getProperty(String key) 
		Properties pro = new Properties();
		//���������ļ�
		pro.load(r);
		//�ر���
		
		String classname = pro.getProperty("className");
		String methodname = pro.getProperty("methodName");
		
		//�õ�class�ļ�����
		Class c = Class.forName(classname);
		
		//��ȡָ���ķ�����
		Object obj = c.newInstance();
		Method method = c.getMethod(methodname);
		method.invoke(obj);
	}
}
