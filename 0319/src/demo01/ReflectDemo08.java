package demo01;


/*
 * ��������в����ķ���
 */

import java.lang.reflect.Method;

public class ReflectDemo08 {
	public static void main(String[] args) throws Exception {
		// ��ȡ class
		Class c = Class.forName("demo01.Person");
		
		// ��ȡ�вη���
		Method method = c.getMethod("sleep", String.class, int.class);
		
		// c.newInstance ʵ��������
		
		method.invoke(c.newInstance(), "EN", 24);
	}
}
