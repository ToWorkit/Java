package demo06;

import java.util.ArrayList;
import java.util.Iterator;

/**
* A:泛型概述
* B:泛型好处
	* 提高安全性(将运行期的错误转换到编译期) 
	* 省去强转的麻烦
* C:泛型基本使用
	* <>中放的必须是引用数据类型 
* D:泛型使用注意事项
	* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)  
	* 
      泛型的由来:	
  	早期的object类型可以接收任意的对象类型, 但是在是实际的使用中，会有类型转换的问题，存在隐患，所以java提供泛型来解决这个问题
*/


public class Generic01 {
	public static void main(String[] args) {
		demo01();
	}
	
	public static void demo01() {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("哈哈", 20));
		list.add(new Person("嗯嗯", 22));
		
		// 迭代
		Iterator<Person> it = list.iterator();
		
		// 获取下一个
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + "..." + p.getAge());
		}
	}
}
