package demo06;

import java.util.ArrayList;

/**
* A:泛型概述
* B:泛型好处
	* 提高安全性(将运行期的错误转换到编译期) 
	* 省去强转的麻烦
* C:泛型基本使用
	* <>中放的必须是引用数据类型 
* D:泛型使用注意事项
	* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)  
*/


public class Generic01 {
	public static void main(String[] args) {
		
	}
	
	public static void demo01() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("哈哈", 20));
	}
}
