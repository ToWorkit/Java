package comitstar.demo06;
/*
 *匿名内部类，实现多线程程序
 *
 *new 父类或者接口(){
 *	重写抽象方法
 *}
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//继承的方式 ：XXX extends Thread{public void run()}
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"哈哈");
			}
		}.start();
		
	
	
	
		//接口的方式： XXX implements Runnable{}
		//实现类
	
		Runnable r = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"$$$$$$$");
			}
		};
		new Thread(r).start();
		
	
		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"@@@@@@@@@@@@@@@");
			}
		}).start();
	}
}
