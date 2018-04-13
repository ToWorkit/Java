package demo02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reflect01 {
	public static void main(String[] args) throws Exception {
		// ����ե֭��
		Juicer j = new Juicer();
//		j.run(new Apple());
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		// ��ȡ������ֽ����ļ�
		Class cla = Class.forName(br.readLine());
		// ����ʵ������
		Fruit f = (Fruit) cla.newInstance();
		j.run(f);
	}
}

// ˮ���ӿ�
interface Fruit {
	public void squeeze();
}


class Apple implements Fruit {
	@Override
	public void squeeze() {
		System.out.println("եƻ��֭");
	}
}

class Orange implements Fruit {
	@Override
	public void squeeze() {
		// TODO Auto-generated method stub
		System.out.print("ե��֭");
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