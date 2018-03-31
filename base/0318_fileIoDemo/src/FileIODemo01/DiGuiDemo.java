package FileIODemo01;

public class DiGuiDemo {
	public static void main(String[] args) {
		int i = getJc(3);
		System.out.println(i);
		int j = getOp(3, 1);
		System.out.println(j);
		
		int a = getSum(100);
		System.out.println(a);
		int b = getSumOp(100, 1);
		System.out.println(b);
	}
	
	/*
	 * �׳�
	 */
	public static int getJc(int i) {
		if (i == 1)
			return 1;
		return i * getJc(i - 1);
	}
	
	/*
	 * �ݹ�β�����Ż� 
	 */
	public static int getOp(int i,int j) {
		if (i == 1)
			// ֱ�ӷ����Ѿ�����õĽ��
			return j;
		// ����������ú���֮ǰ�ͼ�����˽������������������
		return getOp(i - 1, i * j);
	}
	
	/*
	 * ���
	 */
	public static int getSum(int i) {
		if (i == 1)
			return 1;
		return i + getSum(i - 1);
	}
	
	/*
	 * β�����Ż�
	 */
	public static int getSumOp(int i, int j) {
		if (i == 1)
			return j;
		return getSumOp(i - 1, i + j);
	}
}
