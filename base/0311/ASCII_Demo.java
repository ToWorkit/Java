public class ASCII_Demo {
	public static void main(String[] args) {
		String s = "1";
		int it = Integer.parseInt(s);
		System.out.println(it); // 1
		
		char cr = 'a';
		// �Զ���������ʽת��
		int cr_i = cr + 1;
		System.out.println(cr_i); // 98
		
		int a_ = 97;
		// ǿ������ת��
		char a_c = (char)a_;
		System.out.println(a_c); // a
		
		// ���� a-z A-Z
		char lowerCase = 'a';
		char upperCase = 'A';
		
		for (int i = 0; i < 26; i++) {
			System.out.println(lowerCase + " " + upperCase);
			
			lowerCase++;
			upperCase++;
		}
	}
}