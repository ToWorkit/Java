package demo02;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ���弯��, ����
 * ����ķ�ʽ���
 */

public class ReflectDemo01 {
	public static void main(String[] args) throws Exception, Exception {
		ArrayList<String > arr = new ArrayList<String>();
		arr.add("Hello");
		
		// ����ķ�ʽ
		Class c = arr.getClass();
		
		// ������ȡ��add����
		Method add_mt = c.getMethod("add", Object.class);
		
		// ��ӷ���
		add_mt.invoke(arr, 12);
		add_mt.invoke(arr, 12.98870);
		add_mt.invoke(arr, true);
		add_mt.invoke(arr, 'A');
		
		System.out.println(arr);
	}
}
