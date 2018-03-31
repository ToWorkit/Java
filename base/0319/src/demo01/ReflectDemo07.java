package demo01;

import java.lang.reflect.Method;

/*
 * 反射获取成员方法并运行
 */

public class ReflectDemo07 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("demo01.Person");
		// 获取所有的公共方法，包括继承的(一大堆)
		Method[] methods = c.getMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
		System.out.println("===================");
		// 获取指定的方法
		Method method = c.getMethod("eat");
		// 调用
		method.invoke(c.newInstance());		
	}
}
