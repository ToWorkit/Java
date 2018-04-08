package demo08;

import java.util.Comparator;

/*
TreeSet集合是用来对象元素进行排序的,同样他也可以保证元素的唯一
	 * 当compareTo方法返回0的时候集合中只有一个元素
	 * 当compareTo方法返回正数的时候集合会怎么存就怎么取
	 * 当compareTo方法返回负数的时候集合会倒序存储
 */

public class TreeSet01 {
	public static void main(String[] args) {
		// 将字符串按照长度排序
//		TreeSet<String> ts = new TreeSet<>(new )
	}
}

// 比较
class CompareByLen implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// 按照字符串的长度比较
		int num = s1.length() - s2.length();
		return num == 0 ? s1.compareTo(s2) : num;
	}
	
}
