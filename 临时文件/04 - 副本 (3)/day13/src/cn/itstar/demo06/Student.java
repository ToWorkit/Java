package cn.itstar.demo06;
/*
 * ��̬��ע������
 * 
 * �ھ�̬�в��ܵ��÷Ǿ�̬
 * 
 * Ϊʲô�أ�Ϊʲô��̬���ܵ��÷Ǿ�̬����������
 * ��̬������Ǿ�̬�������ڴ浱�� 
 * 
 * ��̬ ǰ��  ����  �Ǿ�̬ ����  �������߼�
 * 
 * ע�⣺��̬����дthis������дsuper
 */
public class Student {
	private String name;
	private int age;
	
	/*�ھ�̬�в��ܵ��÷Ǿ�̬ ����
	 * public static void function() {
		System.out.println(age+name);
	}*/
	
	private static String id;
	private static double price;
	
	//�Ǿ�̬���������þ�̬��Ա���� ԭ��̬��Ա�����Ƚ��ڴ� ���������ã��Ǿ�̬���ڶ���
	public void function() {
		System.out.println(id+price);
		
	}
	
	/*����ֱ�ӵ���
	 * public static void main() {
		method();
	}
	
	public static void method() {
		
	}*/
	
	/*������ ������õĻ� Ҫnew�����ö���������
	 * public static void main() {
		method();
	}
	
	public void method() {
		
	}*/
}
