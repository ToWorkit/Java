package demo03;

import java.util.HashMap;

/*
 * Map����Ƕ�׼��ϣ�Map�д洢�Ļ���Map
 */

public class MapMapDemo {
	public static void main(String[] args) {
		// �з���
		HashMap<Integer, String> develop = new HashMap<Integer, String>();
		// ��Ӫ��
		HashMap<Integer, String> operations = new HashMap<Integer, String>();
		
		develop.put(909, "Java");
		develop.put(809, "Python");
		
		operations.put(1010, "С��");
		operations.put(1011, "С��");
		
		// ��˾
		HashMap<String, HashMap<Integer, String>> boos = new HashMap<String, HashMap<Integer, String>>();
		boos.put("�з���", develop);
		boos.put("��Ӫ��", operations);
		System.out.println(boos);
	}
}
