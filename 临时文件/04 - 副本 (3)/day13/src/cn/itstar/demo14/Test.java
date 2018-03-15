package cn.itstar.demo14;

public class Test {
	/*
	 * 使用匿名内部类
	 * 
	 * 	定义实现类，重写方法，创建实现类对象，一步搞定
	 *  格式：
	 *  	new 接口或者父类(){
	 *  		重写抽象方法
	 *  	};
	 *  
	 *  从new开始，到分号结束
	 *  创建了接口的实现类的对象
	 *  对象可以调用方法所以在;前可以.方法名
	 *  与
	 *  XXX x = new XXX();
	 *  x.smoking;等价
	 *  
	 *  注意：
	 *  前提必须实现了接口或者继承 否则这个多态就玩不了了
	 *  匿名类部类只能写在方法中
	 */
	
	public static void main(String[] args) {
		new Smoking() {
			public void smoking() {
				System.out.println("人在吸烟");
			}
		}.smoking();
	}
}
