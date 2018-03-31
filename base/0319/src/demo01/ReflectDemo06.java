package demo01;

import java.lang.reflect.Field;

/*
 * ��������ȡ��Ա�����������޸�ֵ
 * 	Person���ԱString int
 */

public class ReflectDemo06 {
	public static void main(String[] args) throws Exception {
		// ��ȡ class
		Class c = Class.forName("demo01.Person");
		// ��Ա������ȡ, ֻ��ȡ���ó�Ա����
		Field[] files = c.getFields();
		for(Field f: files) {
			System.out.println(f);
		}
		System.out.println("===========");
		// ��ȡȫ����(˽�е�, ���յģ��ܱ�����...)
		Field[] files_on = c.getDeclaredFields();
		for(Field f_on: files_on) {
			System.out.println(f_on);
		}
		System.out.println("+++++++++++++++++++++");
		
		// ��ȡָ���ĳ�Ա����
		Field file_in = c.getField("name");
		System.out.println(file_in);
		
		// ���Ը�ֵ
		Object obj = c.newInstance();
		file_in.set(obj, "��ֵ");
		System.out.println(obj);
	}
}
