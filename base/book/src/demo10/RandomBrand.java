package demo10;

import java.util.ArrayList;
import java.util.Collections;

/*
* ģ�⶷����ϴ�ƺͷ��ƣ���û������
* 
* ����:
* 1,��һ���˿�,��ʵ�����Լ�����һ�����϶���,���˿��ƴ洢��ȥ
* 2,ϴ��
* 3,����
* 4,����
*/
public class RandomBrand {
	public static void main(String[] args) {
		// 1, ��������
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"����", "����", "��Ƭ", "÷��"};
		// ��������
		ArrayList<String> poker = new ArrayList<>();
		
		// ƴ�ӻ�ɫ������
		for(String n: num) {
			for(String c: color) {
				// ���Ӳ����
				poker.add(n.concat(c));
			}
		}
//		System.out.println(poker);
		// ��С��
		poker.add("����");
		poker.add("С��");
		// 2, ϴ�� shuffle -> ϴ��(��mapReduce���� �� map �� reduce �Ĺ���)
		Collections.shuffle(poker);
		// 3, ����
		ArrayList<String> dizhu = new ArrayList<>();
		ArrayList<String> one = new ArrayList<>();
		ArrayList<String> two = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for(int i = 0; i < poker.size(); i++) {
			if (i >= poker.size() - 3) {
				// ����
				dipai.add(poker.get(i));
			} else if (i % 3 == 0) {
				one.add(poker.get(i));
			} else if (i % 3 == 1) {
				two.add(poker.get(i));
			} else {
				dizhu.add(poker.get(i));
			}
		}
		
		// 4, �鿴
		System.out.println(dizhu);
		System.out.println(one);
		System.out.println(two);
		System.out.println(dipai);
	}
}
