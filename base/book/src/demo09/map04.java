package demo09;

import java.util.Comparator;
import java.util.TreeMap;

public class map04 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// 按照姓名比较
				int num = s1.getName().compareTo(s2.getName());
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("b", 22), "中国");
		tm.put(new Student("d", 37), "国外");
		tm.put(new Student("c", 20), "地球");
		tm.put(new Student("a", 18), "出去");
		// 姓名排序
		System.out.println(tm);
		System.out.println("-------------");
		demo01();
	}
	
	public static void demo01() {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("b", 22), "中国");
		tm.put(new Student("d", 37), "国外");
		tm.put(new Student("a", 16), "出去");
		tm.put(new Student("c", 20), "地球");
		tm.put(new Student("a", 18), "出去");
		// 年龄排序
		System.out.println(tm);
	}
}
