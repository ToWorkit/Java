package demo04;

public class System_01 {
	public static void main(String[] args) {
		// 数组内容拷贝
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
		// 非0状态是异常终止，退出jvm
		System.exit(1);
		System.out.println("jvm");
		
	}
	
	public static void demo2() {
		// 计时 毫秒值
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

// 在一个源文件中不允许定义两个用public修饰的类
class Demo {
	public void finalize() {
		System.out.println("清除垃圾");
	}
}
