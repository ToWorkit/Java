package cn.itstar.demo12;

public class Outer {
	int a = 1;
	class Inner{
		int a = 2;
		public void inner() {
			int a = 3;
			//�ͽ�ԭ�� ��������2��ô�죿�Ӹ�this.  ��������1��ô�죿Outer.this.a
			System.out.println(a);
		}
		
	}
}
