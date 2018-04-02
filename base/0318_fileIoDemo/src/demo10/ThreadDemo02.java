package demo10;

/*
 * Ïß³ÌÐÝÃß sleep()
 */

public class ThreadDemo02 {
	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println(i + "=");
		}
		
		new SleepThread01().start();
	}
}
