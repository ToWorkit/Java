package demo07;

import java.util.ArrayList;

public class ArrayListArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> list = new ArrayList<>();
		
		// һ��
		ArrayList<Person> first = new ArrayList<>();
		first.add(new Person("a", 30));
		first.add(new Person("b", 30));
		first.add(new Person("c", 30));
		
		// ����
		ArrayList<Person> second = new ArrayList<>();
		second.add(new Person("d", 20));
		second.add(new Person("e", 20));
		second.add(new Person("f", 20));
		
		// ���༶��ӵ�ѧ�Ƽ�����
		list.add(first);
		list.add(second);
		
		// ����
		for(ArrayList<Person> p: list) {
			for(Person item: p) {
				System.out.println(item);
			}
		}
	}
}
