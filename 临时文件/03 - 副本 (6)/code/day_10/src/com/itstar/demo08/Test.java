package com.itstar.demo08;

public class Test {
	public static void main(String[] args) {
		//�������࣬ʹ�����ζ�̬����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		//a1��a2���õ�������͸��๲�еķ����������ߵ�������д�ķ���
		a1.eat();
		a2.eat();
		
		//���͵�����ת��Animal->Cat
		Cat c = (Cat)a1;
		c.catchMouse();
		//���Ա���ɹ� ��������ʧ��
//		Cat d = (Cat)a2;
//		d.catchMouse();
		
		//Ϊ�˷�ֹ�쳣�ķ�����a1����Cat���� a2����Dog���� ǿת
		//instanceof�ж�
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		}
		if(a2 instanceof Dog) {
			Dog d = (Dog)a2;
			d.lookHome();
			
		}
		
		
	}
}
