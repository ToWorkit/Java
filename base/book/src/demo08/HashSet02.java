package demo08;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
 * aaaabbbcccddd
 * 
 * 分析:
 * 1,创建Scanner对象
 * 2,创建HashSet对象,将字符存储,去掉重复
 * 3,将字符串转换为字符数组,获取每一个字符存储在HashSet集合中,自动去除重复
 * 4,遍历HashSet,打印每一个字符
 */

public class HashSet02 {
	public static void main(String[] args) {
		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		String line = sc.nextLine();
		// 创建HashSet对象，将字符串存储，去掉重复
		// Character -> 字符对象(字符包装类)
		HashSet<Character> hs = new HashSet<>();
		// 将字符串转换为字符数组，获取每一个字符存储在HashSet集合中，自动去除重复
		char[] arr = line.toCharArray();
//		System.err.println(arr[0]);
		// 遍历字符数组
		for(char c: arr) {
			hs.add(c);
		}
		// 会自动去重，遍历HashSet集合
		for(Character ch: hs) {
			System.out.print(ch + " ");
		}
	}
}
