package demo04;

public class System_01 {
	public static void main(String[] args) {
		// �������ݿ���
		int[] src = {2, 1, 4, 2, 1, 5};
		int[] dest = new int[8];
		System.arraycopy(src, 0, dest, 0, src.length);
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i] + " ");
		}
		
//		demo1();
		demo2();
		demo3();
	}
	
	public static void demo1() {
		System.out.println("test");
		// ��0״̬���쳣��ֹ���˳�jvm
		System.exit(1);
		System.out.println("jvm");
		
	}
	
	public static void demo2() {
		// ��ʱ ����ֵ
		long start = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			System.out.println("");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static void demo3() {
		for (int i = 0; i < 100; i++) {
			new Demo();
			System.gc();
		}
	}
}

// ��һ��Դ�ļ��в�������������public���ε���
class Demo {
	public void finalize() {
		System.out.println("�������");
	}
}
