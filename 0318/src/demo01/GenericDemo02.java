package demo01;

import java.util.ArrayList;

/*
 * ArrayList �����Լ��ķ���
 */

public class GenericDemo02 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		// �Զ�װ�䣬int ���� תΪ Integer ����
		arr.add(123);
		arr.add(234);
		System.out.println("����ȡֵ get(index)" + arr.get(0));
		// ���ϱ�Ϊ����
//		Integer[] i = new Integer[arr.size()];
//		Integer[] list = arr.toArray(i);
		Integer[] list = arr.toArray(new Integer[arr.size()]);
		System.out.println("����ȡֵ [index]" + list[1]);
		for(Integer j : list) {
			System.out.println(j);
		}
	}
}
