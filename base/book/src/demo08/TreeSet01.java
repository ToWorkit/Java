package demo08;

import java.util.Comparator;

/*
TreeSet��������������Ԫ�ؽ��������,ͬ����Ҳ���Ա�֤Ԫ�ص�Ψһ
	 * ��compareTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
	 * ��compareTo��������������ʱ�򼯺ϻ���ô�����ôȡ
	 * ��compareTo�������ظ�����ʱ�򼯺ϻᵹ��洢
 */

public class TreeSet01 {
	public static void main(String[] args) {
		// ���ַ������ճ�������
//		TreeSet<String> ts = new TreeSet<>(new )
	}
}

// �Ƚ�
class CompareByLen implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// �����ַ����ĳ��ȱȽ�
		int num = s1.length() - s2.length();
		return num == 0 ? s1.compareTo(s2) : num;
	}
	
}
