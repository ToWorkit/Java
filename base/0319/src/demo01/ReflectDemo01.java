package demo01;

/*
 * ���䣬��.class�ļ����м��ؽ�����ʹ����ӵ�е���Դ����
 * 
 * ��ȡ.class�ļ������ַ�ʽ
 * 1. ���� ��ȡ
 * 2. ����. ��ȡ
 * 3. Class��ľ�̬���� ��ȡ
 */

public class ReflectDemo01 {
	public static void main(String[] args) throws Exception {
		// ���� ��ȡ
		// ������޲ι��췽����Person�е��޲ι��췽�������� ��private ״̬�µ�
		Person p = new Person();
		// ����ʵ�������getClass������ȡ.class�ļ�
		Class c = p.getClass();
		System.out.println(c);
		
		// ����. ��ȡ
		Class c_01 = Person.class;
		System.out.println(c_01);
		
		// ��̬������ȡ
		// ����.����
		Class c_02 = Class.forName("demo01.Person");
		System.out.println(c_02);
	}
}
