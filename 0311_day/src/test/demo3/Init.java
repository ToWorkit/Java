package test.demo3;

/**
 * ִ�к���
 * */

public class Init {
	public static void main(String[] args) {
		// �����з�������(ʵ����)
		Develop d = new Develop();
		// ���ø���ķ���
		d.name = "�Ϻ�";
		d.work();
		// �����Լ��ķ���
		d.print();
		
		// ������ά����(ʵ����)
		YunWei y = new YunWei();
		// ���ø���ķ���
		y.name = "����";
		y.work();
		// �����Լ��ķ���
		y.print();
	}
}
