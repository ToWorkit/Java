package comitstar.demo02;
/*
 * �����е����߳�
 * 	�����������У����̳߳���
 */
public class Demo1 {
	public static void main(String[] args) {
		//System.out.println(0/0);
		function();
		
		System.out.println(Math.abs(-1));
	}
	
	public static void function() {
		for(int i=0;i<20000;i++) {
			System.out.println(i);
		}
	}
}
