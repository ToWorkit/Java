package demo07;

import java.util.ArrayList;

public class ArrayList02 {
	public static void main(String[] args) {
		/*
		 * 集合存储自定义类对象
		 */
		// Person 在同一目录下不需要导入
		ArrayList<Person> arrayPer = new ArrayList<Person>();
		// 添加元素
		arrayPer.add(new Person("x", 20));
		arrayPer.add(new Person("b", 21));
		arrayPer.add(new Person("c", 22));
		
		for (int i = 0; i < arrayPer.size(); i ++) {
			// System.out.println -> 会调用toString方法
			/*
			 * 源码的toString
			 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
			 */
			// 已在Person类中重写了toString方法
			System.out.println(arrayPer.get(i));
		}
	}
}
