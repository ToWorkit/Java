package com.itstar.demo01;

public class RegexDemo {
	public static void main(String[] args) {
		checkEmail();
	}
	
	/*
	 * ��������Ƿ�Ϸ�
	 * 
	 * 		����
	 * 			123456@qq.com
	 * 		    myemail@sina.com
	 * 			myemail@163.com
	 * 			myemail@yahoo.com.cn
	 * 
	 * @:ǰ ���� ��ĸ �»���  ��������С��1��
	 * @:�� ���� ��ĸ  ��������С��1��
	 * .:���� ��ĸ
	 * 
	 */
	public static void checkEmail() {
		String email = "123456@qq.com";
		//Ϊ�˸㶨�Ż��������ʽ ���ǲ�Ӱ�����������ʽ ���������һ�ѿ��Գ���һ�λ��߶��
		boolean b = email.matches("[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}
