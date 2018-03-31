package demo03;

public class String_04 {
	public static void main(String[] args) {
		fun();
		fun_01();
	}
	
	/**
	 * boolean equals(Object anObject)
	 * 将此字符串与指定的对象比较
	 * 判断字符串中的字符是否完全相同，如果完全相同返回true
	 * 
	 * boolean equalsIgnoreCase(String anotherString)
	 * 将此 String 与另一个 String 比较，不考虑大小写。 
	 */
	public static void fun() {
		String s1 = "abc";
		String s2 = "Abc";
		
		boolean b = s1.equals(s2);
		boolean b2 = s1.equalsIgnoreCase(s2);
		// 判断字符串中的字符是否完全相同，如果完全相同返回true
		System.out.println(b);
		// 忽略大小写
		System.out.println(b2);
	}
	
	/**
	 * char[] toCharArray()
	 * 将此字符串转换为一个新的字符数组 
	 */
	public static void fun_01() {
		String s = "test";
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i ++) {
			System.out.println(ch[i]);
		}
	}

}
