package demo01;

/*
 * shuffling -> ����
 */

public class shuffling {
	public static void main(String[] args) {
		double[] mylist = {1.9, 2.1, 2.3, 4.2};
		for (int i = mylist.length - 1; i > 0;  i--) {
			// ����һ������±�
			int j = (int)(Math.random() * (i + 1));
			
			// ����λ��
			double temp = mylist[i];
			mylist[i] = mylist[j];
			mylist[j] = temp;
		}
		for (double item: mylist) {
			System.out.println(item);
		}
	}
}
