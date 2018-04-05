package demo04;


/**
 * * A:StringBuffer的添加功能
	* public StringBuffer append(String str):
		* 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
	* public StringBuffer insert(int offset,String str):
		* 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
	StringBuffer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是一个长度为16的字符数组
	当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符
 */


/*
 * 引用数据类型
 */

public class StringBuffer02 {
	public static void main(String[] args) {
		demo();
		System.out.println("------------------");
		// 插入操作
		StringBuffer sb = new StringBuffer("2345");
		System.out.println(sb);
		// 插入之前
		sb.insert(1, "World");
		System.out.println(sb);
		// 删除 含头不含尾
		sb.delete(3, 5);
		System.out.println(sb);
		// 替换
		sb.replace(0, 1, "9");
		System.out.println(sb);
		// 翻转
		sb.reverse();
		System.out.println(sb);
		// 截取, 不影响原始数据
		String str_1 = sb.substring(1, 2);
		System.out.println(str_1);
		
		// 转String
		String str_2 = new String(str_1);
		System.out.println(str_2);
		
		System.out.println(sb.toString());
	}
	
	private static void demo() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("Hello");
		StringBuffer sb4 = sb.append(20);
		
		// 自身重写了toString方法，显示的是对象中的属性
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}
}
