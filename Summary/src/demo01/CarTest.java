package demo01;

public class CarTest {
	public static void main(String[] args) {
		// ����Carʵ��
		Car c = new Car();
		
		// ��ֵ
		c.name = "��ɯ����";
		c.count = 1;
		
		// ִ�з���
		c.run();
		
		int x = 3;
		byte b = 4;
/*		x += b;
		System.out.println(x); // 7
*/		
		x = (byte)x + b;
		System.out.println(x);
	}
}
