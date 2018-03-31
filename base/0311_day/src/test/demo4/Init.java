package test.demo4;

public class Init {
	public static void main(String[] args) {
		// 实例化
		Java jv = new Java();
		JavaScript js = new JavaScript();
		
		// 赋值
		jv.setId("一号");
		jv.setName("哈哈");
		
		js.setId("二号");
		js.setName("吼吼");
		
		// 调用方法
		jv.work_02();
		js.work();
		js.Test();
	}
}
