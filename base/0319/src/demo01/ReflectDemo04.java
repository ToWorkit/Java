package demo01;

/*
 * �����ȡ���췽��������:
 * 	��������࣬�����пղι���
 *  ���췽��������˽�е�
 */

public class ReflectDemo04 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("demo01.Person");
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
