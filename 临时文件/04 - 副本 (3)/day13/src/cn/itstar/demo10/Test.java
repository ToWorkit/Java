package cn.itstar.demo10;
/*
 * �����ֶ����������ͱ��������Է���ʹ��
 * ��������û�����ñ�����ֻ��ʹ��һ��
 * 
 * ����������Ե�����������
 * ����������Ե��������ķ���ֵ
 */
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		//����д��
		Person p = new Person();
		p.eat();
		
		//����д��
		new Person().eat();
		//������ͬ�����ڳ�
		new Person().eat();
		
		/*
		 * ֻ��ʹ��һ��
		 * int i = new Scanner(System.in).nextInt();
		System.out.println(i);*/
		
		/*���ʹ��
		 * Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.next();*/
		
		//�����������ֱ����Ϊ��������
		method(new Person());
		
		//���ÿղ����ص�method����
		Person p1 = method();
		p1.eat();
		
	}
	
	//��������ֵ��Person����
	//����return��� ,���ص��������Ķ���
	public static Person method() {
		//Person p = new Person();����д�Ƚ��鷳
		//return p;
		return new Person();
	}
	//���صķ���
	public static void method(Person p) {
		p.eat();
	}
}
