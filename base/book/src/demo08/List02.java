package demo08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * ��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ���ظ�
 * 
 * ����:
 * 1,����һ��List����,���洢�ظ���������ַ���
 * 2,���巽�������������ظ�
 * 3,��ӡList����
 */


public class List02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffffff");
		list.add("heima");
		list.add("itcast");
		list.add("bbbb");
		list.add("aaa");
		list.add("aaa");
		// ���򲢱����ظ�
		sort(list);
		// ��ӡ
		System.out.println(list);
	}
	
	/*
	 * ���巽��,���򲢱����ظ�
	 * ����:
	 * 1,����TreeSet���϶���,��ΪString����;߱��ȽϹ���,�����ظ����ᱣ��,���������ñȽ���
	 * 2,��list���������е�Ԫ����ӵ�TrreSet������,��������,�����ظ�
	 * 3,���list����
	 * 4,��TreeSet�������ź����Ԫ����ӵ�list��
	 */
	public static void sort(List<String> list) {
		// ʹ�ñȽ�����������
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// �Ƚ�����
				int num = s1.compareTo(s2);
				System.out.println(num);
				// �����ظ�
				return num == 0 ? 1 : num;
			}
			
		});
		// ��list���������е�Ԫ����ӵ�TreeSet�����У��������򣬱����ظ�
		ts.addAll(list);
		// ���list����
		list.clear();
		// ��TreeSet�������ź����Ԫ����ӵ�list��
		list.addAll(ts);
	}
}
