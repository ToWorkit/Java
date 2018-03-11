package demo05;

/*
 * 多态的特点：
 * 
 * 	成员变量：
 * 		编译的时候，参考父类中有没有这个变量，如果有编译成功，如果没有编译失败
 * 		运行的时候，运行的是父类中的变量值
 * 
 *  成员方法：
 *  	编译的时候，参考父类中有没有这个方法，如果有编译成功，如果没有编译失败
 *  	运行的时候，运行的是子类重写的方法
 */

public class Init {
	public static void main(String[] args) {
		// 两个子类使用两次多态调用进行实例化
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		// 调用子类和父类公有的方法，执行的是子类重写的方法, 不能调用子类独有的方法
		a1.eat();
		a2.eat();
		
		// 类型的向下转型(强制转)
		Cat c = (Cat)a1;
		c.catchMouse();
		// 将狗转为猫可以编译成功，但是不可以执行（压根么有可转性）
		/*Cat d = (Cat)a2;
		d.catchMouse();*/
		
		// 为了避免此类异常操作 -> a1属于Cat对象，a2属于Dog对象，彼此发生强转
		// 使用 instanceof 判断
		// 如果 a1 属于 Cat对象
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		}
		
		if (a2 instanceof Dog) {
			Dog d = (Dog)a2;
			d.lookHome();
		}
	}
}
