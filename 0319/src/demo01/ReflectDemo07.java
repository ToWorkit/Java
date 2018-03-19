package demo01;

import java.lang.reflect.Method;

/*
 * �����ȡ��Ա����������
 */

public class ReflectDemo07 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("demo01.Person");
		// ��ȡ���еĹ��������������̳е�(һ���)
		Method[] methods = c.getMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
		System.out.println("===================");
		// ��ȡָ���ķ���
		Method method = c.getMethod("eat");
		// ����
		method.invoke(c.newInstance());		
	}
}
