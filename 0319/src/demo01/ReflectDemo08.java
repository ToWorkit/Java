package demo01;


/*
 * 反射调用有参数的方法
 */

import java.lang.reflect.Method;

public class ReflectDemo08 {
	public static void main(String[] args) throws Exception {
		// 获取 class
		Class c = Class.forName("demo01.Person");
		
		// 获取有参方法
		Method method = c.getMethod("sleep", String.class, int.class);
		
		// c.newInstance 实例不能少
		
		method.invoke(c.newInstance(), "EN", 24);
	}
}
