package com.itstar.demo01;

public class Test {
	public static void main(String[] args) {
		//创建研发员工类的对象
		Develop d = new Develop();
		d.name = "雷震子";
		d.work();
		
		//创建维护类对象
		YunWei y = new YunWei();
		y.name = "熊二";
		y.weiHu();
		y.work();
	}
}
