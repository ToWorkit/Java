public class MethoDemo {
	public static void main(String[] args) {
		// ���÷���
		int area = getArrea(3, 3);
		System.out.println("���Ϊ��" + area);
		
		// ����������
		int sum_int = getSum(2, 3);
		System.out.println(sum_int);
		
		double sum_double = getSum(3.2, 4.1);
		System.out.println(sum_double);
	}
	// ���巽��
	// ���η�������ֵ���ͣ�������(�����б�) 
	public static int getArrea(int w, int h) {
		int area = w * h;
		return area;
	}
	
	// ����������
	public static int getSum(int a, int b) {
		System.out.println("int��������");
		int sum = a + b;
		return sum;
	}
	
	public static double getSum(double a, double b) {
		System.out.println("double��������");
		double sum = a + b;
		return sum;
	}
}