package demo05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws Exception{
		dateLive();
	}
	
	private static void dateLive() throws Exception {
		System.out.println("yyyy-MM-dd");
		// ��������
		String _birthday = new Scanner(System.in).next();
		
		// ���ַ���תΪ���ڶ���
		// 1. ��������ģʽ
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		// 2. ���ַ���תΪ���ڶ���parse
		Date birthDate = s.parse(_birthday);
		
		// ��ȡ��������ڶ���
		Date today = new Date();
		
		// ����������תΪ����ֵ����
		long birthdaySecond = birthDate.getTime();
		long todaySecond = today.getTime();
		
		// ��ֵ
		long _second = todaySecond - birthdaySecond;
		System.out.println((_second < 0) ?"����": _second / 1000 / 60 / 60 / 24);
	}
}
