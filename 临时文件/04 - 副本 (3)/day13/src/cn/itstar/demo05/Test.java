package cn.itstar.demo05;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "ϲ����";
		p2.name = "������";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		//������þ�̬��Ա����
		p1.className = "�߰�";
		System.out.println(p2.className);
		
		//��̬���� ����ֱ�ӱ���������
		System.out.println(Person.className);
				
	}
	
}
