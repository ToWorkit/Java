package com.itstar.demo04;
/*
 * �������еݹ���ã�
 * 	  �����Լ������Լ�
 */
public class DiGuiDemo {
	public static void main(String[] args) {
//		int i = getSum(100);
//		System.out.println(i);
		int j = getJieCheng(50);
		System.out.println(j);
	}
	/*
	 * ����׳� 3��
	 * 3*2*1
	 * 6
	 */
	public static int getJieCheng(int j) {
		if(j == 1)
			return 1;
		return j*getJieCheng(j-1);
	}
	
	
	/*
	 * ���㣺1+2+...+100�ĺ� 5050
	 * ���㷽ʽ��
	 * 	n+(n-1)+(n-2)...
	 */
	
	public static int getSum(int n) {
		if(n==1)
			return 1;
		return n+getSum(n-1);
	}
}
