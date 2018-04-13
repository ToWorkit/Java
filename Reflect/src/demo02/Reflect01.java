package demo02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reflect01 {
	public static void main(String[] args) throws Exception {
		// 创建榨汁机
		Juicer j = new Juicer();
//		j.run(new Apple());
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		// 获取该类的字节码文件
		Class cla = Class.forName(br.readLine());
		// 创建实例对象
		Fruit f = (Fruit) cla.newInstance();
		j.run(f);
	}
}

// 水果接口
interface Fruit {
	public void squeeze();
}


class Apple implements Fruit {
	@Override
	public void squeeze() {
		System.out.println("榨苹果汁");
	}
}

class Orange implements Fruit {
	@Override
	public void squeeze() {
		// TODO Auto-generated method stub
		System.out.print("榨橙汁");
	}
}


class Juicer {
	public void run(Apple a) {
		a.squeeze();
	}
	public void run(Fruit f) {
		f.squeeze();
	}
}