package com.itstar.demo04;
/*
 * �����˵�������
 * 		���ԣ����� ����
 * 		������˵��
 * 
 * �µĹؼ��֣�private ˽�е� ���� ��Ա���η� �������ξֲ�����
 * 			��private���Σ�ֻ�����Լ��ı�����ʹ��->Ȩ������
 * ��˽�еı������ṩ�˹����ķ��ʷ�ʽ������
 */
public class Person {
	//�˵�����,��Ա����
	String name;
	//�˵�����,��Ա����-����ȫ���� ��ֵ�����ᵼ�³���ҵ��� ����Υ������ʵ�����
	private int age;
	
	//����age������˽�У��ṩ�������ⲿ��ʹ��
	public void setAge(int a) {
		//��a���з�Χ������
		if(a<0 || a>200) {
			age = 18;
		}else {
			age = a;
		}
	}
	
	//���巽�����Ա���age��ȡֵʹ��
	public int getAge() {
		return age;
	}
	
	//������˵���Ĺ���
	public void speak() {
		System.out.println(name+"...."+age+"˵����");
	}
}
