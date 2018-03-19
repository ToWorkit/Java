package com.itstar.demo04;
/*
 * 方法进行递归调用：
 * 	  方法自己调用自己
 */
public class DiGuiDemo {
	public static void main(String[] args) {
//		int i = getSum(100);
//		System.out.println(i);
		int j = getJieCheng(50);
		System.out.println(j);
	}
	/*
	 * 计算阶乘 3！
	 * 3*2*1
	 * 6
	 */
	public static int getJieCheng(int j) {
		if(j == 1)
			return 1;
		return j*getJieCheng(j-1);
	}
	
	
	/*
	 * 计算：1+2+...+100的和 5050
	 * 计算方式：
	 * 	n+(n-1)+(n-2)...
	 */
	
	public static int getSum(int n) {
		if(n==1)
			return 1;
		return n+getSum(n-1);
	}
}
