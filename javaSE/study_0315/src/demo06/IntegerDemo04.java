package demo06;

public class IntegerDemo04 {
	public static void main(String[] args) {
		fun();
	}
	public static void fun() {
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		
		// �������ͱȽϵ��ǵ�ַ false
		System.out.println(a == b);
		// equals�Ƚϵ��Ƕ��������(ֵ)
		// �̳���Object�࣬��д��equals����
		// true
		System.out.println(a.equals(b));
		
		System.out.println("-------------");
		
		// false 
		// �������Զ�װ�䣬�����������Ͱ�װ����������������
		// �Ƚϵ��ǵ�ַ
		Integer l = 300;
		Integer p = 300;
		System.err.println(l == p);

		System.out.println("==================");
		
		// ע��㣬������byte��Χ(-128 ~ 127)��ʱ��JVM��������new����
		Integer c = 127;
		Integer d = 127;
		// �Ƚϵ���ֵ(������������)
		System.out.println(c == d);
	}
}
