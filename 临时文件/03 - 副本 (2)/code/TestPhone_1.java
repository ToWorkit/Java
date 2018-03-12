public class TestPhone_1{
	public static void main(String[] args){
		//测试：两个手机类的变量
		
		Phone p1 = new Phone();
		
		//再次创建手机类型变量
		Phone p2 = new Phone();
		
		p1.color = "白色";
		p1.brand = "华为";
		p1.size = 6.5;
		
		System.out.println(p1.brand);
		System.out.println(p2.size);
	}
}