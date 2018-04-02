package test.demo4;

/**
 * 前端工程师 继承 研发部
 * */

public class JavaScript extends NetWork{
	public void work() {
		System.out.println("前端工程师， " + super.getId() + ".." + super.getName());
	}
}
