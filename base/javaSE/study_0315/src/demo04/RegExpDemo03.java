package demo04;

/*
 * ��������Ƿ�Ϸ�
 * 
 * 		����
 * 			123456@qq.com
 * 		    myemail@sina.com
 * 			myemail@163.com
 * 			myemail@yahoo.com.cn
 * 
 * @:ǰ ���� ��ĸ �»���  ��������С��1��
 * @:�� ���� ��ĸ  ��������С��1��
 * .:���� ��ĸ
 * 
 */

public class RegExpDemo03 {
	public static void main(String[] args) {
		String email = "Q123456@qq.com.cn";
		// �������䣬����yahoo��
		// ()+ -> �����ڵĹ������һ�ε����
		boolean b = email.matches("[\\w]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}
