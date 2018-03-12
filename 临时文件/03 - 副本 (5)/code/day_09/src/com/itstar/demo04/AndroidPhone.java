package com.itstar.demo04;
/*
 * 方法覆盖的注意事项：
 * 	子类方法覆盖父类方法，必须保证权限要大于等于父类的权限
 * 	子类重写父类的方法，保证子类的权限要大于等于父类的权限
 * java中有4大权限：依次减小
 * 	public:共有
 *  protected:受保护的
 *  default:默认(特别，不写)
 *  private:私有的
 */
public class AndroidPhone extends Phone{
	public void weChat() {
		super.weChat();
		System.out.println("挑一挑");
		System.out.println("脑强王者");
	}
}
