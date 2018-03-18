package demo03;

import java.util.HashMap;
import java.util.Map;

/*
 * Map �ӿ��г��õķ���
 * 	��Ҫʹ��Map�ӿڵ�ʵ����HashMap 
 * 	key Ψһ
 */

public class MapDemo01 {
	public static void main(String[] args) {
//		fun();
//		fun_01();
		fun_02();
	}
	
	/*
	 * V remove(Object key) �Ƴ������еļ�ֵ��
	 */
	public static void fun() {
		// key, value
		// ʵ����HashMap
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "x");
		_map.put(1, "a");
		_map.put(2, "b");
		_map.put(3, "c");
		// {0=x, 1=a, 2=b, 3=c}
		System.out.println(_map);
		
		// ͨ�����Ƴ�
		String st = _map.remove(2);
		// �����Ƴ��ļ���Ӧ��ֵ
		// b
		System.out.println(st);
		// {0=x, 1=a, 3=c}
		System.out.println(_map);
	}
	
	/*
	 * V get(Object key) ͬ���������ȡֵ
	 */
	public static void fun_01() {
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "q");
		_map.put(1, "w");
		_map.put(2, "e");
		_map.put(3, "r");
		
		// ͨ������ȡֵ
		String s = _map.get(2);
		// e
		System.out.println(s);
	}
	
	/*
	 * ����Ψһ�ģ��ظ���ֵʱ�����ֵ�Ḳ��ǰ���
	 */
	public static void fun_02() {
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "p");
		_map.put(1, "i");
		_map.put(2, "t");
		// �Ḳ�������
		_map.put(0, "l");
		// {0=l, 1=i, 2=t}
		System.out.println(_map);
	}
}
