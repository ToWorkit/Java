package test.demo1;

public class CarTest {
	public static void main(String[] args) {
		// 创建 car类的变量(js中实例化)
		// 类型， 变量名，new， 类名
		Car c = new Car();
		
		c.name = "玛莎拉蒂";
		c.count = 1;
		
		// 调用方法
		c.run();
	}
}
