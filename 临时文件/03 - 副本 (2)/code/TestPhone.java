public class TestPhone{
	/*
		测试：
			1：导入包->两个类如果在同一个文件夹当中就不需要导包了
			2：创建引用数据类型变量
			3：变量.类型中的功能
	*/
	public static void main(String[] args){
		//2：创建引用数据类型变量
		Phone p = new Phone();
		//System.out.println(p);
		
		//3：变量.类型中的功能
		//System.out.println(p.color);
		p.color = "白色";
		p.brand = "苹果x";
		p.size = 5.1;
		
		//获取属性值
		System.out.println(p.color + "     " + p.brand + "     " + p.size);
	}
}