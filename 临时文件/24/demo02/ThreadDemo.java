package comitstar.demo02;

public class ThreadDemo {
	public static void main(String[] args) {
		SubThread st = new SubThread();
		st.start();
		
		for(int i = 0;i<30;i++) {
			System.out.println("main..."+i);
		}
	}
}
