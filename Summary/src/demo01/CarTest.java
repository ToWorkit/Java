package demo01;

public class CarTest {
	public static void main(String[] args) {
		// 创建Car实例
		Car c = new Car();
		
		// 赋值
		c.name = "玛莎拉蒂";
		c.count = 1;
		
		// 执行方法
		c.run();
		
		int x = 3;
		byte b = 4;
/*		x += b;
		System.out.println(x); // 7
*/		
		x = (byte)x + b;
		System.out.println(x);
	}
}
