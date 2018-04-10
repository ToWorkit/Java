package demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
 * 
 *  ����:
 * 1,��һ���˿�,��ʵ�����Լ�����һ�����϶���,���˿��ƴ洢��ȥ
 * 2,ϴ��
 * 3,����
 * 4,����
 */

public class RandomBrand02 {
	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"����","����","��Ƭ","÷��"};
		// �洢�������˿���
		HashMap<Integer, String> hm = new HashMap<>();
		// �洢����
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		
		// ƴ���˿��Ʋ����������˿��ƴ洢��hm��
		// ��ȡ����
		for (String s1: num) {
			// ��ȡ��ɫ
			for (String s2: color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				// ������ 0 �� 51 ��ӵ�list������
				index++;
			}
		}
		// С�������˫�м�����
		hm.put(index, "С��");
		list.add(index);
		
		// ����
		index++;
		hm.put(index, "����");
		list.add(index);
		
		// ϴ��
		Collections.shuffle(list);
		// ����
		TreeSet<Integer> one = new TreeSet<>();
		TreeSet<Integer> two = new TreeSet<>();
		TreeSet<Integer> dizhu = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for (int i = 0; i < list.size(); i ++) {
			if (i >= list.size() - 3) {
				dipai.add(list.get(i));
			} else if (i % 3 == 0) {
				one.add(list.get(i));
			} else if (i % 3 == 1) {
				two.add(list.get(i));
			} else {
				dizhu.add(list.get(i));
			}
		}
		
		// �鿴
		lookPoker(hm, dizhu, "����");
	}
	
	public static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
		System.out.println(name);
		for(Integer i: ts) {
			// i ����˫�м����е�ÿһ����
			System.out.println(hm.get(i));
		}
	}
}
