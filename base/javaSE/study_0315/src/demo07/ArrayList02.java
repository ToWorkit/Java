package demo07;

import java.util.ArrayList;

public class ArrayList02 {
	public static void main(String[] args) {
		/*
		 * ���ϴ洢�Զ��������
		 */
		// Person ��ͬһĿ¼�²���Ҫ����
		ArrayList<Person> arrayPer = new ArrayList<Person>();
		// ���Ԫ��
		arrayPer.add(new Person("x", 20));
		arrayPer.add(new Person("b", 21));
		arrayPer.add(new Person("c", 22));
		
		for (int i = 0; i < arrayPer.size(); i ++) {
			// System.out.println -> �����toString����
			/*
			 * Դ���toString
			 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
			 */
			// ����Person������д��toString����
			System.out.println(arrayPer.get(i));
		}
	}
}
