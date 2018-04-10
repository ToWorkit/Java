package demo09;

import java.util.HashMap;

/*
 * ����Ƕ��֮HashMapǶ��HashMap
 */

public class HashMapTwo {
	public static void main(String[] args) {
		// һ��
		HashMap<Student, String> one = new HashMap<>();
		one.put(new Student("a", 12), "����");
		one.put(new Student("d", 11), "����");
		one.put(new Student("c", 11), "����");
		one.put(new Student("b", 10), "����");
		
		// ����
		HashMap<Student, String> two = new HashMap<>();
		two.put(new Student("e", 21), "�ð�");
		two.put(new Student("f", 20), "�ð�"); 
		two.put(new Student("h", 23), "�ð�"); 
		two.put(new Student("g", 19), "�ð�"); 
		
		// �����꼶(�༯��)
		HashMap<HashMap<Student, String>, String> con = new HashMap<>();
		con.put(one, "һ��");
		con.put(two, "����");
/*		{
			{
				Student [namea, age=12]=����, 
				Student [namec, age=11]=����, 
				Student [nameb, age=10]=����, 
				Student [named, age=11]=����
			}=һ��, 
			{
				Student [namee, age=21]=�ð�, 
				Student [nameh, age=23]=�ð�, 
				Student [namef, age=20]=�ð�, 
				Student [nameg, age=19]=�ð�
			}=����
		}*/
//		System.out.println(con);
		
		// ����˫�м���
		// keySet -> ˫�м����м��ļ���
		for(HashMap<Student, String> k: con.keySet()) {
			// con.get(k) -> ���ݼ������ȡֵ����
			String value = con.get(k);
			// ��������˫�м��϶���
			// k.keySet() -> ��ȡ���������е�ѧ��������
			for(Student key: k.keySet()) {
				String value2 = k.get(key);
				System.out.println(key + "=" + value2 + "=" + value);
			}
		}
	}
}
