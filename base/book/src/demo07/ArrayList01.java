package demo07;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 *  ˼·�������¼��Ϸ�ʽ
 */

public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		list.add("d");
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	

	/*
	 * �����¼��Ͻ��ظ�Ԫ��ȥ��
	 * 1,��ȷ����ֵ����,����ArrayList
	 * 2,��ȷ�����б�ArrayList
	 * 
	 * ����:
	 * 1,�����¼���
	 * 2,���ݴ���ļ���(�ϼ���)��ȡ������
	 * 3,�����ϼ���
	 * 4,ͨ���¼����ж��Ƿ�����ϼ����е�Ԫ��,��������Ͳ����,��������������
	 */
	public static ArrayList  getSingle(ArrayList list) {
		// 1 �����¼���
		ArrayList newList = new ArrayList<>();
		// 2 ���ݴ���ļ��ϻ�ȡ������
		Iterator it = list.iterator();
		
		// 3 ��������ļ���
		while(it.hasNext()) {
			// ��¼ÿһ��Ԫ��
			Object obj = it.next();
			
			// �������¼�����û�а������뼯���е�Ԫ�������
			if(!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		
		// ���ش���õļ���
		return newList;
	}
}
