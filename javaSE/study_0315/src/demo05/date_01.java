package demo05;

import java.util.Date;

public class date_01 {	
	public static void main(String[] args) {
		// ��ǰʱ��
		System.out.println(new Date());
		second();
	}
	
	// ��ȡ��ǰ���ڵĺ���ֵ
	public static void second() {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		Date d = new Date();
		long time_ = d.getTime();
		System.out.println(time_);
	}	
}
