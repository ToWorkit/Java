package demo09;

import java.util.Comparator;
import java.util.TreeMap;

public class map04 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
	}
}
