/*
	定义测试类：
		同时测试，电饭锅和汽车
*/
public class Test{
	public static void main(String[] args){
		//创建电饭锅的引用类型
		DianFanGuo dfg = new DianFanGuo();
		
		dfg.brand = "长虹";
		dfg.size = 13.4;
		dfg.color = "黑色";
		
		//创建汽车类
		Car c = new Car();
		
		c.brand = "奔驰";
		c.pailiang = 0.5;
		c.type = "跑车";
		
		System.out.println(dfg.brand + "  " + dfg.size + "    "+ dfg.color);
		System.out.println(c.brand + "  " + c.pailiang + "    "+ c.type);
	}
}