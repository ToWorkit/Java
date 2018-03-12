package com.itstar.demo04;

public class Test {
	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.call();
		p.sendMessage();
		p.weChat();
		
		AndroidPhone ap = new AndroidPhone();
		ap.weChat();
	}
}
