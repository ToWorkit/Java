package demo02;

import java.util.HashSet;

public class HashDemo01 {
	public static void main(String[] args) {
/*		Person01.id = 1;
		System.out.println(Person01.id);*/
		// ͬ��Ŀ¼����Ҫ����
		HashSet<Person01> p = new HashSet<Person01>();
		// ���췽������
		p.add(new Person01("a", 21));
		// �ж϶����Ƿ��ظ� hashCode, equals
		p.add(new Person01("a", 21));
		p.add(new Person01("b", 11));
		p.add(new Person01("c", 22));
		p.add(new Person01("d", 31));
		// ��Ϊ�� new �Ķ���(ʵ����)���Դ洢���ǵ�ַ�����ظ�����������ͬ��ֵ
		// ��дtoString
		System.out.println(p.toString());
	}
}
