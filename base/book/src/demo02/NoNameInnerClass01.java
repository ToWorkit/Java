package demo02;

/*
 * �����ڲ���
 * 	�ڲ���ļ�д��
 * ǰ��: ����һ������߽ӿ�
 * 	������Ǿ�����Ҳ�����ǳ�����
 * ��ʽ
 * 	new �������߽ӿ���() {
 * 		��д����;
 * 	}
 * ����
 * 	һ���̳��˸��������ʵ���˸ýӿڵ�������������
 * 	
 */

public class NoNameInnerClass01 {
	public static void main(String[] args) {
		Outer_05 o = new Outer_05();
		o.method();
		
		// �����ഫ��
		o.method_01(new Person() {
			public void show() {
				System.out.println("��������Ϊ����");
			}
		});
	}
}

// �ӿ�
interface Inter {
	public void print();
}


// ������(�ӿ�Ҳ��һ����)
abstract class Person {
	public abstract void show();
}

// �� 
class Outer_05 {
	// ʵ�ֽӿ�
	class Inner implements Inter {

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("ʵ����Inter�ӿڲ���д��print����");
		}
	}
	
	public void method() {
		
		Inner i = new Inner();
		i.print();
		
		// �����ڲ���
		// ʵ����Inter�ӿ�
		Inter it = new Inter() {
			@Override
			public void print() {
				// TODO Auto-generated method stub	
				System.out.println("�����ڲ����print����");
			}
		};
		// �ж������ʱʹ��
		it.print();
	}
	
	// �Բ�����ʽ����
	public void method_01(Person p) {
		p.show();
	}
}
