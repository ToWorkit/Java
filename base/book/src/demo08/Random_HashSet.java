package demo08;

import java.util.HashSet;
import java.util.Random;

/*
* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
* 
* ����:
* 1,��Random�ഴ�����������
* 2,��Ҫ�洢10�������,���Ҳ����ظ�,����������HashSet����
* 3,���HashSet��size��С��10�Ϳ��Բ��ϵĴ洢,������ڵ���10��ֹͣ�洢
* 4,ͨ��Random���е�nextInt(n)������ȡ1��20֮��������,������Щ������洢��HashSet������
* 5,����HashSet
*/

public class Random_HashSet {
	public static void main(String[] args) {
		// ʹ��Random�ഴ�����������
		Random r = new Random();
		// �洢10��������������ظ�������ʹ��HashSet����
		HashSet<Integer> hs = new HashSet<>();
		// С��10�ʹ洢�����ڵ���10��ֹͣ
		while(hs.size() < 10) {
			// 1 - 20
			hs.add(r.nextInt(20) + 1);
		}
		// ȡ����
		for (Integer integer: hs) {
			System.out.print(integer + " ");
		}
	}
}
