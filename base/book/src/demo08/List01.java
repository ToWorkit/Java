package demo08;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *  ����:�������е��ظ�Ԫ��ȥ��
 *  
 *  ����:
 *  1,����List���ϴ洢���ɸ��ظ�Ԫ��
 *  2,�������巽��ȥ���ظ�
 *  3,��ӡһ��List����
 */

public class List01 {
	public static void main(String[] args) {
		// �����ظ�Ԫ�صļ���
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		// �������巽��ȥ��
		getSingle(list);
		
		System.out.println(list);
	}
	
	/*
	 * ���� -> ����ת
	 * ȥ��List�����е��ظ�Ԫ��
	 * 1,����һ��LinkedHashSet����
	 * 2,��List���������е�Ԫ����ӵ�LinkedHashSet����
	 * 3,��list�����е�Ԫ�����
	 * 4,��LinkedHashSet�����е�Ԫ����ӻ�List������
	 */
	public static void getSingle(List<String> list) {
		// ����LinkedHashSet����
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		// ��List�����е�����Ԫ����ӵ�LinkedHashSet��ȥ
		lhs.addAll(list);
		// ���list����
		list.clear();
		// ��ȥ�غ���������·���
		list.addAll(lhs);
	}
}
