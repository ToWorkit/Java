package test.demo4;

public class Init {
	public static void main(String[] args) {
		// ʵ����
		Java jv = new Java();
		JavaScript js = new JavaScript();
		
		// ��ֵ
		jv.setId("һ��");
		jv.setName("����");
		
		js.setId("����");
		js.setName("���");
		
		// ���÷���
		jv.work_02();
		js.work();
		js.Test();
	}
}
