// �����������
import java.util.Random;
public class RandomDemo {
	public static void main(String[] args) {
		// ʵ����
		Random r = new Random();
		
		// int���͵� 0-49 ֮��������
		int i = r.nextInt(50);
		System.out.println(i);
		
		// double������ 0-1
		double d = r.nextDouble();
		System.out.println(d);
	}
}