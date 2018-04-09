package demo08;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet��������������Ԫ�ؽ��������,ͬ����Ҳ���Ա�֤Ԫ�ص�Ψһ
	 * ��compareTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
	 * ��compareTo��������������ʱ�򼯺ϻ���ô�����ôȡ
	 * ��compareTo�������ظ�����ʱ�򼯺ϻᵹ��洢
 */

public class TreeSet01 {
	public static void main(String[] args) {
		// ���ַ������ճ�������
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("abcdef");
		ts.add("abc");
		ts.add("abcd");
		ts.add("a");
		
		System.out.println(ts);
	}
}

// �Ƚ�
class CompareByLen implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// �����ַ����ĳ��ȱȽ�
		int num = s1.length() - s2.length();
		// ����Ϊ������Ϊ��
		return num == 0 ? s1.compareTo(s2) : num;
	}
	
}
