package demo01;

public class Interview_byte {
	public static void main(String[] args) {
		byte b1 = 3;
		byte b2 = 4;

		// 1,byte��byte(��short,char)���������ʱ�������Ϊint,����int������ӵĽ��Ҳ��int����
		// 2,b1��b2����������,�����洢��ֵ�Ǳ仯,�ڱ����ʱ���޷��ж���������ֵ,����п��ܻᳬ��byte��ȡֵ��Χ

		// byte b3 = (b1 + b2);

		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);

		// java �������г����Ż�����
		byte b4 = 3 + 4;
		System.out.println(b4);
	}
}
