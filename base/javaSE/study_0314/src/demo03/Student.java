package demo03;

public class Student {
	// ˽�е�
	private String name;
	private int age;
	int test = 1;
	
	public static void main(String[] args) {
		fun();
	}
	
	// ��̬����
	public static void fun() {
		// �������ھ�̬�е��÷Ǿ�̬
		// System.out.println(test);
	}
	
	private static String id;
	private static double price;
	
	// �Ǿ�̬���������þ�̬��Ա����
	// ��̬��Ա�������Ƚ��ڴ��У�����ֱ������ʹ��
	// �Ǿ�̬���ڶ�����Ҫnew֮��ʹ��
	public void function() {
		System.out.println(id + "--" + price);
	}
}
