package demo05;

/*
 * ��̬���ص㣺
 * 
 * 	��Ա������
 * 		�����ʱ�򣬲ο���������û���������������б���ɹ������û�б���ʧ��
 * 		���е�ʱ�����е��Ǹ����еı���ֵ
 * 
 *  ��Ա������
 *  	�����ʱ�򣬲ο���������û���������������б���ɹ������û�б���ʧ��
 *  	���е�ʱ�����е���������д�ķ���
 */

public class Init {
	public static void main(String[] args) {
		// ��������ʹ�����ζ�̬���ý���ʵ����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		// ��������͸��๫�еķ�����ִ�е���������д�ķ���, ���ܵ���������еķ���
		a1.eat();
		a2.eat();
		
		// ���͵�����ת��(ǿ��ת)
		Cat c = (Cat)a1;
		c.catchMouse();
		// ����תΪè���Ա���ɹ������ǲ�����ִ�У�ѹ��ô�п�ת�ԣ�
		/*Cat d = (Cat)a2;
		d.catchMouse();*/
		
		// Ϊ�˱�������쳣���� -> a1����Cat����a2����Dog���󣬱˴˷���ǿת
		// ʹ�� instanceof �ж�
		// ��� a1 ���� Cat����
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		}
		
		if (a2 instanceof Dog) {
			Dog d = (Dog)a2;
			d.lookHome();
		}
	}
}
