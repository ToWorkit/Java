package demo04;

/*
 * �Զ��������쳣
 */

public class ExceptionDemo05 {
	public static void main(String[] args) {
		int avg = getAvg(90, 0 , 43, -100, 100);
		System.out.println(avg);
	}
	/*
	 * ���ݲ���������ƽ��ֵ
	 */
	// ... ��������
	public static int getAvg(int...math) {
		int sum = 0;
		for(int s: math) {
			if (s < 0) {
				throw new FuShuException("�ɼ���Ч" + s);
			}
			sum += s;
		}
		return sum / math.length;
	}
}
