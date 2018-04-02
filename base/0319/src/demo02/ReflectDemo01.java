package demo02;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 定义集合, 泛型
 * 反射的方式添加
 */

public class ReflectDemo01 {
	public static void main(String[] args) throws Exception, Exception {
		ArrayList<String > arr = new ArrayList<String>();
		arr.add("Hello");
		
		// 反射的方式
		Class c = arr.getClass();
		
		// 解析获取到add方法
		Method add_mt = c.getMethod("add", Object.class);
		
		// 添加方法
		add_mt.invoke(arr, 12);
		add_mt.invoke(arr, 12.98870);
		add_mt.invoke(arr, true);
		add_mt.invoke(arr, 'A');
		
		System.out.println(arr);
	}
}
