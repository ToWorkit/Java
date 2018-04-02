package demo05;

/*
 * �����ࣺjava.util.Calendar
 * 	�����࣬ʹ�������������
 *  
 *  Calendar��ʹ���˾�̬����getInstance() ֱ�ӷ����������
 *  ����Ҫnew������� ͨ����̬����ֱ�ӻ�ȡ
 */

import java.util.Calendar;

public class Calendar_01 {
	public static void main(String[] args) {
		calendar_1();
		calendar_2();
	}
	

	/**
	 * Calendar���get���������������ֶε�ֵ int get(int)
	 * ��ȡ�������ֶΣ�����ֵ��int�����������ֵ
	 */
	public static void calendar_1() {
		Calendar c = Calendar.getInstance();
		// ��ȡ���
		int y = c.get(Calendar.YEAR);
		// ��ȡ�·�
		int m = c.get(Calendar.MONTH) + 1;
		// ��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(y + "-" + m + "-" + day);
	}
	
	
	/*
	 * Calendar���set���� ��������set(int field,int value);
	 * field:�ֶ�
	 * value:����ֵ
	 * set(int year, int month, int date) ���ݵ���3���������� �� ��
	 */
	
	public static void calendar_2() {
		Calendar c = Calendar.getInstance();
		// ����(ע���·�)
		c.set(2018, 2, 20);
		//��ȡ���
		int year = c.get(Calendar.YEAR);
		
		//��ȡ�·�
		int month = c.get(Calendar.MONTH) + 1;
		
		//��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "-" + month + "-" + day);
	}
}
