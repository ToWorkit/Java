// java�Ľ��ܼ�������İ�
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		// System.in ϵͳ����
		// �������ͣ��������ƣ�new����������
		Scanner sc = new Scanner(System.in);
		
		// ���ܼ�����������ݣ�����֤�� int ����
		int i = sc.nextInt();
		System.out.println(i + 1);
	}
}
